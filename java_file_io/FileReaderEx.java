package java_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		
		
		try {
			FileReader fr = new FileReader("D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\in.txt");
			
			int i;
			while ((i=fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
