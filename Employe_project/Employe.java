package Employe_project;
public class employe {
    private byte ID=0;
    private int salaire=0;
    private String nom="", poste="";

    // employe(byte id, String nom, String poste, int sal) {
    //     this.ID = id;
    //     this.nom = nom;
    //     this.poste = poste;
    //     this.salaire = sal;
    // }

    public byte getID() {
        return ID;
    }

    public void setID(byte id) {
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

}


