package java_file_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\in.txt");
		DataInputStream din = new DataInputStream(fin);
		
		int i;
		while ((i=din.read()) != -1) {
			System.out.print((char) i);
		}
		
		din.close();
	}

}
