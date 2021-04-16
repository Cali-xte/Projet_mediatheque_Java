public class Musique extends Oeuvre {
    // Atts
    String pistes;
    String support;

    // Const
    public Musique(String ref, String aut, String tit, String ann, String pis, String sup) {
        super(ref, aut, tit, ann);
        pistes = pis;
        support = sup;
    }

    public void afficher() {System.out.println("Reference : " + reference + ", Auteur : " + auteur + ", Titre : " + titre + ", Annee : " + annee + ", Pistes : " + pistes + ", Support : " + support);}
}