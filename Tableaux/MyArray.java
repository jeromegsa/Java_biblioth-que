
public class MyArray {
    public static void main(String[] args) {
        // Déclaration de tableau
        char[] alpha = new char[26];
        String[] fruits = new String[5];
        byte[] myByteNumber = { 7, 7, 8, 16 };
        int[] number = { 2, 4, 5 };
        fruits[0]="Pomme";
        fruits[1]="Conconbre";
        fruits[2]="Ananas";
        for (int i =0; i<fruits.length;i++) {
            if(fruits[i]!=null){
                System.out.println("Lélément à l'index "+i+ " est: " + fruits[i]);

            }
            
        }
     
        System.out.println("***************** TABLE DE MULTIPLICATION par 7 ************");
        for ( int i=0;i<=10;i++ ) {
            System.out.println (7 +" x "+ i + " = "+ i*7);
            
        }
        


        // Assignation de valeur à tableau
        // Parcours de tableau
    }

}
