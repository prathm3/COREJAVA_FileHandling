package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutput {
	public static void main(String[] args) {
		try(BufferedInputStream bis = new  BufferedInputStream(new FileInputStream("emp.dat"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("empcpy.dat"));){
			
			int x = bis.read();
			while(x != -1) {
				System.out.println(x);
				bos.write(x);
				x = bis.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
