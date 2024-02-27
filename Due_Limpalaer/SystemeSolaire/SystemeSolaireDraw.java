package SystemeSolaire;

import java.awt.Color;


public class SystemeSolaireDraw {
    
    public static final Color BROWN = new Color(91, 60, 17);
    public static final Color VENUS = new Color(91, 20, 20);

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

    final Double AngleParJourTerre = (2*Math.PI)/365;
    final Double AngleParJourMars = (2*Math.PI)/687;
    final Double AngleParJourMercure = (2*Math.PI)/88;
    final Double AngleParJourJupiter = (2*Math.PI)/4333;
    final Double AngleParJourVenus = (2*Math.PI)/224;
    final Double AngleParJourSaturne = (2*Math.PI)/10759;
    final Double AngleParJourUranus = (2*Math.PI)/30685;
    final Double AngleParJourNeptune = (2*Math.PI)/60266;
    
    Double jour=0.00;

    Double AngleTerre = AngleParJourTerre;
    Double AngleMars = AngleParJourMars;
    Double AngleMercure = AngleParJourMercure;
    Double AngleJupiter = AngleParJourJupiter;
    Double AngleVenus = AngleParJourVenus;
    Double AngleSaturne = AngleParJourSaturne;
    Double AngleUranus = AngleParJourUranus;
    Double AngleNeptune = AngleParJourNeptune;

    

    public void ExecSysteme() {

                SystemeSolaire.enableDoubleBuffering();
                Double XTerre =(0.5 + Terre.getDistSoleil()/100 * Math.cos(360-(360-AngleTerre)));
                Double YTerre =(0.5 + Terre.getDistSoleil()/100 * Math.sin(360-(360-AngleTerre)));
                Double XMars =(0.5 + Mars.getDistSoleil()/100 * Math.cos(360-(360-AngleMars)));
                Double YMars =(0.5 + Mars.getDistSoleil()/100 * Math.sin(360-(360-AngleMars)));
                Double XMercure =(0.5 + Mercure.getDistSoleil()/100 * Math.cos(360-(360-AngleMercure)));
                Double YMercure =(0.5 + Mercure.getDistSoleil()/100 * Math.sin(360-(360-AngleMercure)));
                Double XJupiter =(0.5 + Jupiter.getDistSoleil()/100 * Math.cos(360-(360-AngleJupiter)));
                Double YJupiter =(0.5 + Jupiter.getDistSoleil()/100 * Math.sin(360-(360-AngleJupiter)));
                Double XVenus =(0.5 + Venus.getDistSoleil()/100 * Math.cos(360-(360-AngleVenus)));
                Double YVenus =(0.5 + Venus.getDistSoleil()/100 * Math.sin(360-(360-AngleVenus)));
                Double XSaturne =(0.5 + Saturne.getDistSoleil()/100 * Math.cos(360-(360-AngleSaturne)));
                Double YSaturne =(0.5 + Saturne.getDistSoleil()/100 * Math.sin(360-(360-AngleSaturne)));
                Double XUranus =(0.5 + Uranus.getDistSoleil()/100 * Math.cos(360-(360-AngleUranus)));
                Double YUranus =(0.5 + Uranus.getDistSoleil()/100 * Math.sin(360-(360-AngleUranus)));
                Double XNeptune =(0.5 + Neptune.getDistSoleil()/100 * Math.cos(360-(360-AngleNeptune)));
                Double YNeptune =(0.5 + Neptune.getDistSoleil()/100 * Math.sin(360-(360-AngleNeptune)));

                SystemeSolaire.clear();

                SystemeSolaire.setPenColor(Color.lightGray);
                SystemeSolaire.circle(0.5, 0.5, Terre.getDistSoleil()/100);
                SystemeSolaire.circle(0.5, 0.5, Mars.getDistSoleil()/100);
                SystemeSolaire.circle(0.5, 0.5, Mercure.getDistSoleil()/100);
                SystemeSolaire.circle(0.5, 0.5, Jupiter.getDistSoleil()/100);
                SystemeSolaire.circle(0.5, 0.5, Venus.getDistSoleil()/100);
                SystemeSolaire.circle(0.5, 0.5, Saturne.getDistSoleil()/100);
                SystemeSolaire.circle(0.5, 0.5, Uranus.getDistSoleil()/100);
                SystemeSolaire.circle(0.5, 0.5, Neptune.getDistSoleil()/100);

                SystemeSolaire.setPenColor(Terre.getCouleur());
                SystemeSolaire.circle(XTerre, YTerre, Terre.getRayon()/100);
                SystemeSolaire.setPenColor(Mars.getCouleur());
                SystemeSolaire.circle(XMars, YMars, Mars.getRayon()/100);
                SystemeSolaire.setPenColor(Mercure.getCouleur());
                SystemeSolaire.circle(XMercure, YMercure, Mercure.getRayon()/100);
                SystemeSolaire.setPenColor(Jupiter.getCouleur());
                SystemeSolaire.circle(XJupiter, YJupiter, Jupiter.getRayon()/100);
                SystemeSolaire.setPenColor(Venus.getCouleur());
                SystemeSolaire.circle(XVenus, YVenus, Venus.getRayon()/100);
                SystemeSolaire.setPenColor(Saturne.getCouleur());
                SystemeSolaire.circle(XSaturne, YSaturne, Saturne.getRayon()/100);
                SystemeSolaire.setPenColor(Uranus.getCouleur());
                SystemeSolaire.circle(XUranus, YUranus, Uranus.getRayon()/100);
                SystemeSolaire.setPenColor(Neptune.getCouleur());
                SystemeSolaire.circle(XNeptune, YNeptune, Neptune.getRayon()/100);

                SystemeSolaire.setPenColor(Soleil.getCouleur());
                SystemeSolaire.circle(0.5, 0.5, Soleil.getRayon()/100);

                SystemeSolaire.show();
                
                AngleTerre += AngleParJourTerre;
                AngleMars += AngleParJourMars;
                AngleMercure += AngleParJourMercure;
                AngleJupiter += AngleParJourJupiter;
                AngleVenus += AngleParJourVenus;
                AngleSaturne += AngleParJourSaturne;
                AngleUranus += AngleParJourUranus;
                AngleNeptune += AngleParJourNeptune;
    }
}
