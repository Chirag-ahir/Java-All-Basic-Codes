package java_file_io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamEx {

	public static void main(String[] args) throws Exception{

		try {
			FileOutputStream fout = new FileOutputStream("D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			bout.write(80);
			bout.writeTo(fout);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
