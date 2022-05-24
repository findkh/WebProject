package com.hyun.myproject2.controller.myboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hyun.myproject2.controller.Component;
import com.hyun.myproject2.controller.RequestMapping;
import com.hyun.myproject2.domain.Member;
import com.hyun.myproject2.domain.myBoard;
import com.hyun.myproject2.service.myBoardService;

@Component("/myboard/add")
public class myBoardAddController {

  myBoardService myboardService;

  public myBoardAddController(myBoardService myboardService)  {
    this.myboardService = myboardService;
  }

  @RequestMapping
  public String add(HttpServletRequest request, HttpServletResponse response) throws Exception{
    if (request.getMethod().equals("GET")) {
      return "/jsp/myboard/form.jsp";

    } else {
      myBoard myboard = new myBoard();
      myboard.setTitle(request.getParameter("title"));
      myboard.setContent(request.getParameter("content"));

      Member loginUser = (Member) request.getSession().getAttribute("loginUser");
      myboard.setWriter(loginUser);

      myboardService.add(myboard);

      return "redirect:list";
    }
  }


}
