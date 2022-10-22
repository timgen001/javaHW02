package hw001;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw009
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請問要選哪條路");
		System.out.println("輸入整數");

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		char ans = (res == 1)?'A':'B';
		
		System.out.println("選" + ans + "路線");
			
		
	}
}
