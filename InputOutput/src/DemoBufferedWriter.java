import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {

	public static void main(String[] args) throws IOException {
		try(FileWriter f = new FileWriter("c:\\programdemo/myfile.txt");
				BufferedWriter w = new BufferedWriter(f);){
			   String s1 = "Hello";
			   String s2 = "World";
			   
			   w.write(s1);
			   w.write(s2);
		}

	}

}
