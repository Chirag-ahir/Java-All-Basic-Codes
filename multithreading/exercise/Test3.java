package com.miit.exercise;

public class Test3 extends Thread
{
     public void run ()
     {
         System.out.println ("custom");
     }
     public void start ()
     {
         System.out.println ("start");
         run();
         super.start ();
     }
     public static void main (String args[])
     {
         Test3 mt = new Test3 ();
         mt.start();
         System.out.println ("main");
     }
}