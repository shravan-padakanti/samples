package org.shravan.sample;

public class BinaryTree {

	Node root;
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.insertData(50);
		bt.insertData(25);
		bt.insertData(75);
		
		System.out.println(bt.find(85));
		
	}
	
	public void insertData(int data){
		Node insertNode = new Node(data);
		if(root==null){
			root = insertNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true){
			parent = current;
			if(data < current.getData()){
				current = current.getLeftNode();
				if(current==null){
					parent.setLeftNode(insertNode);
					return;
				}
			}else if(data>current.getData()){
				current = current.getRightNode();
				if(current==null){
					parent.setRightNode(insertNode);
					return;
				}
			}
		}
		
	}
	
	public boolean find(int data){
		Node node=null;		
		if(root==null)
			return false;
		
		node = root;
		
		while (true){
			if( node!=null && data==node.getData())
				return true;
			else if(node!=null && data<node.getData())
				node=node.getLeftNode();
			else if(node!=null && data>node.getData())
				node=node.getRightNode();
			else
				return false;
		}
	}

}
