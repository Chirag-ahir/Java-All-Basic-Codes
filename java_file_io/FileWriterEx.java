package java_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");
			fw.write("hey file writer");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
