package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main GUI for the program.
 * 
 * @author John Choi
 * @version 1.1
 */
public class Main extends Application {
	
	/**
	 * Fetches and runs the fxml file.
	 * 
	 * @param primaryStage stage to run
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Executes the start method.
	 * 
	 * @param args command-line argument
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
