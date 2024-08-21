import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Employe e = new Employe(4, "skj", "hhjh", 63666);
        Scanner scanner=new Scanner(System.in);
        ArrayList<Employe> bdd= new ArrayList<Employe>(50);

        System.out.println("Veuillez entrer votre nom");
        String n=scanner.nextLine();
        System.out.println("Veuillez entrer votre poste");
        String poste=scanner.nextLine();
        System.out.println("Veuillez entrer votre salaire");
        int s=scanner.nextInt();

        e.setID(5);
        e.setNom(n);
        e.setPoste(poste);
        e.setSalaire(s);
        bdd.add(e);
        System.out.println(bdd);
       
            for(Employe i:bdd){
                System.out.println("Voici la liste des employe");
                System.out.println(i.getNom());
                System.out.println(i.getPoste());
                System.out.println(i.getSalaire());
            }
        }
    }


