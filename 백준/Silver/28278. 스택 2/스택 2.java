import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int j = sc.nextInt();
            switch(j){
                case 1:
                    int n = sc.nextInt();
                    list.add(n);
                    break;
                case 2:
                    if(list.size()!=0) {
//                        System.out.println(list.get(list.size()-1));
                        sb.append(list.get(list.size()-1)+"\n");
                        list.remove(list.size()-1);
                    } else {
//                        System.out.println(-1);
                        sb.append(-1+"\n");
                    }
                    break;
                case 3:
//                    System.out.println(list.size());
                    sb.append(list.size()+"\n");
                    break;
                case 4:
                    if(list.size()!=0){
//                        System.out.println(0);
                        sb.append(0+"\n");
                    } else {
//                        System.out.println(1);
                        sb.append(1+"\n");
                    }
                    break;
                case 5:
                    if(list.size()!=0) {
//                        System.out.println(list.get(list.size()-1));
                        sb.append(list.get(list.size()-1)+"\n");
                    } else {
//                        System.out.println(-1);
                        sb.append(-1+"\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

}