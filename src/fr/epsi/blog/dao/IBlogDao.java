package fr.epsi.blog.dao;

import java.sql.SQLException;
import java.util.List;

import fr.epsi.blog.beans.Blog;
import fr.epsi.blog.beans.Reponse;
import fr.epsi.blog.beans.Utilisateur;

public interface IBlogDao {

	Blog getBlog(Integer id);
	List<Blog> getBlogs(Utilisateur utilisateur);
	Integer createBlog(Blog blog) throws SQLException;
	void updateBlog(Blog blog) throws SQLException;
	void deleteBlog(Blog blog) throws SQLException;
	void addReponse(Blog blog, Reponse reponse) throws SQLException;
	
}
