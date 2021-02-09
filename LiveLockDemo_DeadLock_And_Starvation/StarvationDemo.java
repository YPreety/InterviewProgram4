package LiveLockDemo_DeadLock_And_Starvation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Worker{
	public synchronized void work(){
		String name = Thread.currentThread().getName();
		String filename = name +".txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
			bw.write("thread "+ name+ "wrote this msg");
		}catch(IOException e){
			e.printStackTrace();
		}
		while(true){
			System.out.println(name +" is working");
		}
	}
}
public class StarvationDemo {

	public static void main(String[] args) {
         Worker w = new Worker();
         for(int i=0 ; i<10; i++){
        	 new Thread(new Runnable(){
        		 public void run(){
        			 w.work();
        		 }
        	 }).start();
         }
	}
}
