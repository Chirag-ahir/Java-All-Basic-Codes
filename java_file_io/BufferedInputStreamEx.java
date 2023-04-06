package java_file_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamEx {
	public static void main(String[] args) throws FileNotFoundException {

		try {
			
			FileInputStream fin = new FileInputStream(
					"D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);

			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
