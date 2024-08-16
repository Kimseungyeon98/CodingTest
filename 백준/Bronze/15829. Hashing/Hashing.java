import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long result = 0L;
        long powerOf31 = 1L;
        final int MOD = 1234567891;

        for (int i = 0; i < n; i++) {
            int v = (int) str.charAt(i) - 96;
            result = (result + (v * powerOf31) % MOD) % MOD;
            powerOf31 = (powerOf31 * 31) % MOD;
        }

		System.out.println(result%1234567891);
	}
}