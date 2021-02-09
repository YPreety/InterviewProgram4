package Solutions;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopLight extends Applet implements ActionListener {

	int width, height, padding, diameter, numberOfBulbs;

	int selectedBulb = 2; // 0 is red, 1 is yellow, 2 is green
	long timestampOfLastChange;

	Color backgroundColor;
	Color activeColor;

	Button button;

	LightTimerThread thread;

	/* Initializer */
	public void init() {

		// Initial dimension
		width = 200;
		height = 500;
		padding = 20;
		numberOfBulbs = 3;

		// Background color - bluish gray
		backgroundColor = new Color(112, 138, 144);

		// The diameter of each bulb is a third minus twice the margin
		diameter = (height / numberOfBulbs) - (padding * 2);

		// Button
		button = new Button("Cross");
		add(button);

		// Listen to the button
		button.addActionListener(this);

		// Get a start time
		timestampOfLastChange = System.currentTimeMillis();

		// Set up a thread
		thread = new LightTimerThread(this);
		thread.start();

		// Repaint
		repaint();
	}

	/* Render */

	public void paint(Graphics g) {
		// Draw the background
		g.setColor(backgroundColor);
		g.fillRect(0, 0, width, height);

		// Draw three lights
		for (int i = 0; i < numberOfBulbs; i++) {
			// Get the correct color
			g.setColor(colorForLightAtIndex(i));

			// Get the correct location
			int xOffset = width / 2 - diameter / 2;
			int yOffset = (diameter + padding) * i + padding;

			// Draw the circle
			g.fillOval(xOffset, yOffset, diameter, diameter);

			// Draw a black border
			g.setColor(Color.BLACK);
			g.drawOval(xOffset, yOffset, diameter + 1, diameter + 1);
		}

		// Move the button down
		Dimension frame = button.getPreferredSize();
		button.setBounds(width / 2 - frame.width / 2, height, frame.width, frame.height);

		// If we're not allowed to use it,
		// then disable the button.
		// We can only use it if the light
		// is green, and has been for at least
		// ten seconds

		Boolean isCrossButtonEnabled = false;

		if (selectedBulb == 2 && timeSinceLastChange() >= 10000) {
			isCrossButtonEnabled = true;
		}

		button.setEnabled(isCrossButtonEnabled);

	}

	/* Get the "active" color */
	public Color activeColor() {
		// Red, Yellow, Green
		Color[] colors = { Color.RED, new Color(255, 255, 100), Color.GREEN };
		return colors[selectedBulb];
	}

	/* Get the color of a given bulb - either active or white */
	public Color colorForLightAtIndex(int index) {
		Color[] colors = { Color.GRAY, activeColor() };
		return colors[(index == selectedBulb ? 1 : 0)];
	}

	/* Prevent the changeColor from interleaving itself */
	private synchronized void changeColor() {
		selectedBulb--;
		if (selectedBulb < 0) {
			selectedBulb = numberOfBulbs - 1;
		}

		timestampOfLastChange = System.currentTimeMillis();
	}

	/* Change based on the time. */
	public synchronized void changeColorFromTimer() {
		// Wait a minute for red
		if (selectedBulb == 0 && timeSinceLastChange() >= 60000) {
			changeColor();
		} else if (selectedBulb == 1 && timeSinceLastChange() >= 10000) {
			changeColor();
		} else if (selectedBulb == 2 && timeSinceLastChange() >= 50000) {
			changeColor();
		}
		repaint();
	}

	/* Change based on the button. */
	public synchronized void changeColorFromButton() {
		if (selectedBulb == 2 && this.timeSinceLastChange() >= 10000) {
			changeColor();
		}
	}

	/* How long ago did we change? Assume time progresses linearly. */
	private synchronized long timeSinceLastChange() {
		return System.currentTimeMillis() - timestampOfLastChange;
	}

	/* */
	public void actionPerformed(ActionEvent e) {
		changeColorFromButton();
	}
}

class LightTimerThread extends Thread {

	StopLight stopLight;

	public LightTimerThread(StopLight light) {
		super();
		stopLight = light;
	}

	public void run() {
		while (true) {
			stopLight.changeColorFromTimer();
		}
	}
}