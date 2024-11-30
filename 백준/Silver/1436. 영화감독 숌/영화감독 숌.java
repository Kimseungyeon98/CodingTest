import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int result = 666;

        int cnt = 1;

        while (cnt!=n){
            result++;
            if(Integer.toString(result).contains("666")) {
                cnt+=1;
            }
        }
        System.out.println(result);
    }
}