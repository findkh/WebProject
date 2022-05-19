package com.hyun.myproject2.web.myboard;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hyun.myproject2.domain.Member;
import com.hyun.myproject2.domain.myBoard;
import com.hyun.myproject2.service.myBoardService;

@SuppressWarnings("serial")
@WebServlet("/myboard/update") 
public class myBoardUpdateServlet extends HttpServlet { //추상 클래스를 상속받는다.

  myBoardService myboardService;

  @Override
  public void init() throws ServletException {
    //myBoardService 객체를 웹 애플리케이션 보관소에서 꺼낸다.
    ServletContext 웹애플리케이션보관소 = this.getServletContext();
    myboardService = (myBoardService) 웹애플리케이션보관소.getAttribute("myboardService");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    // 클라이언트가 보낸 문자열이 UTF-8로 인코딩 되어 있음을 설정한다.
    // 이 설정이 된 후에 getParameter() 호출해야만 한다.
    // 그래야만 UTF-8 한글이 UTF-16 한글이 온전히 변환될 수 있다.
    req.setCharacterEncoding("UTF-8");

    myBoard myboard = new myBoard();

    myboard.setNo(Integer.parseInt(req.getParameter("no")));
    myboard.setTitle(req.getParameter("title"));
    myboard.setContent(req.getParameter("content"));

    Member loginUser = (Member)req.getSession().getAttribute("loginUser");
    myboard.setWriter(loginUser);

    myboardService.update(myboard);
    System.out.println(myboardService.update(myboard));

    resp.sendRedirect("list"); //게시물 목록 페이지를 다시 요청하라고 클라이언트에게 명령한다.

  }
}
