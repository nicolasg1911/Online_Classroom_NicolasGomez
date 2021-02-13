package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Classroom;

public class Main extends Application{
	
	private ClassroomGUI classroomgui;
	private Classroom classroom;

	public Main() {
		classroomgui = new ClassroomGUI(classroom);
		classroom = new Classroom();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
		
		fxmlLoader.setController(classroomgui);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Classroom");
		primaryStage.show();
	}
}
/*		
		FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("login.fxml"));
    	
    	fxmlLoader1.setController(classroomgui);
    	Parent loginPane = fxmlLoader1.load();
    	
		
		classroomgui.getMainPane.getChildren().Clear();
		classroomgui.getMainPane.setCenter(loginPane);
	
	}
}

	public void change(Stage primaryStage) throws Exception{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent loginPane = fxmlLoader.load();
		
		classroomGUI.mainPane.getChildren().clear();
		classroomGUI.mainPane.setCenter(loginPane);*/
