import java.io.*;
public class demofileReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileReader f = new FileReader("c:\\programdemo/myfile.txt");) {
			int ch;
			while((ch = f.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
		}

	}

}
