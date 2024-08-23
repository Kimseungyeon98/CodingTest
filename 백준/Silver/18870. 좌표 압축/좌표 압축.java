import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 갯수 입력
        int n = Integer.parseInt(br.readLine());

        // 리스트 생성 후 입력받기
        Integer[] numArray = new Integer[n];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        // 리스트 복사 후 정렬할 리스트 생성 (원본을 가지고 있어야 인덱스를 뽑아낼 수 있음)
        Integer[] numSortArray = numArray.clone();
        // 배열을 정렬
        Arrays.sort(numSortArray);
        // 인덱스를 저장할 맵 생성
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();

        int index=0;

        for(int i=0; i<n; i++) {
            if(!numMap.containsKey(numSortArray[i]))
                numMap.put(numSortArray[i], index++);
        }

        for(int i=0; i<n; i++)
            sb.append(numMap.get(numArray[i])+" ");

        System.out.print(sb);
    }
}