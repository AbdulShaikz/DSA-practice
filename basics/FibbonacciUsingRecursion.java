package basics;

import java.util.*;

public class FibbonacciUsingRecursion {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int result = printFibbo(n);
        System.out.println(result);
    }

    private static int printFibbo(int n) {
        if(n<=1) return n;
        else{
            return printFibbo(n-1) + printFibbo(n-2);
        }
    }
}
