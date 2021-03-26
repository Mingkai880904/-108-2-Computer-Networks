import java.util.*;
import java.io.*;

public class InputM{	//Get Input many string
	public static void main(String [] argv) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Please input a stream:");
String text = br.readLine();
	System.out.println("You input a stream is:" + text);
	}
}
