import java.util.Scanner; import java.util.ArrayList;

public class Mediatheque {
    // Attributs
    int nbroeuv;
    ArrayList<Oeuvre> mediatheque = new ArrayList<Oeuvre>();

    // Méthodes
    public void ajOeuvre() {
        Scanner nouveau = new Scanner(System.in);
        // Menu d'ajout, choix du type
        System.out.println("Vous souhaitez ajouter :");
        System.out.println("1- Une oeuvre sans type specifique");
        System.out.println("2- Un livre");
        System.out.println("3- Une video");
        System.out.println("4- Une musique");
        String type = nouveau.nextLine();
        // Infos communes à tous les types d'oeuvres
        System.out.println("Entrez les informations demandées");
        System.out.println("Reference :");
        String referencein = nouveau.nextLine();
        System.out.println("Auteur :");
        String auteurin = nouveau.nextLine();
        System.out.println("Titre :");
        String titrein = nouveau.nextLine();
        System.out.println("Annee :");
        String anneein = nouveau.nextLine();

        if (type.equals("1")) {
            Oeuvre nouvoeuvre = new Oeuvre(referencein, auteurin, titrein, anneein);
            mediatheque.add(nouvoeuvre);
        }

        else if (type.equals("2")) {
            System.out.println("ISBN :");
            String isbnin = nouveau.nextLine();
            System.out.println("Editeur :");
            String editeurin = nouveau.nextLine();
            System.out.println("Nombre de pages :");
            String pagesin = nouveau.nextLine();
            Livre nouvlivre = new Livre(referencein, auteurin, titrein, anneein, isbnin, editeurin, pagesin);
            mediatheque.add(nouvlivre);
        }

        else if (type.equals("3")) {
            System.out.println("Duree :");
            String dureein = nouveau.nextLine();
            System.out.println("Format :");
            String formatin = nouveau.nextLine();
            Video nouvvideo = new Video(referencein, auteurin, titrein, anneein, dureein, formatin);
            mediatheque.add(nouvvideo);
        }

        else if (type.equals("4")) {
            System.out.println("Nombre de pistes :");
            String pistesin = nouveau.nextLine();
            System.out.println("Type de support :");
            String supportin = nouveau.nextLine();
            Musique nouvmusique = new Musique(referencein, auteurin, titrein, anneein, pistesin, supportin);
            mediatheque.add(nouvmusique);
        }

        else {
            System.out.println("Erreur, reessayez");
        }
    }

    public void listOeuvre() {
        System.out.println("----------Liste des Oeuvres----------");
        for(int i = 0; i < mediatheque.size(); i++) {
            Oeuvre oeu = mediatheque.get(i);
            oeu.afficher();
        }
    }

    public void rechOeuvre() {

        // MENU
        Scanner in = new Scanner(System.in);
        System.out.println("Vous souhaitez effectuer une recherche par :");
        System.out.println("1- Reference");
        System.out.println("2- Auteur");
        System.out.println("3- Titre");
        System.out.println("4- Annee");
        String rep = in.nextLine();
        System.out.println("Entrez la sequence recherchee (sensible a la casse) :");
        String rech = in.nextLine();
        // FIN MENU

        if(rep.equals("1")) { // Recherche par Référence
            for(int i = 0; i < mediatheque.size(); i++) {
                Oeuvre oeu = mediatheque.get(i);
                String str = oeu.getRef();
                if (str.contains(rech) == true) {
                    oeu.afficher();
                }
            }
        }

        else if(rep.equals("2")) { // Recherche par Auteur
            for(int i = 0; i < mediatheque.size(); i++) {
                Oeuvre oeu = mediatheque.get(i);
                String str = oeu.getAut();
                if (str.contains(rech) == true) {
                    oeu.afficher();
                }
            }
        }

        else if(rep.equals("3")) { // Recherche par Titre
            for(int i = 0; i < mediatheque.size(); i++) {
                Oeuvre oeu = mediatheque.get(i);
                String str = oeu.getTit();
                if (str.contains(rech) == true) {
                    oeu.afficher();
                }
            }
        }

        else if(rep.equals("4")) { // Recherche par Année
            for(int i = 0; i < mediatheque.size(); i++) {
                Oeuvre oeu = mediatheque.get(i);
                String str = oeu.getAnn();
                if (str.contains(rech) == true) {
                    oeu.afficher();
                }
            }
        }
    }

    public int compteAnnee(String annee) {
        int nbr = 0;
        for(int i = 0; i < mediatheque.size(); i++) {
            if(annee.equals(mediatheque.get(i).getAnn())) {
                nbr++;
            }
        }
        return nbr;
    }
}