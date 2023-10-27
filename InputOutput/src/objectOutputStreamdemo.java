import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objectOutputStreamdemo {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		
		try(FileOutputStream f = new FileOutputStream("c:\\programdemo/myfile.txt");
				ObjectOutputStream o = new ObjectOutputStream(f);){
			
			Employee e = new Employee(101,"Nitish");
			o.writeObject(e);
			
		}

	}

}
