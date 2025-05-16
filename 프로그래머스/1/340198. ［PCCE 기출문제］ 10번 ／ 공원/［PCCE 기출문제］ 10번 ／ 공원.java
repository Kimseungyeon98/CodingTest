class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int maxLength = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (isEmptySpace(park[i][j])) {
                    int tmp = 1;
                    while (i + tmp <= park.length && j + tmp <= park[0].length) {
                        if (isAllEmpty(park, i, j, tmp)) {
                            maxLength = Math.max(maxLength, tmp);
                            tmp++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        for (int n : mats) {
            if (maxLength >= n) {
                answer = Math.max(answer, n);
            }
        }

        return answer;
    }
    public boolean isEmptySpace(String s){
        if(s.equals("-1")){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isAllEmpty(String[][] park, int startY, int startX, int size) {
        for (int i = startY; i < startY + size; i++) {
            for (int j = startX; j < startX + size; j++) {
                if (i >= park.length || j >= park[0].length || !isEmptySpace(park[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}