import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demofileinputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileInputStream f = new FileInputStream("c:\\programdemo/myfile.txt");) {
			int ch;
			while((ch = f.read()) != -1) {
				System.out.print((char) ch);
			}
		}

	}

}
