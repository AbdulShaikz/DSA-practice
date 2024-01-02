    import java.util.*;

    public class PrimeOrComposite{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            input.close();
            isPrimeOrComposite(n);
        }

        // TC: O(n)
        /* private static void isPrimeOrComposite(int n){
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    System.out.println(n+" is a Composite number");
                    return;
                }
            }
            System.out.println(n +" is a Prime number");
        } */

        //TC: O(sqrt(n))
        /* private static void isPrimeOrComposite(int n){
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    System.out.println(n+" is a Composite number");
                    return;
                }
            }
            System.out.println(n +" is a Prime number");
        } */

        //TC: O(n*log(logn)) find all prime numbers up to a given limit
        private static void isPrimeOrComposite(int n){
            int[] primes = new int[n];
            Arrays.fill(primes, 1);
            for(int i=2;i<n;i++){
                if(primes[i]==0) {continue;}
                for(int j=i*i;j<n;j+=i){
                    primes[j] = 0;  //marking the multiples of i as 0 which means composite
                }
            }
            for(int i=2;i<n;i++){
                if(primes[i]==0){
                    System.out.println(i+" is a Composite number");
                }else{
                    System.out.println(i +" is a Prime number");
                }
            }
        }

    }