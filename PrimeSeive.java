        //what is prime seive?
        // The prime seive is an algo to efficiently generate all the prime numbers up to a specified limit N.
        
        // Steps:
        // Create a boolean array isPrime[] where each index represent if the number is prime
        // Initially mark all the numbers fron 2 to N as true
        // Starting from the first prime(2) mark all multiples of 2 as false;
        // Move to the next value/number that is still marked true, and mark it's all multiples as false;
        // Continue this until you reach square root of N.
public class PrimeSeive{
    public static void main(String[] args) {
        int n=21;
        seive(n);
    }
    public static void seive(int n){
        boolean[]isPrime=new boolean[n+1];
        for(int i=0;i<=n;i++){
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int i=p*p;i<=n;i+=p){
                    isPrime[i]=false;
                }
            }
        }
        System.out.println("Prime Numbers upto : "+n+" :");
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }

}