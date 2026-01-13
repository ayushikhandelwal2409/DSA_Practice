package generics;

public class generics_demo {
    public static void main(String[] args) {
        Integer[] arr={10,20,40,4,60};
        display(arr);
        String[] arr1={"kaju","ayu","bhumu"};
        display(arr1);
        System.out.println(get(arr));
        //will give error as type is int and we are giving string
    }
    public static <T>void display(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static <t> t get(t[] arr){
        return arr[0];
    }
}
