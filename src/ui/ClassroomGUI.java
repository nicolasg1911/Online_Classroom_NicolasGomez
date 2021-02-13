package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Classroom;

public class ClassroomGUI {
	private Classroom classroom;

	@FXML
	private BorderPane mainPane;
    
    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

   
    @FXML
    private TextField txtUserNameRegister;

    @FXML
    private TextField txtPasswordRegister;
    
    public ClassroomGUI(Classroom classroom) {
    	this.classroom=classroom;
    }
   
	
	

    @FXML
    public void createAccount(ActionEvent event) {

    }

    @FXML
    public void signIn(ActionEvent event) {

    }

    @FXML
    public void logIn(ActionEvent event) throws IOException {
	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("account-list.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent accountlistPane = fxmlLoader.load();
		mainPane.getChildren().clear();
		mainPane.setCenter(accountlistPane);

    }

    @FXML
    public void singUp(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent signUpPane = fxmlLoader.load();
		mainPane.getChildren().clear();
		mainPane.setCenter(signUpPane);

    }
}


