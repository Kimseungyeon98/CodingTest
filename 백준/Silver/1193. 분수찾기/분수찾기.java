import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int floor = 0;
        int max= 0;

        while(true){
            max = floor*(floor+1)/2;
            if (max>=n) {
                break;
            }
            floor++;
        }

        int xy = max - n;

        if(floor%2==0) {
            System.out.println((floor-xy)+"/"+(1+xy));
        } else {
            System.out.println((1+xy)+"/"+(floor-xy));
        }
    }
}