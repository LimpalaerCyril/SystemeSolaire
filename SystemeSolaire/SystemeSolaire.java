package SystemeSolaire;

import SystemeSolaire.Draw;
import java.awt.Color;


public class SystemeSolaire {
    
    public static final Color BROWN = new Color(91, 60, 17);
    public static final Color VENUS = new Color(91, 20, 20);

    public static void main(String[] args) {

        Astres Soleil = new Astres("Soleil", 0, 0.00, 30000.00, Color.ORANGE);
        Astres Terre = new Astres("Terre", 365, 15.00, 6371.00, Color.BLUE );
        Astres Mars = new Astres("Mars", 687, 20.00, 3390.00, Color.RED);
        Astres Mercure = new Astres("Mercure", 88, 5.00, 2440.00, Color.GRAY);
        Astres Jupiter = new Astres("Jupiter", 4333, 25.00, 69911.00, BROWN);
        Astres Venus = new Astres("Venus", 224, 10.00, 10.00, VENUS);
        Astres Saturne = new Astres("Saturne", 10759, 30.00, 58232.00, Color.YELLOW);
        Astres Uranus = new Astres("Uranus", 30685, 35.00, 25362.00, Color.LIGHT_GRAY);
        Astres Neptune = new Astres("Neptune", 60266, 40.00, 50622.00, Color.MAGENTA);

        Draw SystemeSolaire = new Draw("SystemeSolaire");

        SystemeSolaire.setPenColor(Color.lightGray);
        SystemeSolaire.circle(0.5, 0.5, Terre.getDistSoleil()/100);
        SystemeSolaire.circle(0.5, 0.5, Mars.getDistSoleil()/100);
        SystemeSolaire.circle(0.5, 0.5, Mercure.getDistSoleil()/100);
        SystemeSolaire.circle(0.5, 0.5, Jupiter.getDistSoleil()/100);
        SystemeSolaire.circle(0.5, 0.5, Venus.getDistSoleil()/100);
        SystemeSolaire.circle(0.5, 0.5, Saturne.getDistSoleil()/100);
        SystemeSolaire.circle(0.5, 0.5, Uranus.getDistSoleil()/100);
        SystemeSolaire.circle(0.5, 0.5, Neptune.getDistSoleil()/100);
        
        SystemeSolaire.setPenColor(Soleil.getCouleur());
        SystemeSolaire.circle(0.5, 0.5, Soleil.getRayon()/100);
        SystemeSolaire.setPenColor(Terre.getCouleur());
        SystemeSolaire.circle(0.5+Terre.getDistSoleil()/100, 0.5, Terre.getRayon()/100);
        SystemeSolaire.setPenColor(Mars.getCouleur());
        SystemeSolaire.circle(0.5+Mars.getDistSoleil()/100, 0.5, Mars.getRayon()/100);
        SystemeSolaire.setPenColor(Mercure.getCouleur());
        SystemeSolaire.circle(0.5+Mercure.getDistSoleil()/100, 0.5, Mercure.getRayon()/100);
        SystemeSolaire.setPenColor(Jupiter.getCouleur());
        SystemeSolaire.circle(0.5+Jupiter.getDistSoleil()/100, 0.5, Jupiter.getRayon()/100);
        SystemeSolaire.setPenColor(Venus.getCouleur());
        SystemeSolaire.circle(0.5+Venus.getDistSoleil()/100, 0.5, Venus.getRayon()/100);
        SystemeSolaire.setPenColor(Saturne.getCouleur());
        SystemeSolaire.circle(0.5+Saturne.getDistSoleil()/100, 0.5, Saturne.getRayon()/100);
        SystemeSolaire.setPenColor(Uranus.getCouleur());
        SystemeSolaire.circle(0.5+Uranus.getDistSoleil()/100, 0.5, Uranus.getRayon()/100);
        SystemeSolaire.setPenColor(Neptune.getCouleur());
        SystemeSolaire.circle(0.5+Neptune.getDistSoleil()/100, 0.5, Neptune.getRayon()/100);

        
        
    }
}
