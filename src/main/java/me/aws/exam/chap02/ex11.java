package me.aws.exam.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ex11 extends HttpServlet {
    //예제 2-11. HttpServlet 서브 클래스

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // parameter 해석
//        String name = req.getParameter("name");
//
//        // business logic 실행
//        process(name);
//
//        // response 구축
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        out.print("<html>");
//
//        // UI 부분
//        out.print("</html>");
//    }
//
//    private void process(String name){
//       // business logic
//    }
}
