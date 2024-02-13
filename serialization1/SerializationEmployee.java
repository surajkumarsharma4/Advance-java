package com.jsp.serialization1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEmployee {
public static void main(String[] args) {
	File file=new File("Employee.txt");
	try {
//		file.createNewFile();
		
	
		Employee employee1=new Employee(1, "suraj", 2000);
		Employee employee2=new Employee(2, "ram", 4000);
		Employee employee3=new Employee(3, "sonu", 3000);
		// push data into txt file
		FileOutputStream fs=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(fs);
				
		os.writeObject(employee1);
		os.writeObject(employee2);
		os.writeObject(employee3);
		os.flush();
		os.close();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
