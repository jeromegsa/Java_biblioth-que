package EmployeGes;

abstract class Employee implements EmployeeOperations {
    long ID;
    int salaire;
    String nom, poste;


    
    public long getID() {
        return ID;
    }

    public void setID(long id) {
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

    abstract void Afficher();
    
}
