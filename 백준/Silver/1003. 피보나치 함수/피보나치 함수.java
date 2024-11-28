import java.util.Scanner;

public class Main{
    static Integer[][] fibonacciArr = new Integer[41][2];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        fibonacciArr[0][0] = 1;
        fibonacciArr[0][1] = 0;
        fibonacciArr[1][0] = 0;
        fibonacciArr[1][1] = 1;
        
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int num = sc.nextInt();
            System.out.println(fibonacci(num)[0]+" "+fibonacci(num)[1]);
        }
        
        sc.close();
    }
    
    static Integer[] fibonacci(int num){
        if(fibonacciArr[num][0]==null||fibonacciArr[num][1]==null){
            fibonacciArr[num][0] = fibonacci(num-1)[0] + fibonacci(num-2)[0];
            fibonacciArr[num][1] = fibonacci(num-1)[1] + fibonacci(num-2)[1];
        }
        return fibonacciArr[num];
    }
}