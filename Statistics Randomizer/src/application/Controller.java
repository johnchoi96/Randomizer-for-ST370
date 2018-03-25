/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Generates the random combinations.
 * 
 * @author John Choi
 */
public class Controller {
	private ArrayList<String> size;
	private ArrayList<Integer> angles;
	private ArrayList<String> results;
	
	/**
	 * Main label that displays combination
	 */
	@FXML
	private Label label;
	/**
	 * Label that displays previous combination
	 */
	@FXML
	private Label previousLabel;
	
	/**
	 * Constructor that initializes fields.
	 */
	public Controller() {
		size = new ArrayList<String>();
		angles = new ArrayList<Integer>();
		label = new Label();
		previousLabel = new Label();
		size.add("Small");
		size.add("Large");
		angles.add(15);
		angles.add(30);
		angles.add(45);
		results = new ArrayList<String>();
		previousLabel.setText("Null");
	}
	
	/**
	 * Generates random combination and sets to labels.
	 */
	@FXML
	public void randomizer() {
		Random random = new Random();
		previousLabel.setText(label.getText());
		int random_l1 = random.nextInt(size.size());
		int random_l2 = random.nextInt(angles.size());
		results.add(String.format("Angle: %d with %s Ball", angles.get(random_l2), size.get(random_l1)));
		label.setText(String.format("Angle: %d with %s Ball", angles.get(random_l2), size.get(random_l1)));
	}
	
	/**
	 * Resets the program.
	 */
	@FXML
	public void reset() {
		size = new ArrayList<String>();
		angles = new ArrayList<Integer>();
		size.add("Small");
		size.add("Large");
		angles.add(15);
		angles.add(30);
		angles.add(45);
		results = new ArrayList<String>();
		previousLabel.setText(null);
		label.setText(null);
	}
}
