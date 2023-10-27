import java.io.IOException;

import java.io.File;

public class createNewfile {

	public static void main(String[] args) throws IOException{
		File f = new File("c:\\programdemo/myfile.txt");
		
		boolean b = f.createNewFile();
		System.out.println(b);
		System.out.println(f.isFile());

	}

}
