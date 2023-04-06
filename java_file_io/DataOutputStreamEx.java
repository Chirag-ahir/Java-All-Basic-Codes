package java_file_io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.write(90);
			
			String s = " welcome to freshco";
			byte b[] = s.getBytes();
			dout.write(b);
			
			
			dout.flush();
			dout.close();
			System.out.println("success");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
