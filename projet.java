public class projet {
    public static void main(String[] args){
        Oeuvre oeuvre = new Oeuvre("112233", "Calixte", "Java", "2021");
        System.out.println(oeuvre.getAnn());
        oeuvre.afficher();
        Livre livre = new Livre("12345", "Etxilac", "Avaj", "1202", "4321", "editions", "1212");
        livre.afficher();
        Oeuvre video = new Oeuvre("refvid", "cal", "Java en vidéos", "2030", "8h30", "avi");
        video.afficher();
        Musique musique = new Musique("refmus", "Cali", "la douce musique", "1999", "18", "Cassette");
        musique.afficher();
    }
}