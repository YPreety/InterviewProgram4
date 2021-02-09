package Programming;

/*Asynchronous Callback

An Asynchronous call do not block the program from the code execution. 
when the call returns from the event the call returns back to the callback function. 
So in the context of java we have to Create a new thread invoke the callback method inside that thread. 
Callback may be invoked from a thread but is not a requirement. 
A Callback may also start a new thread thus making themselves asynchronous.

When the tasks are not dependent on each other and may take some time for execution we should use Asynchronous callbacks.
For example : When you order your food other people can also order their food in the restaurant. 
They don’t have to wait for your order to finish, If you’re downloading a song from internet, Getting an API response.*/

interface OnGeekEventListener1 {
	void onGeekEvent();
}

class B implements OnGeekEventListener1 {

	@Override
	public void onGeekEvent() {
		System.out.println("Performing callback after Asynchronous Task");
	}
}

public class Asynchronous_Callback {

	private OnGeekEventListener1 mListener;

	public static void main(String[] args) {
		Asynchronous_Callback obj = new Asynchronous_Callback();
		OnGeekEventListener1 mListener = new B();
		obj.registerOnGeekEventListener1(mListener);
		obj.doGeekStuff();

	}

	public void registerOnGeekEventListener1(OnGeekEventListener1 mListener) {
		this.mListener = mListener;
	}

	public void doGeekStuff() {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Performing operation in Asynchronous Task");
				if (mListener != null) {
					mListener.onGeekEvent();
				}
			}
		}).start();
	}
}
