import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		
//		Scanner inputScanner=new Scanner(System.in);
		
		
		
		
		InputStreamReader keyBoardReader=new InputStreamReader(System.in);
		BufferedReader inputReader=new BufferedReader(keyBoardReader);
		
		
		String line=inputReader.readLine();
		
		
		System.out.println(line);
		
	}
}
