import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();

        String[] numList = new String[n.length()];

        for (int i = 0; i < n.length(); i++) {
            numList[i] = Character.toString(n.charAt(i));
        }

        Arrays.sort(numList,Comparator.reverseOrder());

        int zeroCnt = 0;
        for (int i = 0; i < n.length(); i++) {
            if (numList[i].equals("0")) {
                zeroCnt += 1;
            } else {
                sb.append(numList[i]);
            }
        }
        for (int i = 0; i < zeroCnt; i++) {
            sb.append("0");
        }
        System.out.println(sb);
    }
}