import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws IOException{
		
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(date));

	}
}