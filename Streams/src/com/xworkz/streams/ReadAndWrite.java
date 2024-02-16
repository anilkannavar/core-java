package com.xworkz.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
	
	public static void main(String[] args) {
		String string="C:\\Users\\User\\Desktop\\core-java\\file.txt";
		
       try {
		BufferedWriter writer=new BufferedWriter(new FileWriter(string));
		writer.write("This is my text for read and write..."); 
		writer.newLine();
		writer.write("Java tutorial...");
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
    	   String srcString;
		BufferedReader reader=new BufferedReader(new FileReader(string));
		while((srcString = reader.readLine())!=null){
			System.out.println(srcString);

		}

		reader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
        
}
