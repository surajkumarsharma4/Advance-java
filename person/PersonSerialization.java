package com.jsp.person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerialization {
public static void main(String[] args) {
	
	try {
		File file=new File("person.txt");
//		file.createNewFile();
		Person p1=new Person("suraj", 2000, 23);
		Person p2=new Person("ram", 3000, 12);
		Person p3=new Person("shyam", 1200, 24);
		Person p4=new Person("sonu", 1500, 28);
			
			FileOutputStream fo = new FileOutputStream(file);
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(p1);
			os.writeObject(p2);
			os.writeObject(p3);
			os.writeObject(p4);
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}
