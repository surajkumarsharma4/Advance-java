package com.jsp.teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TeacherSerialization {
public static void main(String[] args) {
	try {
		File file=new File("teacher.txt");
//	file.createNewFile();
		Teacher t1=new Teacher("nithin", 30, "SQL");
		Teacher t2=new Teacher("debasis", 32, "java");
		Teacher t3=new Teacher("avnith", 28, "adv java");
		Teacher t4=new Teacher("hemant", 25, "web tech");
		
		FileOutputStream fo=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(fo);
		
		os.writeObject(t1);
		os.writeObject(t2);
		os.writeObject(t3);
		os.writeObject(t4);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
