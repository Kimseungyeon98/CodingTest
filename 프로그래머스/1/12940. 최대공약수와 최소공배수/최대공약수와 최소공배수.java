import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        // [최대공약수, 최소공배수]
        if(n>m){
            int tmp = n;
            n=m;
            m=tmp;
        }
        return new int[]{gcd(n,m),lcm(n,m)};
    }

    public int gcd(int a, int b){
        int gcd = 0;
        ArrayList<Integer> aArr = new ArrayList<>();
        ArrayList<Integer> bArr = new ArrayList<>();
        for(int i=1; i<=a/2; i++) {
            if(a%i==0){
                aArr.add(i);
            }
        }
        for(int i=1; i<=b/2; i++) {
            if(b%i==0){
                bArr.add(i);
            }
        }
        aArr.add(a);
        bArr.add(b);

        for(int bNum:bArr){
            for(int aNum:aArr){
                if(aNum==bNum) gcd=bNum;
            }
        }
        return gcd;
    }


    public int lcm(int a, int b){
        int lcm = 0;
        // 3,12
        int n = a;
        int m = b;
        while(true) {
            if(a==b) {
                lcm = a;
                break;
            }
            a+=n;
            if(a>b) b+=m;
        }
        return lcm;
    }
}