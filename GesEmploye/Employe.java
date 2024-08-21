
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
    
        // public void afficherEmploye( e){
        //     for(Employe i:e){
        //         System.out.println(i.getSalaire());
        //     }
        // }
        
    }
    
    
    





    

