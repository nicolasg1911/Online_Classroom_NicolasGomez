package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Classroom;

public class ClassroomGUI {
	private Classroom classroom;

    @FXML 
    private Pane mainPane;
    
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
    public void logIn(ActionEvent event) {

    }

    @FXML
    public void singUp(ActionEvent event) {
    	

    }

}

