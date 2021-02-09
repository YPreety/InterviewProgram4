package Programming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

//Program for deep copy using Serialization and Deserialization
public class CloneUsingSerialization {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 11);

		Employee emp = new Employee("ankit", map);

		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, " + "serializing employee object...");
			oout.writeObject(emp);
			fout.close();
			oout.close();
			System.out.println("employee Serialization completed.");

			// DeSerialization process >

			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);
			System.out.println("\nDeSerialization process has started, " + "deSerializing employee object...");
			Employee deSerializedEmp = (Employee) oin.readObject();
			fin.close();
			oin.close();
			System.out.println("employee DeSerialization completed.");

			System.out.println(emp == deSerializedEmp); // false
			System.out.println(emp.getName() == deSerializedEmp.getName()); // false
			System.out.println(emp.getMap() == deSerializedEmp.getMap()); // false

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Map<Integer, Integer> map;

	public Employee(String name, Map<Integer, Integer> map) {
		this.name = name;
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public Map<Integer, Integer> getMap() {
		return map;
	}

}