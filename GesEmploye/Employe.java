import java.util.ArrayList;
import java.util.Scanner;

public class Employe {
    static  Scanner scanner = new Scanner(System.in);

    int ID = 0;
    int salaire = 0;
    String nom = "xxxxxx", poste = "";
    static ArrayList<Employe> bdd = new ArrayList<Employe>(50);

    // public Employe(int id, String nom, String poste, int sal) {
    // this.ID = id;
    // this.nom = nom;
    // this.poste = poste;
    // this.salaire = sal;
    // }

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

    public static void displayAll(ArrayList<Employe> e) {
        System.out.println("Voici la liste des employe");
        for (Employe i : e) {
            System.out.println("Nom: " + i.getNom());
            System.out.println("Prenom: " + i.getPoste());
            System.out.println("Salaire: " + i.getSalaire());
            System.out.println("********************");
        }
        menu();
    }

    public static void displayOne() {
        System.out.println("Quel est l'identifiant de l'utilisateur à afficher");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        for (Employe i : bdd) {
            if (index == i.ID) {
                System.out.println("ID :" + i.getID());
                System.out.println("Nom :" + i.getNom());
                System.out.println("Poste :" + i.getPoste());
                System.out.println("Salaire :" + i.getSalaire());
            }
        }

    }

    public static void update() {
        System.out.println("Quel est l'identifiant de l'utilisateur à modifier");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println("Quel est le nouveau nom");
        String n=scanner.nextLine();
        System.out.println("Quel est le  nouveau poste");
        String p=scanner.nextLine();
        System.out.println("Quel est le nouveau salaire");
        String s=scanner.nextLine();
        for (Employe i : bdd) {
            if (index == i.ID) {
               i.setNom(n);
               i.setNom(p);
               i.setNom(s);
            }
        }
        displayAll(bdd);

    }

    public static void registerEmploye() {
        System.out.println("Combien d'employé voulez-vous enregistrer?");
        int n = scanner.nextInt();
        int id = 0;
        for (int i = 0; i < n; i++) {
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
            e.setID(id++);
            e.setNom(nom);
            e.setPoste(poste);
            e.setSalaire(s);
            bdd.add(e);
        }
        displayAll(bdd);
        menu();

    }

    public static void menu() {
        System.out.println("*****GESTION DES EMPLOYES *****");
        System.out.println("*****Que voulez vous faire ? *****");
        System.out.println("** 1. Pour en inscrire un employé ");
        System.out.println("** 2. Pour afficher tous les employés");
        System.out.println("** 3. Pour afficher un employé");
        System.out.println("** 4. Pour supprimer un employé ");
        System.out.println("** 5. Pour supprimer tous les employés ");
        System.out.println("** 6. Pour modifier un employé");
        int choix = scanner.nextInt();
        actions(choix);

    }

    public static void actions(int c) {

        switch (c) {
            case 1:
                Employe.registerEmploye();
                break;
            case 2:
                Employe.displayAll(Employe.bdd);
                break;
            case 3:
                displayOne();

            case 4:
                delete();
                break;
            case 5:
                deleteAll();
                break;
            case 6:
                update();

        }
    }

    public static void delete() {
        System.out.println("Quel est l'identifiant de l'utilisateur à supprimer");
        int index = scanner.nextInt();
        bdd.removeIf(e->e.ID==index);
        System.out.println("Supprimé avec succès");
        // for (Employe i : bdd) {
        //     if (index == i.ID) {
        //         bdd.remove(i);
        //     }
        // }
        displayAll(bdd);
    }

    public static void deleteAll() {
        System.out.println("Etes vous sûrs de vouloir supprimer tous les employés ? (`O`ou `N`)");
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
        if (ch == "O") {
            bdd.clear();
            displayAll(bdd);
        } else {
            menu();
        }

    }
}
