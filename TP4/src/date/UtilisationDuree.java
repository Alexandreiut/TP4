/*
 * UtilisationDuree.java
 */

package date;
import date.DureeHMS;
import java.util.Scanner;

/**
 * Utilisation des méthodes traitant les durées
 */
public class UtilisationDuree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         testChaine();
         testDifferente();
         testOrdre();
         
    }
    /** TODO test de la methode entre différente heure
     * 
     */
    public static void testDifferente() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("Parmi ces 3 durées, "
                + DureeHMS.combienDifferentes(d1, d2, d3) + " sont différentes.");

    }

    /** TODO test de la méthode qui ordone les date dans l'ordre croissant
     * 
     */
    public static void testOrdre() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("ces 3 durées sont "
                + (DureeHMS.ordre(d1, d2, d3) ? " ordonnées " : " dans le désordre"));

    }

  

    /** TODO methode qui demande une chaine et qui appelle les sous programme nécéssaire
     * 
     */
    public static void testChaine() {
        Scanner entree = new Scanner(System.in);
        String phrase;
        System.out.print("Vous allez entrer une chaine et le programme verifira "
                         + "si elle est bien dans le format hh:mm:ss."
                         + "\nLe separateur ':' peut etre remplace par n'iporte quel caractere"
                         + "\n        ==>");
        phrase = entree.nextLine();
        if (DureeHMS.estChaineDuree(phrase)) {
            System.out.println("La chaine " + phrase + "respecte bien le format hh:mm:ss");
        } else {
            System.out.println("ERREUR !!! ");
        }
    }

}