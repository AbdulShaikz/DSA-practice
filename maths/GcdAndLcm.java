import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        System.out.println("GCD: "+ binaryGCD(a,b));
    }
     
    // Euclidean GCD. TC: O(log(min(a,b))), SC = O(1)
     private static int euclideanGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return Math.abs(a);
     }
     //Binary GCD Algorithm (Stein's Algorithm). TC: O(log(min(a,b))), SC = O(1)
     private static int binaryGCD(int a, int b){
        if(a==0) return b;
        if(b==0) return a;

        // Finding power of 2 in both a and b
        int commonFactors = 0;
        while ((a & 1) == 0 && (b & 1) == 0) {
            a >>= 1;
            b >>= 1;
            commonFactors++;
        }

         // Perform Stein's algorithm on remaining odd numbers
         while (a != b) {
            if ((a & 1) == 0) a >>= 1;
            else if ((b & 1) == 0) b >>= 1;
            else if (a > b) a = (a - b) >> 1;
            else b = (b - a) >> 1;
        }

        return a << commonFactors;
     }

}
