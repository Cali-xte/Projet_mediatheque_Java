import java.util.Scanner; import java.util.ArrayList;

public class Mediatheque {
    // Attributs
    int nbroeuv;
    ArrayList<Oeuvre> mediatheque = new ArrayList<Oeuvre>();

    // Méthodes
    public void ajOeuvre(Oeuvre oeuvre) {
        mediatheque.add(oeuvre);
    }

    public void listOeuvre() {
        System.out.println("----------Liste----------");
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