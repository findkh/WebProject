package com.review.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.review.dao.ContactDao;
import com.review.domain.Contact;
import com.review.domain.ContactTel;

//@Service
public class NonTransactionContactService {
  @Autowired
  ContactDao contactDao;

  public int add(Contact contact) {
    contactDao.insert(contact);
    for(ContactTel tel : contact.getTels()) {
      tel.setContactNo(contact.getNo()); //전화번호 입력 전에 자동 생성된 연락처 번호를 설정한다.
      contactDao.insertTel(tel);
    }
    return 1;
  }

  public List<Contact> list() {
    List<Contact> contacts = contactDao.findAll();
    for (Contact contact : contacts) {
      contact.setTels(contactDao.findTelByContactNo(contact.getNo())); 
    }
    return contacts;
  }

  public Contact get(int no) {
    Contact contact = contactDao.findByNo(no);
    if (contact != null) {
      contact.setTels(contactDao.findTelByContactNo(no));
    }
    return contact;
  }

  public int update(Contact contact) {
    int count =  contactDao.update(contact);
    if (count > 0) {
      contactDao.deleteTelByContactNo(contact.getNo()); //전화번호 변경 전에 기존 전화번호를 모두 삭제한다.
      for(ContactTel tel : contact.getTels()) {
        contactDao.insertTel(tel); //전화번호 객체 안에 이미 연락처 번호가 저장되어 있다.
      }
    }
    return count;
  }

  public int delete(int no) {
    contactDao.deleteTelByContactNo(no);
    return contactDao.delete(no);
  }
}
