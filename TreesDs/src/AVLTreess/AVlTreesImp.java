package AVLTreess;

class Node{
	int data;
	Node left;
	Node right;
	int ht;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
		this.ht=1;
	}
}
class AVLTrees{
	 static Node root=null;
	static int height(Node node) {
		if(node==null) {
			return 0;
		}
		return node.ht;
	}
	
	static int getBalance(Node node) {
		if(node==null) {
			return 0;
		}
		return height(node.left)-height(node.right);
	}
	
    static void insert(int value) {
	 root=insert(root,value);
    }
    static Node insert(Node node,int value) {
    	if(node==null) {
    		return new Node(value);
    	}
        if(value<node.data) {
    		node.left=insert(node.left, value);
    	}
    	else if(value>node.data) {
    		node.right=insert(node.right,value);
    	}else {
    		return node;
    	}
    	
    	 
    	 node.ht=1+(Math.max(height(node.left),height(node.right)));
    	 int bf=getBalance(node);
    	 
    	 //bf>1 left heavy bf<-1 right heavy 
    	 if(bf>1 && value<node.left.data) {//LL
    		return rightRotation(node);
    	 }
    	 if(bf<-1 && value>node.right.data) {//RR
    		 return LeftRotation(node);
    	 }
    	 if(bf>1 && value>node.left.data){//LR
    		 node.left=LeftRotation(node.left);
    		 return rightRotation(node);
    	 }
    	 if(bf<-1 &&  value<node.right.data) {//RL
    		 node.right=rightRotation(node.right);
    		 return LeftRotation(node);
    	 }
    	 
    	 return node;
    }

	public  static Node rightRotation(Node y) {
		Node x=y.left;
		Node T=x.right;
		x.right=y;
		y.left=T;
		x.ht=1+Math.max(height(x.left),height(x.right));
		y.ht=1+Math.max(height(y.left),height(y.right));
		return x;
	}
	
    public  static Node LeftRotation(Node x) {
		Node y=x.right;
		Node T=y.left;
		y.left=x;
		x.right=T;
		x.ht=1+Math.max(height(x.left),height(x.right));
		y.ht=1+Math.max(height(y.left),height(y.right));
		return y;
	}
    
    public void InOrderTraversal(Node node) {
    	if(node==null) {
    		return;
    	}
    	InOrderTraversal(node.left);
    	System.out.print(node.data+" ");
    	InOrderTraversal(node.right);

    }
}
public class AVlTreesImp {
	public static void main(String[] args) {
      AVLTrees a =new AVLTrees();
      a.insert(10);
      a.insert(33);
      a.insert(78);
      a.insert(8);

      a.InOrderTraversal(a.root);
	}
}
