import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static Node[] tree;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n  = Integer.parseInt(br.readLine());
		
		tree = new Node[26];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			char f = st.nextToken().charAt(0);
			char s = st.nextToken().charAt(0);
			char t = st.nextToken().charAt(0);

			Node node = new Node(f);

			if(s!='.') {
				node.left = new Node(s);
			}
			if(t!='.') {
				node.right = new Node(t);
			}
			tree[node.value-65] = node;
		}
		
		preOrder(tree[0]);
		System.out.println();
		inOrder(tree[0]);
		System.out.println();
		postOrder(tree[0]);
	}
	
	static void preOrder(Node node) {
		if(node == null) return;
		System.out.print(node.value);
		if(node.left != null) preOrder(tree[node.left.value-65]);
		if(node.right != null) preOrder(tree[node.right.value-65]);
	}
	static void inOrder(Node node) {
		if(node == null) return;
		if(node.left != null) inOrder(tree[node.left.value-65]);
		System.out.print(node.value);
		if(node.right != null) inOrder(tree[node.right.value-65]);
	}
	static void postOrder(Node node) {
		if(node == null) return;
		if(node.left != null) postOrder(tree[node.left.value-65]);
		if(node.right != null) postOrder(tree[node.right.value-65]);
		System.out.print(node.value);
	}
}

class Node{
	char value;
	Node left;
	Node right;
	
	Node(char value){
		this.value = value;
		left = null;
		right = null;
	}
}