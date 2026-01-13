package Assignment_2;

public class valid_Perfect_square {
    public static void main(String[] args) {
        int n=25;//true
        System.out.println(check_perfect_square(n));

        int m = 99;   // false
        System.out.println(check_perfect_square(m));

        int o=0;   // true
        System.out.println(check_perfect_square(o));

        int p=1;   // true
        System.out.println(check_perfect_square(p));
    }
    public static boolean check_perfect_square(int n){
        if(n<2)  return true;  //because 0 and 1 both are perfect squares
        int low=2;
        int high=n/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sq = (long) mid * mid;
            if(sq==n) return true;
            else if(sq>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}


//tc=O(log n)
//sc=O(1)