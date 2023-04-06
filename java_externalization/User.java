package java_externalization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class User implements Externalizable {
	
	private String name;  
    private int age;
    
    
    public User() {	}

	public User(String userName,int age){  
        this.name= userName;  
        this.age=age;  
    }  
    
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
        out.writeInt(age);  
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String) in.readObject();  
        age=in.readInt();  
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}  
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File f= new File("Test.txt");  
        User u= new User("JavaTpoint",25);  
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))) {
			out.writeObject(u);
		}    
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))) {
			u= (User) in.readObject();
		}  
        System.out.println("After De externalization username: " +u.getName()+" and age is:"+u.getAge()); 
	}
    

}
