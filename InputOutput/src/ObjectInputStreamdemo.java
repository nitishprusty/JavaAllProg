//package com.accenture.lkm;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamdemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(FileInputStream f=new FileInputStream("c:\\program/my.txt");
				ObjectInputStream d=new ObjectInputStream(f)){
			Employee e1=(Employee) d.readObject();
			System.out.println(e1);
		}

	}

}
