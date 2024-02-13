package com.jsp.school;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SchoolSerialization {
	public static void main(String[] args) {
		try {
			File file=new File("school.txt");
//		file.createNewFile();
			School s1=new School("CBSE", 10, 12);
			School s2=new School("BSEB", 8, 5);
			School s3=new School("ICSE", 8, 9);
			School s4=new School("NIOS", 12, 7);
			
			FileOutputStream fo=new FileOutputStream(file);
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(s1);
			os.writeObject(s2);
			os.writeObject(s3);
			os.writeObject(s4);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
