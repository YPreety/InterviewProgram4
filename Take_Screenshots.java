package Programming;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/*Java Program to take Screenshots

java.awt.Robot class to capture pixels of screen. It provides method like createScreenCapture which captures the 
current screen. This method returns captured image as BufferedImage object which can be saved as a file. 
It also uses ImageIO to save it as PNG image format. Toolkit.getDefaultToolkit().getSize() method is used to get 
the size of screen.

The serialVersionUID is universal version identifier for Serializable class. 
Thread is used so that after executing the program we can switch to the screen we want to take screenshot of. 
120s is the time in seconds i.e. 2 mins.*/

public class Take_Screenshots {

	public static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			Thread.sleep(120);
			Robot r = new Robot();
			String path = "C://Users//136342//workspace//Programming_Projects// Shot.jpg";
			Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage Image = r.createScreenCapture(capture);
			ImageIO.write(Image, "jpg", new File(path));
			System.out.println("Screenshot saved");
		} catch (AWTException | IOException | InterruptedException ex) {
			System.out.println(ex);
		}
	}
}
