import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cookingTime = sc.nextInt();

        if (m + cookingTime >= 60) {
            h += (m + cookingTime) / 60;
            m = (cookingTime+m) % 60;
            if (h>=24) {
                    h-=24;
            }
            if (m==60) {
                h++;
                m-=60;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m + cookingTime));
        }
    }
}