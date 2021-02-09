package Java8;

import java.util.stream.Stream;

/*A parallel stream is one that splits the elements into multiple streams and assigns them into multiple chunks on different 
threads. Thus we can divide the workload of a given operation on the core of multiprocessors and thus it will make the CPU
busy. We can convert the stream into parallel by attaching the keyword ‘parallel’.*/

public class Parallel_Data_Processing {

	public static void main(String[] args) {
		long c = sumparallel(10);
		System.out.println("Sum is " + c); //55

	}

	static long sumparallel(long n) {
		// Stream converted to parallel stream
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
	}

}
