package com.hyun.myproject2.web.myboard;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hyun.myproject2.domain.myBoard;
import com.hyun.myproject2.service.myBoardService;

@SuppressWarnings("serial")
@WebServlet("/myboard/list") 
public class myBoardListServlet extends HttpServlet { //추상 클래스를 상속받는다.

  myBoardService myboardService;

  @Override
  public void init() throws ServletException {
    //myBoardService 객체를 웹 애플리케이션 보관소에서 꺼낸다.
    ServletContext 웹애플리케이션보관소 = this.getServletContext();
    myboardService = (myBoardService) 웹애플리케이션보관소.getAttribute("myboardService");
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    resp.setContentType("text/html;charset=UTF-8");
    PrintWriter out = resp.getWriter();


    out.println("<!DOCTYPE html>");
    out.println("<html lang=\"en\">");
    out.println("<head>");
    out.println("<meta charset=\"UTF-8\">");
    out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
    out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>");
    out.println("<link href=\"/css/header.css\" rel=\"stylesheet\">");
    out.println("<link href=\"/css/footer.css\" rel=\"stylesheet\">");
    out.println("<link href=\"/css/myboardindex.css\" rel=\"stylesheet\">");
    out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css\">");
    out.println("<title>My board</title>");
    out.println("</head>");

    out.println("<body>");
    out.println("<div id=\"header\">");


    out.println("<div id=\"header\">");
    out.println("<nav class=\"navbar fixed-top navbar-expand-lg\">");
    out.println("<div class=\"inner\">");
    out.println("<a class=\"navbar-brand\" href=\"/main/index.html\">My Project</a>");
    out.println("<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">");
    out.println("<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">");
    out.println("<li class=\"nav-item\">");
    out.println("<a class=\"nav-link active\" aria-current=\"page\" href=\"/main/index.html\" style=\"color:white; font-size: 18px;\">Home</a>");
    out.println("</li>");
    out.println("<li class=\"nav-item dropdown\">");
    out.println("<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" style=\"color:white; font-size: 18px;\">");
    out.println("Project List");
    out.println("</a>");
    out.println("<ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\"  style=\"margin-top: 10px;\">");
    out.println("<li><a class=\"dropdown-item\" href=\"/myboard/index.html\">Board</a></li>");
    out.println("</ul>");
    out.println("</li>");
    out.println("</ul>");
    out.println("</div>");
    out.println("<div class=\"loginmenuDiv\">");
    out.println("<ul class=\"menu\">");
    out.println("<li class=\"notLogin-Menu\"><button id=\"loginBtn\" type=\"button\" class=\"btn btn-outline-light notLogin\">Signin</button></li>");
    out.println("<li class=\"notLogin-Menu\"><button id=\"signupBtn\" type=\"button\" class=\"btn btn-outline-light notLogin\">Signup</button></li>");
    out.println("<li class=\"login-Menu\"><div id=\"profile\"></div></li>");
    out.println("<li class=\"login-Menu\"><div id=\"userNameDiv\"><span id=\"userName\" class=\"login\"></span></div></li>");
    out.println("<li class=\"login-Menu\"><button id=\"logoutBtn\" type=\"button\" class=\"btn btn-outline-light login\">Logout</button></li>");
    out.println("</ul>");
    out.println("</div>");
    out.println("</div>");
    out.println("</nav>");
    out.println("</div>");
    out.println("</div>");

    out.println("<div class=\"content\">");
    out.println("<div class=\"contentInner\">");
    out.println("<table class=\"table table-hover table-sm\" id=\"boardTable\">");
    out.println("<thead class=\"table-light\">");
    out.println("<tr>");
    out.println("<th scope=\"col\" width=\"50px\">#</th>");
    out.println("<th scope=\"col\" width=\"400px\">Title</th>");
    out.println("<th scope=\"col\" width=\"100px\">Writer</th>");
    out.println("<th scope=\"col\" width=\"80px\">ViewCount</th>");
    out.println("<th scope=\"col\" width=\"100px\">Date</th>");
    out.println("</tr>");
    out.println("</thead>");
    out.println("<tbody style=\"border: white\">");

    List<myBoard> boards = myboardService.list();
    for (myBoard board : boards) {
      out.println("<tr>");
      out.printf("<td>%d</td>\n", board.getNo());
      out.printf("<td><a href='detail?no=%d'>%s</td>\n", board.getNo(), board.getTitle());
      out.printf("<td>%s</td>\n", board.getWriter().getName());
      out.printf("<td>%d</td>\n", board.getViewCount());
      out.printf("<td>%s</td>\n", board.getCreatedDate());
      out.println("</tr>");
    }

    out.println("</tbody>");
    out.println("</table>");

    out.println("<div class=\"btnDiv\">");
    out.println("<button id=\"createBtn\" type=\"button\" class=\"btn btn-success\">Add</button>");
    out.println("</div>");

    out.println("</div>");
    out.println("</div>");

    out.println("<div id=\"footer\">");
    out.println("<div id=\"footer navbar-fixed-bottom\">");
    out.println("<nav class=\"navbar fixed-bottom navbar-expand-lg footerNavbar\">");
    out.println("<div class=\"footerNavbarinner\">");
    out.println("<div class=\"footerContent\">");
    out.println("<span style=\"color:white\">");
    out.println("<a href=\"https://github.com/findkh\" data-bs-toggle=\"tooltip\" data-bs-placement=\"top\" title=\"Github로 이동합니다\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"25\" height=\"25\" fill=\"currentColor\" class=\"bi bi-github\" viewBox=\"0 0 16 16\">");
    out.println("<path d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.012 8.012 0 0 0 16 8c0-4.42-3.58-8-8-8z\"/>");
    out.println("</svg></a>");
    out.println("<a href=\"https://blog.naver.com/watermoon14\" data-bs-toggle=\"tooltip\" data-bs-placement=\"top\" title=\"블로그로 이동합니다\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"25\" height=\"25\" fill=\"currentColor\" class=\"bi bi-journals\" viewBox=\"0 0 16 16\">");
    out.println("<path d=\"M5 0h8a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2 2 2 0 0 1-2 2H3a2 2 0 0 1-2-2h1a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1H3a1 1 0 0 0-1 1H1a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v9a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H5a1 1 0 0 0-1 1H3a2 2 0 0 1 2-2z\"/>");
    out.println("<path d=\"M1 6v-.5a.5.5 0 0 1 1 0V6h.5a.5.5 0 0 1 0 1h-2a.5.5 0 0 1 0-1H1zm0 3v-.5a.5.5 0 0 1 1 0V9h.5a.5.5 0 0 1 0 1h-2a.5.5 0 0 1 0-1H1zm0 2.5v.5H.5a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1H2v-.5a.5.5 0 0 0-1 0z\"/>");
    out.println("</svg></a>");
    out.println("</span><br>");
    out.println("<span style=\"color:white; font-size: small;\">Copyright 2022. ParkKyounghyun</span>");
    out.println("</div>");
    out.println("</div>");
    out.println("</nav>");
    out.println("</div>");

    out.println("</div>");
    out.println("<script>");
    out.println("document.querySelector('#createBtn').onclick = () => {");
    out.println("  location.href ='add';");
    out.println("}");
    out.println("</script>");

    out.println("</body>");
    out.println("</html>");


  }
}
