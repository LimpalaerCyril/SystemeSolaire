package SystemeSolaire;

import java.awt.Color;

public class Astres{
    
    private String nom;
    private int revoDuree; // en jour
    private Double distSoleil; // en millions de kilomètres
    private Double rayon; // rayon en kilomètre
    private Color couleur;

    public Astres(String nom, int revoDuree, Double distSoleil, Double rayon, Color couleur) {
        this.nom = nom;
        this.revoDuree = revoDuree;
        this.distSoleil = distSoleil;
        this.rayon = 1.00;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getRevoDuree() {
        return revoDuree;
    }

    public void setRevoDuree(int revoDuree) {
        this.revoDuree = revoDuree;
    }

    public Double getDistSoleil() {
        return distSoleil;
    }

    public void setDistSoleil(Double distSoleil) {
        this.distSoleil = distSoleil;
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    
    
}