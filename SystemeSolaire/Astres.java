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

// SystemeSolaire.setPenColor(Soleil.getCouleur());
        // SystemeSolaire.circle(1.25, -0.25, Soleil.getRayon()/10000000);
        // SystemeSolaire.setPenColor(Terre.getCouleur());
        // SystemeSolaire.circle(1.25+Terre.getDistSoleil()/5000, -0.25, Terre.getRayon()/1000000);
        // SystemeSolaire.setPenColor(Mars.getCouleur());
        // SystemeSolaire.circle(1.25+Mars.getDistSoleil()/5000, -0.25, Mars.getRayon()/1000000);
        // SystemeSolaire.setPenColor(Mercure.getCouleur());
        // SystemeSolaire.circle(1.25+Mercure.getDistSoleil()/5000, -0.25, Mercure.getRayon()/1000000);
        // SystemeSolaire.setPenColor(Jupiter.getCouleur());
        // SystemeSolaire.circle(1.25+Jupiter.getDistSoleil()/5000, -0.25, Jupiter.getRayon()/1000000);
        // SystemeSolaire.setPenColor(Venus.getCouleur());
        // SystemeSolaire.circle(1.25+Venus.getDistSoleil()/5000, -0.25, Venus.getRayon()/1000000);
        // SystemeSolaire.setPenColor(Saturne.getCouleur());
        // SystemeSolaire.circle(1.25+Saturne.getDistSoleil()/5000, -0.25, Saturne.getRayon()/1000000);
        // SystemeSolaire.setPenColor(Uranus.getCouleur());
        // SystemeSolaire.circle(1.25+Uranus.getDistSoleil()/5000, -0.25, Uranus.getRayon()/1000000);
        // SystemeSolaire.setPenColor(Neptune.getCouleur());
        // SystemeSolaire.circle(1.25+Neptune.getDistSoleil()/5000, -0.25, Neptune.getRayon()/1000000);
