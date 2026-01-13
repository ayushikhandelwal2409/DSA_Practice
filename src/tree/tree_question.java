package tree;

import java.util.*;

public class tree_question {
    class Node{
        Node right;
        Node left;
        int val;
    }
    private Node root;
    Scanner in=new Scanner(System.in);
    public tree_question(){
        root=createTree();
    }
    private Node createTree(){
        int item=in .nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=in.nextBoolean();//has left child
        if(hlc){
            nn.left=createTree();
        }
        boolean hrc=in.nextBoolean(); //has right child
        if(hrc){
            nn.right=createTree();
        }
        return nn;
    }
    public boolean find(int item){
        return  find(root,item);
    }
    private boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.val==item){
            return true;
        }
        boolean left=find(nn.left,item);
        boolean right=find(nn.right,item);
        return left||right;
    }
    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(nn.left);
        int rmax=max(nn.right);
        return Math.max(nn.val,Math.max(lmax,rmax));
    }
    public int height(){
        return height(root);
    }
    private int height(Node nn){
        if(nn==null){               // by returning 0 the height of only one node is 1
            return -1;            //by this way height of single node(only one node) is 0;
        }
        int left= height(nn.left);
        int right=height(nn.right);
        return Math.max(left,right)+1;
    }
    public void preorder_traversal(){
        preorder_traversal(root);
    }
    private void preorder_traversal(Node nn){
        if(nn==null){
            return;
        }
        System.out.print(nn.val+" ");
        preorder_traversal(nn.left);
        preorder_traversal(nn.right);
    }
    public void inorder_traversal(){
        inorder_traversal(root);
    }
    private void inorder_traversal(Node nn){
        if(nn==null){
            return;
        }
        inorder_traversal(nn.left);
        System.out.print(nn.val+" ");
        inorder_traversal(nn.right);
    }
    public void postorder_traversal(){
        postorder_traversal(root);
    }
    private void postorder_traversal(Node nn){
        if(nn==null){
            return;
        }
        postorder_traversal(nn.left);
        postorder_traversal(nn.right);
        System.out.print(nn.val+" ");
    }
    public void level_order(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node n=q.poll();
            System.out.print(n.val+" ");
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
        System.out.println();
    }
}
