import java.io.*;
import java.util.*;

public class Main {
	static int[][] paper;
	static int white,blue;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		paper = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dc(0,0,n,n);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	//devide and conquer : 분할 정복
	static void dc(int startX, int startY, int endX, int endY) {
		//종이가 모두 같은 색인가?
		if(isAllCheck(startX, startY, endX, endY)) {
			if(paper[startY][startX]==1) {
				blue++;
			} else {
				white++;
			}
		}
		
		//종이가 모두 같은 색이 아닌가?
		else {
			//길이가 2 이상인가?
			if(endX-startX >= 2 && endY-startY >= 2) {
				int middleX = (startX+endX) / 2;
				int middleY = (startY+endY) / 2;
				dc(startX,startY,middleX,middleY);
				dc(startX,middleY,middleX,endY);
				dc(middleX,startY,endX,middleY);
				dc(middleX,middleY,endX,endY);
			} else { //길이가 2 이상이 아닌가?
				if(paper[startY][startX]==1) {
					blue++;
				} else {
					white++;
				}
			}
		}
	}
	
	// 모두 같은색이면 true , 다른 색이 하나라도 있다면 false
	static boolean isAllCheck(int startX, int startY, int endX, int endY) {
		int f = paper[startY][startX];
		for(int i=startY; i<endY; i++) {
			for(int j=startX; j<endX; j++) {
				if(paper[i][j]!=f) {
					return false;
				}
			}
		}
		return true;
	}
}