package p;

import java.io.*;
import java.util.*;

class Node {
int data;
Node left;
Node right;

Node(int v){
this.data=v;
this.left=this.right=null;
}  
}

class postOrder{
public static void printPostorder(Node node) {
if(node==null) {
return;
}else {
printPostorder(node.left);
printPostorder(node.right);
System.out.println(node.data);
}
}
public static void main(String[] args) {
Node root=new Node(100);
root.left=new Node(20);
root.right=new Node(200);
root.left.left=new Node(10);
root.left.right=new Node(30);
root.right.left=new Node(150);
root.right.right=new Node(300);

System.out.println("Postorder Traversal: ");
printPostorder(root);
}
}
