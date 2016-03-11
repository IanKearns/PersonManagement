package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import application.Person;
import application.PersonView;
import application.PersonController;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		Person model = new Person();
		String dateFormat = "MM/dd/yyyy";
		String nextStep = "displayCustomers";
		PersonView view = new PersonView(model, dateFormat);
		// Must set the scene before creating the presenter that uses
		// the scene to listen for the focus change
		Scene scene = new Scene(view);
		PersonController pc = new PersonController(model, view, nextStep);
		
		view.setStyle("-fx-padding: 10;" +
		"-fx-border-style: solid inside;" +
		"-fx-border-width: 2;" +
		"-fx-border-insets: 5;" +
		"-fx-border-radius: 5;" +
		"-fx-border-color: blue;");
		stage.setScene(scene);
		stage.setTitle("Person Management");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
