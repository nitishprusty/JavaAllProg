import java.io.*;
public class demofilewriter {

	public static void main(String[] args) throws IOException{
		
		try(FileWriter f = new FileWriter("c:\\programdemo/myfile.txt");){  //try-with  resource
			String s = "A quick brown fox jumps over the lazy dog";
			for(int i =0;i<s.length();i++) {
				f.write(s.charAt(i));
			}
		}catch(IOException e) {
			System.out.println("Failed to write in txt file");
		}
	}

}
