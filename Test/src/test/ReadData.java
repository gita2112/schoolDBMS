package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {

	private String fileName;
	BufferedReader br= null;
	
	// Parameterized constructor to initialize filename
	public void Csv(String fileName) throws FileNotFoundException {
		
		this.fileName= fileName;
		br= new BufferedReader(new FileReader(fileName));
	}
	public List<String> getData (String str) throws IOException{
		String headerRow = br.readLine();
		String headerArgs[] = headerRow.split(",");
		String secondRow = br.readLine();
		String secondArgs[] = secondRow.split(",");
		List<String> list = new ArrayList<String>();
		for(int i=0;i<secondArgs.length;i++) {
			list.add(secondArgs[i]);
		}
		return list;
		
	}
}
