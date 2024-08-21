import java.util.ArrayList;
import java.util.Scanner;

public class Employe {

    
         int ID=0;
        int salaire=0;
         String nom="xxxxxx", poste="";
    
     public   Employe(int id, String nom, String poste, int sal) {
            this.ID = id;
            this.nom = nom;
            this.poste = poste;
            this.salaire = sal;
        }
    
        public int getID() {
            return ID;
        }
    
        public void setID(int id) {
            this.ID = id;
        }
    
        public int getSalaire() {
            return salaire;
        }
    
        public void setSalaire(int sal) {
            this.salaire = sal;
        }
    
        public String getNom() {
            return nom;
        }
    
        public void setNom(String nom) {
            this.nom = nom;
        }
    
        public String getPoste() {
            return poste;
        }
    
        public void setPoste(String poste) {
            this.poste = poste;
        }
    
        public static void afficherEmploye(ArrayList<Employe> e){
            for(Employe i:e){
                System.out.println("Voici la liste des employe");
                System.out.println(i.getNom());
                System.out.println(i.getPoste());
                System.out.println(i.getSalaire());            }
        }





     public static void registerEmploye(){
        System.out.println("Combien d'employé voulez-vous enregistrer?");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Employe> bdd= new ArrayList<Employe>(50);
        for (int i=0;i<n;i++)
        {

            Employe e = new Employe(4, "skj", "hhjh", 63666);
            System.out.println("Veuillez entrer votre nom");
            String nom=scanner.nextLine();
            System.out.println("Veuillez entrer votre poste");
            String poste=scanner.nextLine();
            System.out.println("Veuillez entrer votre salaire");
            int s=scanner.nextInt();

            e.setID(5);
            e.setNom(nom);
            e.setPoste(poste);
            e.setSalaire(s);
            bdd.add(e);
        } 

        }


        
    }
    
    
    





    

