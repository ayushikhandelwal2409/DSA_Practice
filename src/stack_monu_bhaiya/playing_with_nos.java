package stack_monu_bhaiya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class playing_with_nos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> A0=new Stack<>();
        int N = in.nextInt();
        int Q =in.nextInt();
        for (int i = 0; i < N; i++) {
            int k=in.nextInt();
            A0.push(k);
        }
        List<Integer> primes=generatePrimes(Q);

        ArrayList<Stack<Integer>> B = new ArrayList<>();
        ArrayList<Stack<Integer>> A = new ArrayList<>();
        A.add(A0);

        // Process each iteration
        for (int i = 0; i < Q; i++) {
            Stack<Integer> currentA = A.get(i);
            Stack<Integer> currentB = new Stack<>();
            Stack<Integer> nextA = new Stack<>();
            int prime = primes.get(i);

            // Process the current pile
            while (!currentA.isEmpty()) {
                int card = currentA.pop();
                if (card % prime == 0) {
                    currentB.push(card);
                } else {
                    nextA.push(card);
                }
            }

            // Store the new piles
            B.add(currentB);
            A.add(nextA);
        }

        // Output the results
        for (int i = 0; i < B.size(); i++) {
            Stack<Integer> bPile = B.get(i);
            while (!bPile.isEmpty()) {
                System.out.println(bPile.pop());
            }
        }

        // Output the last A pile
        Stack<Integer> lastAPile = A.get(Q);
        while (!lastAPile.isEmpty()) {
            System.out.println(lastAPile.pop());
        }
    }
    private static List<Integer> generatePrimes(int count) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Start checking for primes from 2
        while (primes.size() < count) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

//You are at a casino. There are N stacked cards on pile A0. Each card has a number written on it. Then there will be Q iterations.
//In ith iteration, you start picking up the cards in Ai-1th pile from the top one by one and check whether the number written on the card is
//divisible by the ith prime number. If the number is divisible, you stack that card on pile Bi. Otherwise, you stack that card on pile Ai.
//After Q iterations, cards can only be on pile B1, B2, B3, . . . BQ, AQ . Output numbers on these cards from top to
//bottom of each piles in order of B1, B2, B3, . . . BQ, AQ .
//Input Format
//First line contains N and Q. The next line contains N space separated integers representing the initial pile of cards i.e., A0.
//The leftmost value represents the bottom plate of the pile.

//Sample Input
//5 1
// 3 4 7 6 5
//Sample Output
//        4
//        6
//        3
//        7
//        5
//Explanation
//Initially:
//
//A0 = [3, 4, 7, 6, 5]<-TOP
//
//After 1st iteration:
//
//A0 = []<-TOP
//
//A1 = [5, 7, 3]<-TOP
//
//B1 = [6, 4]<-TOP
//
//Now first print B1 from top to bottom then A1 from top to bottom.


//N=5 ,Q=2
//        3 4 7 6 27
//        4
//        6
//        27
//        3
//
//        7