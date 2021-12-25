package SystemeSolaire;

public class HorlogeUniverselle {

    public static void main(String[] args) {
        
        long milliInit = System.currentTimeMillis();
        long milliPerso = System.currentTimeMillis();
        long milliWhile = 0;
        long milliEcoulee = 0;
        int jour=0;

        do{
            long milliModif = System.currentTimeMillis();

            milliWhile = milliModif - milliInit;
            milliEcoulee = milliModif - milliPerso;
            if (milliEcoulee>=2000){
                jour++;
                milliEcoulee=0;
                System.out.println(jour);
                milliPerso = System.currentTimeMillis();
            }
        }
        while (milliWhile < 15000);
    }
}