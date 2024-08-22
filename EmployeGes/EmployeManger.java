package EmployeGes;
import java.util.Scanner;
import java.util.ArrayList;

public class EmployeManger {
    static Scanner scanner=new  Scanner(System.in);
    ArrayList<Employee> managers=new ArrayList<Employee>();
    ArrayList<Employee> developpers=new ArrayList<Employee>();
    public static void main(String[] args) {
       
            long id=0;
            System.out.println("Combien d'employé voulez-vous enregistrer?");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                id++;
                System.out.println("Enregistrer employé n°" + (i + 1));
                Employe e = new Employe();
                scanner.nextLine();
                System.out.println("Veuillez entrer votre nom");
                String nom = scanner.nextLine();
                System.out.println("Veuillez entrer votre poste");
                String poste = scanner.nextLine();
                System.out.println("Veuillez entrer votre salaire");
                int s = scanner.nextInt();
    
                // Je modifie les propriétés de mon objet avec les valeurs entrées par le user
                e.setID(id);
                e.setNom(nom);
                e.setPoste(poste);
                e.setSalaire(s);
                bdd.add(e);
            }
            displayAll(bdd);
            menu();
    
        }
    }

    

