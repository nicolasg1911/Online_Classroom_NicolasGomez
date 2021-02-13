package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Classroom;
import model.UserAccount;
public class Main extends Application {
	private ClassroomGUI classroomGUI;
	private Classroom classroom;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
public Main() {
	classroomGUI=new ClassroomGUI(classroom)  ;
	classroom=new Classroom()  ;
	
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("main-pane.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Classroom");
		primaryStage.show();
	}
	public void change(Stage primaryStage) throws Exception{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent loginPane = fxmlLoader.load();
		
		/*classroomGUI.mainPane.getChildren().clear();
		classroomGUI.mainPane.setAll(loginPane);*/
	}
}