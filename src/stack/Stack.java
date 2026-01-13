package stack;

public class Stack {
    private int idx=-1;
    private int[] arr;
    public  Stack(){
        arr=new int[5];// Initialize the instance variable
    }
    public  Stack(int n){
        arr=new int[n];// Initialize the instance variable
    }
    public void push(int item)throws Exception{
        if(isFull()){
            throw new Exception("overflow");
        }
        idx++;
        arr[idx]=item;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("underflow");
        }
        int rv=arr[idx];
        idx--;
        return rv;
    }
    public boolean isEmpty(){
        return idx==-1;
    }
    public boolean isFull(){
        return idx==arr.length-1;
    }
    public int size(){
        return idx+1;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("underflow");
        }
        return arr[idx];
    }
    public void Display(){
        for (int i = 0; i <=idx ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
