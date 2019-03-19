package fr.epsi.blog.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Registry")
public class RegistryServlet extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistryServlet() {}

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     * @param request
     * @param response
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.sendRedirect("registry.html");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        String email = request.getParameter("user_email");
        String password = request.getParameter("user_mdp");

        System.out.println("Email : " + email + "  |  Password : " + password);

    }

}
