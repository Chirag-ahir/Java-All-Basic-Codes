package com.miit.runtime;

//The Java Runtime Class is a class in the Java programming language that provides information about the runtime environment of a Java application. It is an instance of the java.lang.Runtime class and can be accessed through the static method Runtime.getRuntime().
public class RunTime1 {
	public static void main(String args[]) throws Exception {
		Runtime.getRuntime().exec("notepad");// will open a new notepad
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}
