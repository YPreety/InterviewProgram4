package Programming;

/*Synchronous Callback

The code execution will block or wait for the event before continuing. 
Until your event returns a response your program will not execute any further. 
So Basically the callback performs all its work before returning to the call statement. 
The problem with synchronous callback is that they appear to lag.

Any process having multiple tasks where the tasks must be executed in sequence and doesn’t occupy much time 
should use synchronous Callbacks.
For example : You’re in a movie queue for ticket you can’t get one until everyone in front of you gets one.*/

interface OnGeekEventListener {
	void onGeekEvent();
}

class A implements OnGeekEventListener {

	@Override
	public void onGeekEvent() {
		System.out.println("Performing callback after synchronous Task");
	}
}

public class Synchronous_Callback {

	private OnGeekEventListener mListener;

	public static void main(String[] args) {
		Synchronous_Callback obj = new Synchronous_Callback();
		OnGeekEventListener mListener = new A();
		obj.registerOnGeekEventListener(mListener);
		obj.doGeekStuff();
	}

	public void registerOnGeekEventListener(OnGeekEventListener mListener) {
		this.mListener = mListener;
	}

	public void doGeekStuff() {
		System.out.println("Performing callback before synchronous Task");
		if (this.mListener != null) {
			mListener.onGeekEvent();
		}
	}
}
