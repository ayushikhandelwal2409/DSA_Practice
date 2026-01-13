package tree;

import java.util.Scanner;

public class binaryTree {
    class Node{
        Node right;
        Node left;
        int val;
    }
    private Node root;
    Scanner in=new Scanner(System.in);
    public binaryTree(){
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
    public void display(){
        display(root);
    }
    private void display(Node nn){
        if(nn==null){
            return;
        }
        String str="<--"+nn.val+"-->";
        if(nn.left!=null){
            str=nn.left.val+str;
        }
        else{
            str="."+str;
        }
        if(nn.right!=null){
            str=str+nn.right.val;
        }
        else{
            str+=".";
        }
        System.out.println(str);
        display(nn.left);
        display(nn.right);
    }
}
