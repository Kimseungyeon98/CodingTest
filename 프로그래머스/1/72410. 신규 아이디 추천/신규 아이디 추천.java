class Solution {
   public String solution(String new_id) {
        String answer = new_id;
       // 1단계
       answer = answer.toLowerCase();
       
       // 2단계
    	// char[] ch = answer.toCharArray();
    	// for(char c: ch) {
    	// 	if((c>='a'&&c<='z')||(c>='0'&&c<='9')||c=='-'||c=='_'||c=='.') {
    	// 		answer+=c;
    	// 	}
    	// }
       answer = answer.replaceAll("[^a-z0-9-_.]", ""); // 2단계
       
       // 3단계
    	// do {
    	// 	answer.replace("..", ".");
    	// } while(answer.contains(".."));
       answer = answer.replaceAll("[.]{2,}", "."); // 3단계
    	
       // 4단계
    	// if(answer.charAt(0)=='.') {
    	// 	answer = answer.substring(1,answer.length());
    	// }
    	// if(answer.charAt(answer.length()-1)=='.') {
    	// 	answer = answer.substring(0,answer.length()-1);
    	// }
       answer = answer.replaceAll("^[.]|[.]$", "");
       
       // 5단계
       if(answer.equals("")) {
    		answer = "a";
    	}
       
       // 6단계
       if(answer.length()>15) {
    		answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
    	}
       
       // 7단계
       if(answer.length()==1) {
    		answer += answer.charAt(0);
           answer += answer.charAt(0);
    	} else if(answer.length()==2) {
    		answer += answer.charAt(1);
    	}
       
        System.out.println(answer);
        return answer;
    }
}