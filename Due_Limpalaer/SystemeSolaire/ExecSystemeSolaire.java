package SystemeSolaire;

import java.util.Scanner;

public class ExecSystemeSolaire {
    
    public static void main(String[] args) {

        Long tempsExec;
        Long tempsJour;
        Boolean erreur = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la durée d'éxecution du programme en secondes");
        if (sc.hasNextLong()){
            
        }
        else{
            System.out.println("Erreur de saisie");
            erreur=true;
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Veuillez saisir la durée d'un jour personnalisé en millisecondes");
        if (sc2.hasNextLong()){
        }
        else{
            System.out.println("Erreur de saisie");
            erreur=true;
        }

        
        if (!erreur){
            tempsExec = sc.nextLong();
            tempsJour = sc2.nextLong();
            HorlogeUniverselle Horloge = new HorlogeUniverselle(tempsExec*1000, tempsJour);
            
            Thread thread1 = new Thread(Horloge);

            thread1.start();
        }
        
    }

}
