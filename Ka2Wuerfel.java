/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MMoschkau
 */
@WebServlet(urlPatterns = {"/Ka2Wuerfel"})
public class Ka2Wuerfel extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String d1 = Integer.toString((int)((Math.random()*6)+1));
        String d2 = Integer.toString((int)((Math.random()*6)+1));
        
        out.println("<html> <body>"+ 
                "<h1 align=center>KBF Kapitel 2 - W&uumlrfelbecher</h1>" +
                "<p> Gew&uumlrfelt wurden: " + d1 + " und " + d2 + 
                "</body> </html>");
    }
}

