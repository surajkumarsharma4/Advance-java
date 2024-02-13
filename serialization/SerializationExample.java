package com.jsp.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
public static void main(String[] args) {
	File file=new File("student1.txt");
//	System.out.println(file.exists());
//	if(!file.exists()) {
	
		try {
			
//			file.createNewFile();
//			System.out.println(file);
			
			Student student=new Student(1,"suraj","suraj@gmail.com");
			Student student1=new Student(2,"ram","ram@gmail.com");
			Student student2=new Student(3,"jay","jay@gmail.com");
			
			FileOutputStream fo=new FileOutputStream(file,true); //true is use to concatinate with older data
//			--> file input/output stream---
//			fo.write("suraj".getBytes());
//			FileInputStream fs=new FileInputStream(file);
//			System.out.println((char) fs.read());
			
			ObjectOutputStream os=new ObjectOutputStream(fo);		
			os.writeObject(student );
			os.writeObject(student1);
			os.writeObject(student2);
			os.flush();
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	}
}
}
