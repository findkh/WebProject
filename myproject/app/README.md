# <center>๐My Project</center>

# 220509 - Mybatis ํผ์์คํด์ค ํ๋ ์ ์ํฌ ๋์
## ํ๋ก์ ํธ์ Mybatis ๋ผ์ด๋ธ๋ฌ๋ฆฌ๋ฅผ ์ถ๊ฐํ๋ค.
  - Spring Boot ๊ตฌ์ฑ  
  - `implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2'`
  - ์์กด ๋ผ์ด๋ธ๋ฌ๋ฆฌ ๋ธ๋ก์์ `mybatis`๋ผ์ด๋ธ๋ฌ๋ฆฌ๋ฅผ ๋ฑ๋ก
  - `gradle eclipse`
---
# Lombok ์ ์ฉ
## lombok ๋ผ์ด๋ธ๋ฌ๋ฆฌ๋ฅผ ํ๋ก์ ํธ์ ์ถ๊ฐํ๋ค.
  - build.gradle์ lombok ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์ถ๊ฐ
  - `id "io.freefair.lombok" version "6.4.1"` ํ๋ฌ๊ทธ์ธ ์ถ๊ฐ
  - `java -jar lombok.jar` ํ์ผ ์คํํ์ฌ ์ดํด๋ฆฝ์ค IDE์ lombok ๊ธฐ๋ฅ ์ถ๊ฐ
  - ๋๋ฉ์ธ ํด๋์ค์ lombok์ ์ ์ฉ
---
# ํ์๊ฐ์, ๋ก๊ทธ์ธ, ๋ก๊ทธ์์ ์ ์ฉ
## ํ์ ํ์ด๋ธ์ ์ถ๊ฐํ๋ค.
  - db์ my_member ํ์ด๋ธ ์ถ๊ฐ
## ํ์ ๋ฐ์ดํฐ๋ฅผ ๋ค๋ฃฐ ๋๋ฉ์ธ ํด๋์ค, DAO ์ธํฐํ์ด์ค๋ฅผ ์ ์
  - domain.member ํด๋์ค ์ ์
  - insert, findAll, findByNo, get, update, delete ๋ฉ์๋ ์ถ๊ฐ
  - DAO๊ฐ ์ฌ์ฉํ  SQL Mapper ํ์ผ์ ์ถ๊ฐ
  - ํ์ด์ง ์ปจํธ๋กค๋ฌ ์ถ๊ฐ
## ๊ธฐ๋ณธ UI ์ ์ฉ ํ์๊ฐ์, ๋ก๊ทธ์ธ
  - /src/main/resources/static/member/signin.html, /src/main/resources/static/member/signup.html
## ๋ก๊ทธ์ธ ๊ธฐ๋ฅ์ ์ถ๊ฐ
  - `findByEmailAndPassword()`, `get()`, `signin()` ๋ฉ์๋ ์ถ๊ฐ
## ์๋จ ๋ฉ๋ด๋ฐ๋ฅผ ์ถ๊ฐ
  - /src/main/resources/static/index.html
## ๋ก๊ทธ์ธ ์ฌ์ฉ์ ์ ๋ณด๋ฅผ ์กฐํ
  - com.myproject.controller.ResultMap ํด๋์ค ์ถ๊ฐ
    - JSON ํ์์ ๋ฐ์ดํฐ๋ฅผ ๋ฆฌํดํ  ๋ ์ฌ์ฉํ  ํด๋์ค๋ก ์์ ์ฑ๊ณต ์ ๋ฌด์ ๊ฒฐ๊ณผ๋ฅผ ์ ์ฅ
  - com.myproject.Membercontroller์ `getLoginUser()` ๋ฉ์๋ ์ถ๊ฐ
    <img src="https://user-images.githubusercontent.com/89373222/167361427-a0908747-6c86-4e62-ad48-4066271cb109.png">
    <img src="https://user-images.githubusercontent.com/89373222/167362254-3e18ff24-da93-4c37-aceb-22a8cff81aaf.png">
## ๋ก๊ทธ์์ ๊ธฐ๋ฅ์ ์ถ๊ฐํ๋ค.
  - com.myproject.Membercontroller์ `signout()` ๋ฉ์๋ ์ถ๊ฐ
## ์ ๋ฆฌ
  - ํ์๊ฐ์  
  <img src="https://user-images.githubusercontent.com/89373222/167368566-42836249-b61b-48f4-a0b1-0c307ba83d09.png">
  <img src="https://user-images.githubusercontent.com/89373222/167368698-b70a0ede-2e8a-477a-8dd5-d3e9a6a5a9a0.png">
  - ๋ก๊ทธ์ธ ํ์ ๋ ์๋จ ๋ฉ๋ด๋ฐ  
  <img src="https://user-images.githubusercontent.com/89373222/167368932-96263ff8-25ba-43c5-926c-db9cae4729b9.png">
  - ๋ก๊ทธ์ธ ์ํ์ ๋ ์๋จ ๋ฉ๋ด๋ฐ  
  <img src="https://user-images.githubusercontent.com/89373222/167369137-5097dccb-81fa-4f23-84f5-cc43125dac0c.png">
---
# ๋ก๊ทธ์ธ๊ณผ ์ธ์์ ํ์ฉํ์ฌ ์ฌ์ฉ์๋ฅผ ๊ตฌ๋ถํ์ฌ ๋ฐ์ดํฐ ์ฒ๋ฆฌ
  - ๊ฒ์๊ธ ํ์ด๋ธ์ ์์ฑ์ ์ ๋ณด๋ฅผ ์ถ๊ฐ
    ```
    delete from my_board;
    alter table my_board
      add column writer int not null,
      add constraint my_board_fk foreign key (writer) references my_member(no);
    ```
   - ๋๋ฉ์ธ ํด๋์ค ๋ณ๊ฒฝ
   - ๊ฒ์๊ธ ๋ฐ์ดํฐ๋ฅผ ๋ค๋ฃฐ ๋ ์์ฑ์ ๋ฒํธ๋ ํจ๊ป ๋ค๋ฃฌ๋ค.(myBoardDao.xml ๋ณ๊ฒฝ)
   - ๊ฒ์๊ธ ์๋ ฅํ  ๋ ๋ก๊ทธ์ธ ์ฌ์ฉ์ ๋ฒํธ๋ฅผ ์ถ๊ฐํ๋ค.
    - com.myproject.myBoardcontroller `add(), update(), delete()` ๋ฉ์๋ ๋ณ๊ฒฝ
    - myBoardService, DefaultMyBoardService๋ณ๊ฒฝ, myboardDao๋ณ๊ฒฝ
   - ๊ฒ์๊ธ ์กฐํํ  ๋ ๋ก๊ทธ์ธ ์ฌ์ฉ์์ ์ด๋ฆ์ ํจ๊ป ์ ๊ณต
    - writer ํ๋์ ํ์์ int ๋์ ์ Member ํด๋์ค๋ก ๊ต์ฒด
    - com.myproject.myBoardcontroller ๋ณ๊ฒฝ

  - ๊ฒ์๊ธ ์๋ ฅ ํ๋ฉด ๋ณ๊ฒฝ
    - myboard/form.html ๋ณ๊ฒฝ
    - myboard/index.html ๋ณ๊ฒฝ
    - myboard.view.html ๋ณ๊ฒฝ
---
# 220510 - ํ์ผ ์์ถ๋ ฅ
## ํ์ ๊ฐ์ํ  ๋ ํ๋กํ ์ฌ์ง๊ณผ ๊ฒ์ํ์ ์ฌ์ง์ ์ฌ๋ฆด ์ ์๊ฒ ๋ง๋ ๋ค.
  - DB์ ์ปฌ๋ผ์ ์ถ๊ฐํ๋ค.
      ```
      alter table my_member
        add column photo varchar(255);
      alter table my_board
        add column photo varchar(255);
      ```
  - ๋๋ฉ์ธ ํด๋์ค ์์ ํ๋ค.
  - SQL Mapper ํ์ผ ์์ ํ๋ค.
    - xml ํ์ผ ๋ณ๊ฒฝํจ
      - resultMap ํ๊ทธ์ ์ปฌ๋ผ ๋งคํ ์ ๋ณด ์ถ๊ฐํ๊ณ  SQL๋ฌธ์๋ ์ถ๊ฐํ๋ค.
  - ์ฌ์ง ํ์ผ ์๋ก๋ ๊ธฐ๋ฅ์ page Controller์ ์ถ๊ฐํ๋ค.
      - add(), update() ๋ฉ์๋์ ํ์ผ ์๋ก๋ ๊ธฐ๋ฅ ์ถ๊ฐ
      - URL ๊ฒฝ๋ก์์ ์ง์ ํ ํ์ผ์ ์ฐพ์ ํด๋ผ์ด์ธํธ์๊ฒ ์ ์กํ๋ photo() ๋ฉ์๋ ์ถ๊ฐ
  - ํ๋ก ํธ์๋ ์์ 
    - input ํ๊ทธ ์ถ๊ฐ ํ POST ์์ฒญ์ผ๋ก ํ์ผ์ ์๋ก๋ํ๋ค.
    - ๊ฒ์ํ ํ์ผ ์ ๋๋ก ์๋ก๋ ๋ ๊ฒ ํ์ธํจ!
      <img src="https://user-images.githubusercontent.com/89373222/167575129-86cd02cf-f826-4357-a640-8d2a19f7886c.png">
      <img src="https://user-images.githubusercontent.com/89373222/167575294-bdbd597f-e398-4001-a22a-55ba8005f84b.png">
      <img src="https://user-images.githubusercontent.com/89373222/167575472-e22748c7-c35d-4e44-9cb9-545f9d326b36.png">
  - ์ธ๋ค์ผ ์ด๋ฏธ์ง ์ ์ฉํด์ ๋ก๊ทธ์ธ ์ ํ๋กํ ์ฌ์ง ๋ณด์ด๊ฒ ํ๊ธฐ ์ฌ์ง์ด ์์ ๊ฒฝ์ฐ ๊ธฐ๋ณธ ์ด๋ฏธ์ง ๋์ค๊ฒ ํ๋ค.
    - https://github.com/coobird/thumbnailator
    - search.maven.org ๊ฐ์ ๋ค์ด๋ก๋ ๋ฐ๊ธฐ build script ํ์ผ์ ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์ถ๊ฐํ๋ค.
    - ์๋ก๋ ํ์ผ์ ์ ์ฅํ ํ ํด๋น ํ์ผ์ ์ธ๋ค์ผ ์ด๋ฏธ์ง ํ์ผ์ ์์ฑํ๋ค.
    - ํ๋ก ํธ์ค๋ ์์ 
    - updateํ  ๋ ์ฌ์ง์ ์ ์ธํ๊ณ  updateํ  ๋๋ฅผ ๋๋นํ์ฌ ๋์  SQL ๊ธฐ๋ฅ ์ถ๊ฐ
      <img src="https://user-images.githubusercontent.com/89373222/167644513-b7f987a1-5150-45e0-9da8-16a93eeff6b5.png">  
      ์์ฑํ ๊ธ ๋ด์ ์ฌ์ง ๋ณด๊ธฐ
      <img src="https://user-images.githubusercontent.com/89373222/167644770-6f8b29a7-b0c7-4568-91f3-10834a8700f6.png">  
      ํ๋กํ ์ฌ์ง ์ธ๋ค์ผ ์ด๋ฏธ์ง ์ ์ฉํ๊ธฐ
---
# 220511 - Header์ Footer์ ๋ถํธ์คํธ๋ฉ ์ ์ฉ
## UI ์์ 
  - npm ์ ์ฉํ๊ธฐ
    - `npm init`์ ์คํํ์ฌ package.json ์ค์  ํ์ผ์ ์ค๋นํ๋ค.
    - .gitignore ์์ 
    - `npm install bootstrap` ์คํํ์ฌ ๋ถํธ์คํธ๋ฉ์ ์ถ๊ฐํ๋ค.
  - bootstrap์ ์ ์ฉํ์ฌ header์ footer๋ฅผ ๋ง๋ ๋ค.
    - CSS ์ ์ฉ
  - ํ๋ก์ ํธ ๋ ์ฌ์ฉํ์ง ์์๋ bootstrap icons ์ ์ฉ
  - ๊ฒฐ๊ณผ
    <img src="https://user-images.githubusercontent.com/89373222/167767672-6029cb1a-9bec-476c-9ecc-b859fa3f52ff.png">
---
# ํ์ด์ค๋ถ ๋ก๊ทธ์ธ
  - http://developers.facebook.com ์ฑ ๋ฑ๋ก
  - ํ๋ก ํธ ์์
  - ๋ฐฑ์๋ ์์
    - page Controller fbSingIn() method ์ถ๊ฐ
      - ํ์ด์ค๋ถ ์๋ฒ์ ํ ํฐ์ ๋ณด๋ด๊ณ  ์ฌ์ฉ์ ์ ๋ณด๋ฅผ ๋ฐ์์ค๋ ๋ฉ์๋๋ฅผ ์ถ๊ฐํ๋ค.
    - service, defaultservice, dao, xml ๋ณ๊ฒฝ
  - ๊ฒฐ๊ณผ
    <img src="https://user-images.githubusercontent.com/89373222/167832245-e39a28ec-2c90-48dc-a16c-6c6f6bd9e8ac.png">
    ์ ํ์ ๋ก๊ทธ์ธ  
    <img src="https://user-images.githubusercontent.com/89373222/167832412-74fb5244-19c4-4687-8419-ce811ac2db0f.png">
    ๊ธฐ์กด ํ์ ๋ก๊ทธ์ธ  
---
# ๋ก๊ทธ์ธ ํ์ด์ง ๋ถํธ์คํธ๋ฉ ์ ์ฉ
  - ๊ฒฐ๊ณผ  
    <img src="https://user-images.githubusercontent.com/89373222/167880320-9c17be46-f9dd-4843-967e-5cf6596cda53.png" width="500" height="400">
---
# 220512 - ์ฟ ํค ํ์ฉ ๋ก๊ทธ์ธ Email ๊ธฐ์ตํ๊ธฐ
  - ์ฟ ํค๋ฅผ ๊บผ๋ด๋ js-cookie ๋ผ์ด๋ธ๋ฌ๋ฆฌ ์ค์น
    - `npm i js-cookie`
---
# UI ๋ ์ด์์
## ํค๋์ ํธํฐ ๋ถ๋ฆฌํ๊ธฐ, ํ์๊ฐ์ํผ, myboard ๋ถํธ์คํธ๋ฉ ์ ์ฉ
  - ์คํ ์ ๋ฆฌ
  - ํค๋, ํธํฐ ๋ถ๋ฆฌํ์ฌ border, main index, ๋ก๊ทธ์ธ ํ์๊ฐ์์ ๋ฃ๊ธฐ
  - js, css ํ์ผ ๋ถ๋ฆฌ  
    <img src = "https://user-images.githubusercontent.com/89373222/168055280-264d4db6-e958-4697-8025-6438810639e2.png" width="500" height="400"/>
    <img src = "https://user-images.githubusercontent.com/89373222/168095324-e1cef8bc-8c25-4aaa-89da-2811b2b1b381.png" width="600" height="400">
---
## Handlebars ์ ์ฉ
  - `npm i handlebars` npm ์ค์น
  - Handlebars๋ฅผ ์ฌ์ฉํด์ ๋์ ์ผ๋ก border ๋ฆฌ์คํธ๋ฅผ ๋ถ๋ฌ์จ๋ค.
---
# 20220513 - UI ๋ ์ด์์ 
## myboard ๋ถํธ์คํธ๋ฉ ์ ์ฉ
  - ๋ฒ๊ทธ ์์ 
  - view.html ์์ 
---
# ์ธํฐ์ํฐ ์ ์ฉ
## ์ธํฐ์ํฐ ์ ๋ฆฌ
  - ์ด๋ก  : https://blog.naver.com/watermoon14/222731154745
  - AuthInterceptor ํด๋์ค ์ ์
  - ์คํ๋ง๋ถํธ์ ์ธํฐ์ํฐ ๋ฑ๋ก
    - confํด๋ ๋ฐ์ MvcConfigration ํด๋์ค ์ ์
---
# log4j ์ ์ฉ
## log4j ์ ๋ฆฌ
  - ์ด๋ก  : https://blog.naver.com/watermoon14/222731395408
  - ์ ์ฉ์๋ฃ 
---
# 20220515 - ํ์ด์ง
## ๋ฐฑ์๋ myboard ํ์ด์ง์ฒ๋ฆฌ ํ log4j2 ์ถ๋ ฅ๋ฌธ ์์ 
  - Controller์ paging ์ฒ๋ฆฌํจ
    - size() ๋ฉ์๋ ์ถ๊ฐ
    - sql์ offset๊ณผ rowCount ์ถ๊ฐ
  - log4j2 ์ถ๋ ฅ๋ฌธ ์์ 
    <img src="https://user-images.githubusercontent.com/89373222/168474219-c99bc96f-c598-4a37-abfb-2c39b5aef938.png">
      - ๋ก๊ทธ๊ฐ 2๋ฒ์ฉ ์ถ๋ ฅ๋จ 
      - ๋ก๊ฑฐ๋ ์์์ ๋ชจ๋  ๋ก๊ฑฐ๊ฐ ์ถ๋ ฅ๋๊ธฐ ๋๋ฌธ์ root ๋ก๊ฑฐ์ jdbc.sqlonly ๋ก๊ฑฐ ๋๊ฐ๊ฐ ๋๊ฐ์ด ์ถ๋ ฅ๋๋ค.  
      - ์์  : additivity ์์ฑ์ false๋ก ํ๋ฉด ์์ ๋ก๊ฑฐ๋ฅผ ์ฐพ์ง ์์ ๋ก๊ทธ๊ฐ 1๊ฐ๋ง ์ถ๋ ฅ๋๋ค.
---
# 20220516 - ํ์ด์ง
## ํ๋ก ํธ์๋ myboard ํ์ด์ง์ฒ๋ฆฌ
  - fetch() ์ฌ์ฉ  
  - ํํ๋ก์ ํธ๋ ๋ฉ์๋ ํ์ฉ์ ๋ชปํ์๋๋ฐ, ๊ฐ์ธ ํ๋ก์ ํธ์์๋ ๋ฉ์๋๋ฅผ ํ์ฉํจ
    - preNoLiDisplay(), nextNoLiDisplay()
## ํ๋ก ํธ์๋ ์ ๋ฆฌ
  - ์ ๋ ฌ ๋ง์ถค
  - ๊ฒ์๊ธ ์์ฑ์๊ฐ ์๋๋ฉด ์์ , ์ญ์  ๋ฒํผ์ด ๋ณด์ด์ง ์๊ฒ ํจ
  
