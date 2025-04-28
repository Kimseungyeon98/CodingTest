import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
      
      ArrayDeque<Integer> dq;  
      int n = Integer.parseInt(br.readLine());
      
      first:
      for(int i=0; i<n; i++) {
    	 dq = new ArrayDeque<>();
    	 //정방향 false
    	 boolean flag = false;
         char[] operationArr = br.readLine().toCharArray();
         int tn = Integer.parseInt(br.readLine());
         String str = br.readLine();
         String[] strArr;
         if(str.length()>2) {
            strArr = str.replaceAll("[\\[\\]\\s]", "").split(",");
            for(int k=0; k<strArr.length; k++) {
               dq.add(Integer.parseInt(strArr[k]));
            }
            for(int k=0;k<operationArr.length; k++) {
               if(operationArr[k] == 'R') {
                  flag = !flag;
               } else {
                  if(dq.size()>0) {
                	  //정방향
                	  if(!flag) {
                		  dq.pollFirst();  
                	  } else {
                		  dq.pollLast();
                	  }
                  } else {
                	  sb.append("error\n");
                     continue first;
                  }
               }
            }
         } else {
        	 for(int k=0;k<operationArr.length; k++) {
        		 if(operationArr[k]=='D') {
        			 sb.append("error\n");
                     continue first;
        		 }
        	 }
         }
         if(!flag) {
        	 sb.append("[");
        	 int sz = dq.size();
        	 for(int k=0; k<sz; k++) {
        		 if(k>0) {
        			 sb.append(",");        			 
        		 }
        		 sb.append(dq.pollFirst());
        	 }
        	 sb.append("]\n");
         } else {
        	 sb.append("[");
        	 int sz = dq.size();
        	 for(int k=0; k<sz; k++) {
        		 if(k>0) {
        			 sb.append(",");        			 
        		 }
        		 sb.append(dq.pollLast());
        	 }
        	 sb.append("]\n");
         }
      }
      
      System.out.println(sb.substring(0,sb.length()-1).toString());
   }
}