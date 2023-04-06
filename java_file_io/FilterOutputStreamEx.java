package java_file_io;

import java.io.*;

public class FilterOutputStreamEx {  
    public static void main(String[] args) throws IOException{  
    	
        FileOutputStream fout = new FileOutputStream("D:\\MIIT\\JAVA Eclipse\\java_file_io\\src\\java_file_io\\out.txt");  
        FilterOutputStream fiout = new FilterOutputStream(fout); 
        
        String s="Welcome to canada.";    
        byte b[]=s.getBytes(); 
        
        fiout.write(b);     
        fiout.flush();  
        fiout.close();  
        fiout.close();  
        
        System.out.println("Success...");  
    }  
}  
