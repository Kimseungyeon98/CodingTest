import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        int n;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            if(n==0){
                if(maxHeap.size()==0){
                    System.out.println(0);
                    continue;
                } else {
                    System.out.println(maxHeap.poll());
                }
            } else {
                maxHeap.add(n);
            }
        }
    }
}