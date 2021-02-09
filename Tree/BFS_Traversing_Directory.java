package Tree;

//print all files and folders present in directory tree rooted with given directory.
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversing_Directory {

	public static void main(String[] args) {
		String inputDir = "C:\\Program Files";
		printDirsFiles(inputDir);

	}

	public static void printDirsFiles(String inputDir) {
		/* make a queue to store files and directories */
		Queue<File> queue = new LinkedList<>();

		queue.add(new File(inputDir));

		/* loop until queue is empty - */
		while (!queue.isEmpty()) {

			/* get next file/directory from the queue */
			File current = queue.poll();

			File[] fileDirList = current.listFiles();

			if (fileDirList != null) {

				/*
				 * Enqueue all directories and print all files.
				 */
				for (File fd : fileDirList) {
					if (fd.isDirectory())
						queue.add(fd);
					else
						System.out.println(fd);
				}
			}
		}
	}

}
