package application;
import application.Person;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class PostMan extends Person{
	private final StringProperty jobTitle = new SimpleStringProperty(this, "jobTitle", null);

	public StringProperty getJobTitle() {
		return jobTitle;
	}
	public final void setJobTitle(String jobTitle) {
		firstNameProperty().set(jobTitle);
	}
}
