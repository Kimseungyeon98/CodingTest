import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).mapToInt(Integer::intValue).toArray();

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = 1;
            for(int j = i-1; j >= 0; j--){
                if(arr[i]>arr[j]){
                    result[i] = Math.max(result[i],result[j]+1);
                }
            }
        }

        System.out.println(Arrays.stream(result).max().getAsInt());
    }
}