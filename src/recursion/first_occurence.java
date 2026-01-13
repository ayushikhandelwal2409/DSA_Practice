package recursion;

public class first_occurence {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,4,3};
        int item=4;
        System.out.println(ind(arr,item,0));
    }
    public static int ind(int[] arr,int item,int i){
        if(i==arr.length){
            //System.out.println("not found");
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return ind(arr,item,i+1);
    }
}


