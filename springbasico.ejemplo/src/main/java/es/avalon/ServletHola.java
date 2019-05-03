package es.avalon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class ServletHola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		
		contexto.register(RepositorioLibros.class);
		contexto.refresh();
		
		
		RepositorioLibros repL=contexto.getBean(RepositorioLibros.class);
		
		PrintWriter pw= response.getWriter();
		
		
		pw.println(repL.getLista());
	}

}
