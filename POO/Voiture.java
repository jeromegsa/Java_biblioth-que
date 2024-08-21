
public class Voiture {

   private String type = "WWW";
    String modele = "BG";
    int prix = 8000;
    String couleur = "rouge";

    Voiture() {
        System.out.println(
                "Vous n'avez pas initialisé des valeurs aux propriétés de votre objet, les valeurs par défaut lui sont attribués");
    }

    Voiture(String type, String modele, String couleur, int prix) {
        this.type = type;
        this.modele = modele;
        this.couleur = couleur;
        this.prix = prix;
    }

    public void accelerer() {
        System.out.println("Tu accélères");
    }

    public void ralentir() {
        System.out.println("Tu ralentis");
    }

    public void tourner() {
        System.out.println("Tu tournes");
    }

    public void freiner() {
        System.out.println("Tu frènes");
    }
    public String getType(){
        return this.type;

    }
    public void setType(String type){
        this.type=type;
    }


}
