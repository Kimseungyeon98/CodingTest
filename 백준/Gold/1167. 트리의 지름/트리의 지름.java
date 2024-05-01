import java.util.*;
import java.io.*;

public class Main {
	static List<ArrayList<Node>> list;
	static boolean[] visit;
	static int n,max;
	static int farNode;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<ArrayList<Node>>();
		
		visit = new boolean[n+1];
		
		max = Integer.MIN_VALUE;
		
		for(int i=0; i<n+1; i++) {
			list.add(new ArrayList<Node>());
		}
		
		for(int i=0; i<n; i++) {			
			st = new StringTokenizer(br.readLine());	
			int index = Integer.parseInt(st.nextToken());
			while(true) {
				int a = Integer.parseInt(st.nextToken());
				if(a==-1) break;
				int b = Integer.parseInt(st.nextToken());
				
				Node node = new Node(a,b);
				list.get(index).add(node);
			}
		}
		
		// 임의의 노드에서부터 가장 먼 노드를 찾고 farNode에 해당 노드의 인덱스를 저장
		dfs(1,0);
		
		// 저장된 farNode에서 부터 가장 먼 노드의 탐색 결과를 구한다.
		visit = new boolean[n+1];
		dfs(farNode,0);
		
		System.out.println(max);
	}
	
	static void dfs(int start, int length) {
		if(!visit[start]) {
			visit[start] = true;
			for(Node node : list.get(start)) {
				if(!visit[node.index]) {
					length += node.value;
					/* max = Math.max(length, max); */
					if(max<length) {
						max = length;
						farNode = node.index;
					}
					dfs(node.index, length);
					length -= node.value;
				}
			}
		}
	}
	
	static class Node {
		int index;
		int value;
		Node(int index, int value){
			this.index = index;
			this.value = value;
		}
	}
}