package fr.epsi.blog.servlets;

import fr.epsi.blog.beans.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Auth")
public class AuthentificationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        String userNameDefault = "Gregory";
        String userMdpDefault = "1234";

        String userName = request.getParameter("user_name");
        String userMdp = request.getParameter("user_mdp");

        if (userName.toLowerCase().equals(userNameDefault.toLowerCase()) && userMdp.equals(userMdpDefault)) {
            Utilisateur user = new Utilisateur("doucet@douc.fr", userName, userMdp);
            try {
                request.getRequestDispatcher("index.jsp").forward(request, response);

                // il ne reste plus qu'à envoyer l'objet dans la page et générer le html avec les données de l'objet

            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Mauvais identifiants !");
        }

        //response.getWriter().append("Connexion réussi ! Données suivantes :").append(request.)

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     * @param request
     * @param response
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Fonctionne !!!");
    }

}
