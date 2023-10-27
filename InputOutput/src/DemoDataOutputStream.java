import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileOutputStream f = new FileOutputStream("c:\\programdemo/myfile.txt");
				DataOutputStream d = new DataOutputStream(f)){
			d.writeUTF("hey");
			d.writeInt(5);
			d.writeFloat(67.5f);
		}

	}

}
