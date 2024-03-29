import java.util.Scanner;

public class projet {
    public static void main(String[] args){
        // Création de la médiathèque
        Mediatheque media = new Mediatheque();
        while (true) {
            // Menu principal, choix de l'action
            Scanner menu = new Scanner(System.in);
            System.out.println("-------------------------------------");
            System.out.println("---------- Menu Principal -----------");
            System.out.println("------- Choisissez une option -------");
            System.out.println("------- en entrant le chiffre -------");
            System.out.println("----------- correspondant -----------");
            System.out.println("-------------------------------------");
            System.out.println("");
            System.out.println("1- Ajouter une oeuvre");
            System.out.println("2- Lister toutes les oeuvres");
            System.out.println("3- Rechercher une oeuvre");
            System.out.println("4- Compter les oeuvres en fonction de leur annee de sortie");
            String choixMenu = menu.nextLine();
            System.out.println("");

            if (choixMenu.equals("1")) {
                media.ajOeuvre();
            }

            else if (choixMenu.equals("2")) {
                media.listOeuvre();
            }

            else if (choixMenu.equals("3")) {
                media.rechOeuvre();
            }

            else if (choixMenu.equals("4")) {
                System.out.println("Entrez l'annee recherchee :");
                String choixAnnee = menu.nextLine();
                int res = media.compteAnnee(choixAnnee);
                if(res == 0) {
                    System.out.println("Aucune oeuvre n'est datee de " + choixAnnee);
                }
                else if(res == 1) {
                    System.out.println("1 oeuvre est datee de " + choixAnnee);
                }
                else {
                    System.out.println(res + " oeuvres sont datees de " + choixAnnee);
                }
            }

            else {
                System.out.println("Desole, cette option n'existe pas. Reessayez");
                System.out.println("");
            }
        }
    }
}