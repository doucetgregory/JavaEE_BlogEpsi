package fr.epsi.blog.listener;

import fr.epsi.blog.beans.Blog;
import fr.epsi.blog.beans.Utilisateur;
import fr.epsi.blog.dao.IBlogDao;
import fr.epsi.blog.dao.mockImpl.MockBlogDao;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
//import java.util.logging.log4j.LogManager;

/**
 * Ecouteur du cycle de vie de l'application
 */
@WebListener
public class StartupListener implements ServletContextListener {

    //private static final logger = LogManager.getLogger(StartupListener.class);

    /**
     * Constructeur par défaut
     */
    public StartupListener() {

    }

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Démarrage de l'application");

        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Creation class org.hsqldb.jdbcDriver failed");
        }
        try {
            Connection connexion = DriverManager.getConnection("jdbc:hsqldb:file://localhost:9003","SA","");
            System.out.println("Connexion bdd reussie !");
            //logger.error("Connexio  ok sur localhost");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connexion bdd échouée");
            //logger.error("Error While connecting to DB", e);
        }

        IBlogDao blogDao = new MockBlogDao();
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setEmail("contact@aquasys.fr");
        List<Blog> listBlog = blogDao.getBlogs(utilisateur);
        System.out.println("Nombre de blogs : " + listBlog.size());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
