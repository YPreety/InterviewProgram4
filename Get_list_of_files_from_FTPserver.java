package Programming;

import java.io.IOException;

/*FTP is a reliable protocol used for transferring files over the Internet. Though it is not a secure protocol, and all 
the data is transmitted in clear text. But it is reliable enough protocol and send the data from a sender to receiver 
over Internet.
The code talks about getting the names of the all the files you wish to read from on a FTP server using the following 
process:

1.In Java, we will use the FTPClient object to read files from FTP server. The class, ‘org.apache.commons.net.ftp.FTPClient’
, needs to be imported to create an instance of FTPClient.
2.The connect() method is called for the FTPClient object, with the URL as the parameter, to establish a connection with.
3.Using the login() method send the credentials – user-name and password. For correct credentials and a successful login, 
true is returned which allows user to access files on the server.
4.After the successful login, use the listNames() method to fetch the names of all the files in the current working 
directory. The list returned will be an array which can be iterated over to read the names.
5.Since the login was a success, it requires a logout() after the reading of filenames has been done. Lastly, the 
disconnect() method is called to end the relation with the connected FTP server.
*/
public class Get_list_of_files_from_FTPserver {

	public static void main(String[] args) {
		FTPClient ftp = new FTPClient();
		try {

			ftp.connect("ftp.test.com");

			boolean isSuccess = ftp.login("user", "password");

			if (isSuccess) {

				String[] filesFTP = ftp.listNames();
				int count = 1;

				for (String file : filesFTP) {
					System.out.println("File " + count + " :" + file);
					count++;
				}
			}

			ftp.logout();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ftp.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
