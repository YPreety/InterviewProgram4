package Programming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Serialization And  Deserialization SerialVersionUID Example

public class SerialVersionUID_Example {
	private static final long SerialVersionUID = 10l;
	int i = 10;
	int j = 20;
}

// Serialization
class Sender {
	public static void main(String[] args) throws IOException {
		SerialVersionUID_Example g = new SerialVersionUID_Example();
		FileOutputStream fos = new FileOutputStream("C://Users//136342//workspace//Programming_Projects//xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(g);
	}
}

// Deserialization
class Receiver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C://Users//136342//workspace//Programming_Projects//xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerialVersionUID_Example g1 = (SerialVersionUID_Example) ois.readObject();
		System.out.println("Deserialized Object Value:" + g1.i + "..." + g1.j);
	}
}