package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandle {
	public static void main(String[] args) {
		copyOrAppend("emp.dat", "add.dat");
	}

	private static void copyOrAppend(String string, String string2) {
		// TODO Auto-generated method stub
		File f= new File(string2);
		FileOutputStream fos = null;
			
		try {
			if(f.exists()) 
			fos = new FileOutputStream(string2, true);
		else
			fos = new FileOutputStream(string2);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream(string);
			FileOutputStream fos1 = fos;){
			int str = fis.read();
			while(str != -1) {
				fos.write(str);
				str = fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
}
