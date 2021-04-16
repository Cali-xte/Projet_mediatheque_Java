public class Livre extends Oeuvre {
    // Atts
    String isbn;
    String editeur;
    String pages;

    // Const
    public Livre(String ref, String aut, String tit, String ann, String isb, String edi, String pag) {
        super(ref, aut, tit, ann);
        isbn = isb;
        editeur = edi;
        pages = pag;
    }

    public void afficher() {System.out.println("Reference : " + reference + ", Auteur : " + auteur + ", Titre : " + titre + ", Annee : " + annee + ", ISBN : " + isbn + ", Editeur : " + editeur + ", Pages : " + pages);}
}