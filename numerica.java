package swap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numerica {
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	char c=(char) br.read();
	if(c!='i'  && c!='q')
	{
		System.out.println(c);
	}
	else
	{
		exit();
	}
		
		
		
}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}
}
