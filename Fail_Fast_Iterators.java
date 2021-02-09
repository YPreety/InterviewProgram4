package Programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*Fail-Fast iterators immediately throw ConcurrentModificationException if there is structural modification of the collection.
Structural modification means adding, removing or updating any element from collection while a thread is iterating over that
collection. Iterator on ArrayList, HashMap classes

How Fail Fast Iterator works ?

To know whether the collection is structurally modified or not, fail-fast iterators use an internal flag called modCount
which is updated each time a collection is modified.Fail-fast iterators checks the modCount flag whenever it gets the next
value (i.e. using next() method), and if it finds that the modCount has been modified after this iterator has been created,
it throws ConcurrentModificationException.

Important points of fail-fast iterators :

These iterators throw ConcurrentModificationException if a collection is modified while iterating over it.
They use original collection to traverse over the elements of the collection.
These iterators don’t require extra memory.
Ex : Iterators returned by ArrayList, Vector, HashMap.*/

public class Fail_Fast_Iterators {

	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");
         Iterator iterator = cityCode.keySet().iterator();
         while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));
            cityCode.put("Istanbul", "Turkey");
         }
	}

}

/*output
India
Exception in thread "main" java.util.ConcurrentModificationException*/
