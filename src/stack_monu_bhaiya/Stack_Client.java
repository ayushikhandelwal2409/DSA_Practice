package stack_monu_bhaiya;

public class Stack_Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        stack_class st = new stack_class();
        //interface ka object direct ni bna skte phle usko kisi class m implement krenge then object bnaenge
        stackI st1=new stackI() {
            @Override
            public void push(int item) {

            }

            @Override
            public int peek() {
                return 0;
            }
        };
    }
}