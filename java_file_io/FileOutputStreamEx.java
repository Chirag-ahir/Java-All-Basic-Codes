package java_file_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Java FileOutputStream is an output stream used for writing data to a file.

class FileOutputStreamEx {
	public static void main(String[] args) throws IOException {

		try {
			FileOutputStream fout = new FileOutputStream(
					"D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");

			fout.write(65);

			String s = "This is string writing.";
			byte b[] = s.getBytes();
			fout.write(b);

			fout.close();
			System.out.println("Writing operation finished!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
