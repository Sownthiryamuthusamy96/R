import java.util.*;
import java.io.*;
public class FUNC {
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String ss=br.readLine();
	int count=0,i,j,a=0,cunt=0;
    for(i=0;i<ss.length();i++)
	{
		count++;
	}
	System.out.println(count);
	for(j=0;j<ss.length();j++)
	{
	   a=Integer.valueOf(j);
	   cunt++;
	}
	
	System.out.println(cunt);
	}
}
