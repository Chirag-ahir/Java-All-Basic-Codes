package java_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		
		//this is try with resource
		try (FileInputStream fin = new FileInputStream(
				"D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt")) {
			
			int i = 0;
			while((i=fin.read())!= -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}