import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        // 테스트 갯수 입력받기
        int n = Integer.parseInt(st.nextToken());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;

            while(num!=0) {
                sum += num%10;
                num /= 10;
            }

            sum += i;

            if(sum==n) {
                resultList.add(i);
                break;
            }
        }
        if(resultList.size()==0){
            System.out.println(0);
        } else{
            System.out.println(Collections.min(resultList));
        }
    }
}