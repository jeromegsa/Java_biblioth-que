
public class App {
    public static void main(String[] args) {
        Voiture v= new Voiture("montype","Mon modèle","Ma couleur",20000);
        v.tourner();
        v.freiner();
        v.accelerer();
        v.ralentir();
        System.out.println(v.getType());
        v.setType("Mon type modifié");
        System.out.println(v.getType());

        
    }
}

