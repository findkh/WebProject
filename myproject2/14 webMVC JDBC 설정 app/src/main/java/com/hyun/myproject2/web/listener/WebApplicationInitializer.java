package com.hyun.myproject2.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import com.hyun.myproject2.conf.AppConfig;

@WebListener
public class WebApplicationInitializer implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {

    //1. DispatcherServlet이 사용할 의존 객체(페이지 컨트롤러, 서비스, DAO 등)를 관리(생성~소멸)하는 beans container(IoC container) 준비
    AnnotationConfigWebApplicationContext 객체관리자 = new AnnotationConfigWebApplicationContext();
    객체관리자.register(AppConfig.class); // 객체 생성에 대한 설정 정보를 담은 자바 클래스를 지정한다.

    //2. Spring WebMVC에서 제공해주는 프론트 컨트롤러를 서블릿 컨테이너(톰캣 서버)에 등록한다.
    //   -> 프론트 컨트롤러를 생성한다.
    //      프론트 컨트롤러가 사용할 객체 관리자를 지정한다.
    DispatcherServlet 프론트컨트롤러 = new DispatcherServlet(객체관리자); 

    // ServletContext를 통해 프론트 컨트롤러를 등록한다.
    ServletRegistration.Dynamic registration = sce.getServletContext().addServlet("app", 프론트컨트롤러);

    // 서버에 등록한 프론트 컨트롤러의 동작을 상세히 설정한다.
    registration.setLoadOnStartup(1); //웹 애플리케이션이 시작될 때 프론트 컨트롤러를 자동 생성하라는 의미
    registration.addMapping("/app/*"); // 클라이언트에서 /app/* 요청이 들어 왔을 때 프론트 컨트롤러에게 전달하라는 의미
  }


}
