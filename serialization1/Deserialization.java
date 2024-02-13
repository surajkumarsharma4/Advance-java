package com.jsp.serialization1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) {
		try {
//			ObjectInputStream os=new ObjectInputStream(new FileInputStream(new File("Employee.txt")));
			//--->use both
			File file=new File("Employee.txt");
			FileInputStream fi=new FileInputStream(file);
			ObjectInputStream os=new ObjectInputStream(fi);
			
			System.out.println(os.readObject());
			System.out.println(os.readObject());
			System.out.println(os.readObject());
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
}
