import java.util.Scanner;

// linear search problem
public class geekandhismarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N, X;
        int[] arr = new int[100];
        while (T > 0) {

            N = sc.nextInt();
            X = sc.nextInt();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(geeksNumberCount(arr, N, X));
            // break;
            T--;
        }
        sc.close();
    }

    public static int geeksNumberCount(int[] arr, int n, int x) {

        int count = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

}
