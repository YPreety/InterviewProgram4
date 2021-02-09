package LiveLockDemo_DeadLock_And_Starvation;

class MyDeadLock{
	String s1 = "Java";
	String s2 = "linux";
	Thread t1 = new Thread("myThread1"){
		public void run(){
			while(true){
				synchronized(s1){
					synchronized(s2){
						System.out.println(s1+s2);
					}
				}
			}
		}
	};
	Thread t2 = new Thread("myThread1"){
		public void run(){
			while(true){
				synchronized(s1){
					synchronized(s2){
						System.out.println(s1+s2);
					}
				}
			}
		}
	};	
}

public class DeadLockExample {

	public static void main(String[] args) {
		MyDeadLock md = new MyDeadLock();
		md.t1.start();
		md.t2.start();
	}
}
