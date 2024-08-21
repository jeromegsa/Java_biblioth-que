public class exo1{
    public static void main(String[] args){
        byte i=1;
        while ( i<16){
            String etoile=(i==1) ? "Codeur " + i + " étoile":"Codeur " + i + " étoiles";
            System.out.println(etoile);
            i++;
        }

    }
}