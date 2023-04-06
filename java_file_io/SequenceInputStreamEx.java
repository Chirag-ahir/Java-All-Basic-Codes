package java_file_io;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx {
	public static void main(String[] args) throws Exception {

		// try with resources
		try (FileInputStream fin1 = new FileInputStream(
				"D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");
				FileInputStream fin2 = new FileInputStream(
						"D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\in.txt");
				SequenceInputStream sin = new SequenceInputStream(fin1, fin2);) {

			int i;
			while ((i = sin.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
