import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        long[][] matrix = new long[n+1][2];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        double sum = 0;

        matrix[n] = matrix[0];

        for(int i=0; i<n; i++) {
            sum += matrix[i][0] * matrix[i+1][1] - matrix[i][1] * matrix[i+1][0];
        }
        System.out.println(String.format("%.1f", Math.abs(sum/2)));
    }
}