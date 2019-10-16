/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetok;

/**
 *
 * @author TEDDY
 */
public class Utilisateur {

    public int getId_utilisteur() {
        return id_utilisteur;
    }

    public void setId_utilisteur(int id_utilisteur) {
        this.id_utilisteur = id_utilisteur;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getPrenom_utilisateur() {
        return prenom_utilisateur;
    }

    public void setPrenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

    public String getPassword_utilisteur() {
        return password_utilisteur;
    }

    public void setPassword_utilisteur(String password_utilisteur) {
        this.password_utilisteur = password_utilisteur;
    }
    
  private int id_utilisteur;
  private String nom_utilisateur;
  private String prenom_utilisateur;
  private String password_utilisteur;  
}
