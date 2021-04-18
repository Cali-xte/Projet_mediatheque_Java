import java.util.Scanner;

public class projet {
    public static void main(String[] args){
        // Menu principal, choix de l'action
        Scanner menu = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("---------- Bienvenue ----------");
        System.out.println("-----Choisissez une option-----");
        System.out.println("-----en entrant le chiffre-----");
        System.out.println("---------correspondant---------");
        System.out.println("-------------------------------");
        System.out.println("1- Ajouter une oeuvre");
        System.out.println("2- Lister toutes les oeuvres");
        System.out.println("3- Rechercher une oeuvre");
        System.out.println("4- Compter les oeuvres en fonction de leur année de sortie");
        String choixMenu = menu.nextLine();

        if (choixMenu.equals("1")) {
            // Menu d'ajout, choix du type
            System.out.println("Vous souhaitez ajouter :");
            System.out.println("1- Une oeuvre sans type specifie");
            System.out.println("2- Un livre");
            System.out.println("3- Une video");
            System.out.println("4- Une musique");
            String type = menu.nextLine();
            // Infos communes à tous les types d'oeuvres
            System.out.println("Entrez les informations demandées");
            System.out.println("Reference :");
            String referencein = menu.nextLine();
            System.out.println("Auteur :");
            String auteurin = menu.nextLine();
            System.out.println("Titre :");
            String titrein = menu.nextLine();
            System.out.println("Annee :");
            String anneein = menu.nextLine();
            if (type.equals("1")) {
                //! Utiliser un arraylist pour créer les objets
                //! https://stackoverflow.com/questions/19961844/creating-multiple-objects-with-different-names-in-a-loop-to-store-in-an-array-li
            }
        }

        Oeuvre oeuvre = new Oeuvre("112233", "Calixte", "Java", "2021");
        System.out.println(oeuvre.getAnn());
        oeuvre.afficher();
        Livre livre = new Livre("12345", "Etxilac", "Avaj", "1202", "4321", "editions", "1212");
        livre.afficher();
        Video video = new Video("refvid", "cal", "Java en vidéos", "2030", "8h30", "avi");
        video.afficher();
        Musique musique = new Musique("refmus", "Cali", "la douce musique", "1999", "18", "Cassette");
        musique.afficher();
        Mediatheque media = new Mediatheque();
        media.ajOeuvre(musique);
        media.ajOeuvre(livre);
        media.ajOeuvre(oeuvre);
        media.ajOeuvre(video);
        media.listOeuvre();
        media.rechOeuvre();
        String anneeRecherche = "2021";
        System.out.println(media.compteAnnee(anneeRecherche) + " oeuvres sont datees de l'annee " + anneeRecherche);
    }
}