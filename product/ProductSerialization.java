package com.jsp.product;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ProductSerialization {
public static void main(String[] args) {
	
		try {
			File file=new File("product.txt");
//		file.createNewFile();
			Product p1=new Product("book", 200, 4);
			Product p2=new Product("mobile", 20000, 2);
			Product p3=new Product("pen", 10, 34);
			Product p4=new Product("shirt", 500, 3);
			
			FileOutputStream fo=new FileOutputStream(file);
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
