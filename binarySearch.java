import java.util.Scanner;

// recursive approach

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[100];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        System.out.println(recursiveBinarySearch(arr, v));

        sc.close();
    }

    public static int recursiveBinarySearch(int[] array, int v) {
        return recursiveBinarySearch(array, 0, array.length, v);
    }

    public static int recursiveBinarySearch(int[] array, int start, int end, int v) {
        // start =0;
        // end = arr.length;
        int midpoint;
        if (start >= end) {
            return -1;
        }
        midpoint = (start + end) / 2;
        System.out.println("midpoint = " + midpoint);

        if (array[midpoint] == v) {
            return midpoint;
        } else if (array[midpoint] < v) {
            return recursiveBinarySearch(array, midpoint + 1, end, v);
        } else {
            return recursiveBinarySearch(array, start, midpoint, v);
        }
    }
}

// class BinarySearch {
// // Returns index of x if it is present in arr[l..
// // r], else return -1
// int binarySearch(int arr[], int l, int r, int x)
// {
// if (r >= l) {
// int mid = l + (r - l) / 2;

// // If the element is present at the
// // middle itself
// if (arr[mid] == x)
// return mid;

// // If element is smaller than mid, then
// // it can only be present in left subarray
// if (arr[mid] > x)
// return binarySearch(arr, l, mid - 1, x);

// // Else the element can only be present
// // in right subarray
// return binarySearch(arr, mid + 1, r, x);
// }

// // We reach here when element is not present
// // in array
// return -1;
// }

// // Driver method to test above
// public static void main(String args[])
// {
// BinarySearch ob = new BinarySearch();
// int arr[] = { 2, 3, 4, 10, 40 };
// int n = arr.length;
// int x = 10;
// int result = ob.binarySearch(arr, 0, n - 1, x);
// if (result == -1)
// System.out.println("Element not present");
// else
// System.out.println("Element found at index " + result);
// }
// }