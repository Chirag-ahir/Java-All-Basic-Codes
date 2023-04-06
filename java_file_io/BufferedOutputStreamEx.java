package java_file_io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {
	
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fout = new FileOutputStream("D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");
		
		//try with resources
		try (BufferedOutputStream bout = new BufferedOutputStream(fout)) {
			
			String s = "welcome to freshco";
			byte b[] = s.getBytes();
			
			bout.write(b);
			System.out.println("Writing operation finished");
		}
		
	}

}
