package fr.epsi.blog.dao;

import java.sql.SQLException;

import fr.epsi.blog.beans.Utilisateur;

public interface IUtilisateurDao {

	Utilisateur getUtilisateur(String email);
	void createUtilisateur(Utilisateur utilisateur) throws SQLException;
	void updateUtilisateur(Utilisateur utilisateur) throws SQLException;
	void deleteUtilisateur(Utilisateur utilisateur) throws SQLException;
	
}
