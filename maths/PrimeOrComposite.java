    import java.util.*;

    public class PrimeOrComposite{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            input.close();
            isPrimeOrComposite(n);
        }

        private static void isPrimeOrComposite(int n){
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    System.out.println(n+" is a Composite number");
                    return;
                }
            }
            System.out.println(n +" is a Prime number");
        }
    }