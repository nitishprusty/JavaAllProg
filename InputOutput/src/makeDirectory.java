import java.io.*;
public class makeDirectory {

	public static void main(String[] args) {
	   
		File f = new File("c://programdemo");
		
		//.mkdir() is used to create new directory
		boolean b = f.mkdir();
		System.out.println(b);
		System.out.println(f.isDirectory());
      
	}

}
