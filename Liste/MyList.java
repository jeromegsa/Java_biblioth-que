
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class MyList {
    public static void main(String[] args) {
        int[] tab = { 8, 5, 8, 85, 36, 5 };
        // evenNombre(tab);
        // minMax(tab);
        // searchVal(tab);
        noDoublon(tab);

    }

    // Exo1
    public static String sortTab(int[] tab) {
        Arrays.sort(tab);
        return Arrays.toString(tab);
    }

    // Exo 2
    public static void evenNombre(int[] tab) {

        int[] x = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0)
                continue;
            System.out.println(tab[i]);

        }
    }

    // Exo3
    public static void minMax(int[] tab) {
        Arrays.sort(tab);
        int max = tab[tab.length - 1];
        int min = tab[0];
        System.out.println("Le plus petit est " + min);
        System.out.println("Le plus grand est " + max);
    }

    // Exo 4
    public static void searchVal(int[] tab) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        for (int i = 0; i < 5; i++) {
            tab[i] = scanner.nextInt();
        }
        System.out.println("Entrez le nombre recherché");
        int nbr = scanner.nextInt();

        int index = Arrays.binarySearch(tab, nbr);
        System.out.println("Lélément recherché se trouve à la position: " + index);
    }

    // Exo 5
    public static void noDoublon(int[] tab) {
        Set<Integer> noDoubTab = new HashSet<Integer>();
        for (int i : tab) {
            noDoubTab.add(i);
        }
        System.out.println(noDoubTab);
    }

}
