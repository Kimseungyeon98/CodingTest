class Solution {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int total_time = translateTime(video_len); // 총 시간
        int present_time = translateTime(pos); //현재 위치
        int opening_start = translateTime(op_start);
        int opening_end = translateTime(op_end);
        
        for(int i=0; i< commands.length; i++){
            if(opening_start <= present_time && present_time <= opening_end){
                    present_time = opening_end;
                }
            if(commands[i].equals("next")){
                if(opening_start <= present_time && present_time <= opening_end){
                    present_time = opening_end;
                }
                if(present_time > total_time-10){
                    present_time = total_time;
                }else {
                    present_time += 10;
                }
                if(opening_start <= present_time && present_time <= opening_end){
                    present_time = opening_end;
                }
            }else if(commands[i].equals("prev")){
                if(present_time < 10){
                    present_time = 0;
                }else {
                    present_time -= 10;
                }
            }
            if(opening_start <= present_time && present_time <= opening_end){
                    present_time = opening_end;
                }
        }

        return resultTime(present_time);
    }
    public static int translateTime(String time){
        int mm = Integer.parseInt(time.substring(0,2));
        int ss = Integer.parseInt(time.substring(3,5));
        return (mm*60)+ss;
    }
    public static String resultTime(int time){
        int mm = time/60;
        int ss = time%60;
        String result = "";
        if(mm==0){
            result+="00";
        } else if(mm<10){
            result+="0"+mm;
        }else {
            result+=mm;
        }
        result+=":";
        if(ss==0){
            result+="00";
        } else if(ss<10){
            result+="0"+ss;
        }else {
            result+=ss;
        }
        return result;
    }
}