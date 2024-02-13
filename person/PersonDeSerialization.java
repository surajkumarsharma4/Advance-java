package com.jsp.person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeSerialization {
public static void main(String[] args) {
	
	try {
		File file=new File("person.txt");
		FileInputStream  fi=new FileInputStream(file);
		ObjectInputStream oi=new ObjectInputStream(fi);
		
			System.out.println(oi.readObject());
			System.out.println(oi.readObject());
			System.out.println(oi.readObject());
			System.out.println(oi.readObject());
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
