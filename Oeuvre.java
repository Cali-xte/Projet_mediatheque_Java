public class Oeuvre {
    // Attributs
    String reference;
    String auteur;
    String titre;
    String annee;

    // Constructeur
    public Oeuvre(String ref, String aut, String tit, String ann) {
        reference = ref;
        auteur = aut;
        titre = tit;
        annee = ann;
    }

    // Methodes

    public String getRef() {return reference;}
    public String getAut() {return auteur;}
    public String getTit() {return titre;}
    public String getAnn() {return annee;}
    public void afficher() {System.out.println("Reference : " + reference + ", Auteur : " + auteur + ", Titre : " + titre + ", Annee : " + annee);}
}