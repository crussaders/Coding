/**
 * linearSearch
 */
import java.util.Scanner; 
public class linearSearch {

    public static int search(int[] array, int findNumber) {
        for(int i=0;i<array.length;i++) {
            if(array[i] == findNumber)
                return i;

        }
        return -1;
    }

    public static void main(String[] args) {

        int N,findNumber;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int[] array = new int[100];

        for(int i=0;i<N;i++) {
            array[i] = sc.nextInt();
        }
        
        findNumber = sc.nextInt();
        int result  = search(array, findNumber);
        
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("element" + result);
        }
        sc.close();
    }

    
}