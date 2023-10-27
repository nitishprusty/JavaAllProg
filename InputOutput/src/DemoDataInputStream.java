import java.io.*;
public class DemoDataInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileInputStream f = new FileInputStream("c:\\programdemo/myfile.txt");
				DataInputStream d = new DataInputStream(f);) 
			
			{
				

				String s = d.readUTF();
				int i = d.readInt();
				float f1 = d.readFloat();
				
				System.out.println(s + " " + i + " " + f1);
				
				
		}

	}

}
