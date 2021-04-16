public class Video extends Oeuvre {
    // Atts
    String format;
    String duree;

    // Const
    public Video(String ref, String aut, String tit, String ann, String dur, String form) {
        super(ref, aut, tit, ann);
        format = form;
        duree = dur;
    }

    public void afficher() {System.out.println("Reference : " + reference + ", Auteur : " + auteur + ", Titre : " + titre + ", Annee : " + annee + ", Durée : " + duree + ", Format : " + format);}
}