package jpmc;
import java.util.*;
public class busyman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] pr = new Pair[n];
        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            pr[i] = new Pair(st, et);
        }
        Arrays.sort(pr, new Comparator<Pair>(){

            @Override
            public int compare(Pair o1, Pair o2){
                return o1.et - o2.et;
            }
        });

        int activity = 1;
        int end = pr[0].et;
        for (int i = 1; i < pr.length; i++) {
            if(pr[i].st >= end){
                activity++;
                end = pr[i].et;
            }
        }
        System.out.println(activity);
    }

    static class Pair{
        int st;
        int et;
        public Pair(int st, int et){
            this.st = st;
            this.et = et;
        }
// 7 9
// 0 10
// 4 5
// 8 9
// 4 10
// 5 7
        //output ==>3
    }
}
