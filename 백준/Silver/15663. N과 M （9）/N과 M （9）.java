import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m;
    static int[] arr, result;
    static boolean[] visited;
    static Set<String> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        result = new int[m];
        visited = new boolean[n];

        set = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0);

        for(String s : set){
            System.out.print(s);
        }
    }

    static void dfs(int depth){
        if(depth==m){
            String k = "";
            for(int num : result){
                k += num + " ";
            }
            k += "\n";
            set.add(k);
            return;
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}