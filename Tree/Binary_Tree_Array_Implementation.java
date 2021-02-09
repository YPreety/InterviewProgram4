package Tree;

/*Array Representation (Sequential Representation).
For first case(0—n-1),                               For second case(1—n),
if (say)father=p;                                    if (say)father=p;
then left_son=(2*p);                                 then left_son=(2*p)+1;
and right_son=(2*p)+1;                               and right_son=(2*p)+2;
 A(1)                                                A(0)  
/   \                                                /   \
B(2)  C(3)                                           B(1)  C(2)  
/   \      \                                         /   \      \
D(4)  E(4)   F(6)                                    D(3)  E(4)   F(5) */

public class Binary_Tree_Array_Implementation {

	public static void main(String[] args) {
		Array_imp obj = new Array_imp();
		obj.Root("A");
		obj.set_Left("B", 0);
		obj.set_Right("C", 0);
		obj.set_Left("D", 1);
		obj.set_Right("E", 1);
		obj.set_Left("F", 2);
		obj.print_Tree();
	}
}

class Array_imp {
	static int root = 0;
	static String[] str = new String[10];

	/* create root */
	public void Root(String key) {
		str[0] = key;
	}

	/* create left son of root */
	public void set_Left(String key, int root) {
		int t = (root * 2) + 1;
		str[t] = key;
	}

	/* create right son of root */
	public void set_Right(String key, int root) {
		int t = (root * 2) + 2;
		str[t] = key;
	}

	public void print_Tree() {
		for (int i = 0; i < 10; i++) {
			if (str[i] != null)
				System.out.print(str[i]);
		}
	}
}
