import java.io.*;
public class demoFileOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileOutputStream f = new FileOutputStream("c:\\programdemo/myfile.txt");) {
			
			String msg = "This is a demo message";
			for(int i = 0;i<msg.length();i++) {
				f.write(msg.charAt(i));
			}
		}

	}

}
