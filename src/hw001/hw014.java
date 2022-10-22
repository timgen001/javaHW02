package hw001;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw014
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		for( int i = 1;i<=10 ;i++)
		{
			System.out.println("第" + i + "次迴圈");
			if(i==res)
				break;
		}	
	}
}
