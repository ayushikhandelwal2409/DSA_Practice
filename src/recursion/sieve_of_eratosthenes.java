package recursion;
public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n=10;
        int ans=countPrimes(n);
        System.out.println(ans);
    }
    public static int countPrimes(int n) {
        if (n <2) return 0;  // No primes below 2

        // Create a boolean array to mark primes
        boolean[] isPrime = new boolean[n];

        // Assume all numbers are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Apply the Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Start marking multiples of i from i * i to n
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
