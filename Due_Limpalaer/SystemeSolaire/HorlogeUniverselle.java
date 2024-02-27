package SystemeSolaire;


import java.awt.Color;

public class HorlogeUniverselle implements Runnable {



    
    public static final Color BROWN = new Color(91, 60, 17);
    public static final Color VENUS = new Color(91, 20, 20);

    SystemeSolaireDraw SystemeSolaire = new SystemeSolaireDraw();
    
    private long dureeExecMillis;
    private long tempsJourMillis;
    public int jour=1;


    public HorlogeUniverselle(long dureeExecMillis, long tempsJourMillis) {
        this.dureeExecMillis = dureeExecMillis;
        this.tempsJourMillis = tempsJourMillis;
    }

    @Override
    public void run() {

        long milliInit = System.currentTimeMillis();
        long milliPerso = System.currentTimeMillis();
        long milliWhile = 0;
        long milliEcoulee = 0;
        do{
            long milliModif = System.currentTimeMillis();

            milliWhile = milliModif - milliInit;
            milliEcoulee = milliModif - milliPerso;

            if (milliEcoulee>=tempsJourMillis){

                SystemeSolaire.ExecSysteme();

                jour++;
                milliEcoulee=0;
                milliPerso = System.currentTimeMillis();

            }
        }
        while (milliWhile < dureeExecMillis);
    }
}