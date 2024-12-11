import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        // 테스트 갯수 입력받기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            numArray[i]=Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> sumArrayList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n-2; i++) { //0 1
            for (int j = i+1; j < n-1; j++) { // 1 2
                for (int k = i+2; k < n; k++) { // 2 3
                    if(i!=j && i!=k && j!=k) {
                        sum = numArray[i] + numArray[j] + numArray[k];
                    }
                    if(sum<=m){
                        sumArrayList.add(sum);
                    }
                }
            }
        }
        System.out.println(Collections.max(sumArrayList));
    }
}