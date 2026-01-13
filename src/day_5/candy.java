package day_5;
import java.util.*;

//There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
//
//You are giving candies to these children subjected to the following requirements:
//
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//Return the minimum number of candies you need to have to distribute the candies to the children.


public class candy {
    public static void main(String[] args) {
        int[] ratings={1,0,2};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings) {
        int n=ratings.length;
        int[] candies=new int[n];
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int min=0;
        for(int candy:candies){
            min+=candy;
        }
        return min;

    }
}
//Input: ratings = [1,0,2]
//Output: 5
//Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
