import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        // String c ="";
        // for(String a:phone_book) {
        //     for(String b:phone_book) {
        //         if(a.length()<=b.length()){
        //         c=b.substring(0,a.length());
        //         if(!a.equals(b)&&c.contains(a)) {answer=false; break;}
        //     }
        //     if(!answer) break;
        // }
        //     }
        // -----------------------------------
        // Arrays.sort(phone_book);
        // HashSet<String> hs = new LinkedHashSet<>();
        // for(String s:phone_book) {
        //     hs.add(s);
        // }
        // String c ="";
        // for(String a:hs){
        //         for(String b:hs) {
        //             if(a.length()<=b.length()){
        //                 c=b.substring(0,a.length());
        //                 if(!a.equals(b)&&a.contains(c)) {
        //                     answer=false;
        //                     break;
        //                 }
        //             }
        //         }
        //         if(!answer) break;
        //     }
        // -----------------------------------
        HashMap<String,Integer> hm = new HashMap<>();
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length;i++){
            hm.put(phone_book[i],i);
        }
        for(String s:phone_book){
            for(int i=1; i<s.length();i++) {
                if(hm.containsKey(s.substring(0,i))) return false;
            }
        }
        return true;
    }
}