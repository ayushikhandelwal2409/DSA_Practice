package tree;

public class binaryTree_client {
    public static void main(String[] args) {
        binaryTree bt=new binaryTree();
        bt.display();
    }
}
//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
//        20<--10-->30
//        40<--20-->50
//        .<--40-->.
//        .<--50-->.
//        .<--30-->60
//        70<--60-->.
//        .<--70-->.