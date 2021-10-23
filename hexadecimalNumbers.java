import java.util.Scanner;

/**
 * hexadecimalNumbers
 * problem statement
 * 
 */
public class hexadecimalNumbers {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        
        s.close();
    }
    
}

// import java.io.*;
// import java.util.*;
// public class MyClass {
//    public static int GCD(int x, int sum) {
//        if(sum == 0) 
//            return x;
//        else 
//            return GCD(sum,x%sum);
//    }
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        for(int j=0;j<t;j++){
//            int L = scan.nextInt();
//            int R = scan.nextInt();
//            int count=0;
//            for(int x=L;x<=R;x++) {
//                String hex = Integer.toHexString(x);
//                int sum=0;
//                for (int i = 0; i < hex.length(); i++) {
//                    char ch = hex.charAt(i);
//                    if (Character.isLetter(ch)) {
//                        switch(ch) {
//                            case 'a':
//                                ch = 10; break;
//                            case 'b':
//                                ch = 11; break;
//                            case 'c':
//                                ch = 12; break;
//                            case 'd':
//                                ch = 13; break;
//                            case 'e':
//                                ch = 14; break;
//                            case 'f':
//                                ch = 15; break;
//                        } 
//                        sum = sum + ch;
//                    }
//                    if (Character.isDigit(ch)) {
//                        int num = Integer.parseInt(String.valueOf(ch));
//                        sum = sum + num;
//                    }
//                }
//                if(GCD(x,sum) > 1) {
//                    count ++;
//                }
//            }
//            System.out.println(count);
//        }
//    }
// }