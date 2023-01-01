package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutput {
	public static void main(String[] args) {
		try(DataInputStream dis = new DataInputStream(new FileInputStream("file.dat"));
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("add.dat"));){
			String str = dis.readLine();
			while(!str.equals("")) {
				int x = Integer.parseInt(str);
				int sum=0;
				while(x>0)
				{
					int digit = x%10;
					sum=sum+digit;
					x=x/10;
				
				}
				dos.write(sum);
				str = dis.readLine();
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
