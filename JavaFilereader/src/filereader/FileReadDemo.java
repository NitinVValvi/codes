package filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReadDemo {
public static void main(String[] args) {
	

	
	List<String> inputByLine = new ArrayList<>();
	try {
	
		InputStreamReader isreader = new InputStreamReader(System.in,"UTF-8");
		
		BufferedReader breader = new BufferedReader(isreader);
		
		
		String line ="";
		while((line=breader.readLine())!=null)
		{
			inputByLine.add(line.toString());
		}
		for(String line2 :inputByLine)
		{
			System.out.println(line2);
		}
		isreader.close();
	}catch(IOException e){
		
		e.printStackTrace();
	}
	finally {
		
	}
}
}