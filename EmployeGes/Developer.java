package EmployeGes;

public class Developer extends Employee  {
    private String specialite;
    @Override
    public void Afficher() {
      System.out.println("Nombre de personnes :"+specialite);
       
   }
  
}
