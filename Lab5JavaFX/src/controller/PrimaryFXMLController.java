/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import model.User;

/**
 * FXML Controller class
 *
 * @author nana
 */
public class PrimaryFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    TextField nameTextField;
    
    @FXML
    TextField ageTextField;
    
    @FXML
    TextField emailTextField;
    
    
    public void submit () {
        Alert errorAlert = new Alert(AlertType.ERROR);
        errorAlert.setTitle("Ooops!");
        errorAlert.setHeaderText("Invalid input");
        
        try{
                User userObject = new User();
        
                userObject.setName(nameTextField.getText().trim());
                userObject.setProperName();
                userObject.setAge(parseInt(ageTextField.getText().trim()));
                userObject.setEmail(emailTextField.getText().trim());

                // Check if name is not blank or contains no text or just whitespaces OR contains other characters aside letters and "-."
                if (
                        userObject.getName().length() < 3 ||
                        userObject.getName().isBlank() ||
                        userObject.getName().replaceAll("[A-Za-z\\-. ]", "").length() != 0
                    ) {
                        errorAlert.setContentText("Please enter a valid name.");
                        errorAlert.showAndWait();
                        return;
                }

                // Check if age is greater than 0
                if (
                        userObject.getAge() < 16) {
                        errorAlert.setContentText("Please enter a valid age.");
                        errorAlert.showAndWait();
                        return;
                }

                // Check if email is blank or contains no text or just whitespaces
                // OR email does not contain "@" or contains more than one "@" or beigns with "@"
                // OR the text after "@" does not contain "."
                // OR there is no text before "@"
                // OR there is no text between "@" and "."
                // OR there is no text after "."
                // OR the length of email is less than 6 characters
                if (
                        userObject.getEmail().isBlank() ||                        // Email cannot be blank
                        !userObject.getEmail().contains("@") ||                   // Must contain an '@'
                        userObject.getEmail().indexOf("@") == 0 ||                // '@' cannot be the first character
                        userObject.getEmail().lastIndexOf("@") != userObject.getEmail().indexOf("@") ||  // Multiple '@' are not allowed
                        userObject.getEmail().indexOf("@") == userObject.getEmail().length() - 1 ||  // '@' cannot be the last character
                        userObject.getEmail().indexOf(".", userObject.getEmail().indexOf("@")) == -1 ||  // '.' must exist after '@'
                        userObject.getEmail().indexOf(".", userObject.getEmail().indexOf("@")) == userObject.getEmail().indexOf("@") + 1 ||  // '.' cannot immediately follow '@'
                        userObject.getEmail().substring(userObject.getEmail().lastIndexOf(".") + 1).trim().length() < 2 ||  // Text after '.' must be at least 2 characters
                        userObject.getEmail().length() < 6                        // Minimum length check
                    ) {
                        errorAlert.setContentText("Please enter a valid email.");
                        errorAlert.showAndWait();
                        return;
                    }

                Alert formSubmissionConfirmationAlert = new Alert(AlertType.INFORMATION);
                formSubmissionConfirmationAlert.setTitle("Success");
                formSubmissionConfirmationAlert.setHeaderText("Thanks for submitting!");
                formSubmissionConfirmationAlert.setContentText(userObject.toString());
                formSubmissionConfirmationAlert.showAndWait();
        }
        catch(StringIndexOutOfBoundsException s){
            errorAlert.setContentText("Please provide a valid for all fields.");
            errorAlert.showAndWait();
        }
        catch(NullPointerException npe){
            errorAlert.setContentText("Please enter a valid name and email.");
            errorAlert.showAndWait();
        }
        catch(NumberFormatException nfe){
            errorAlert.setContentText("Please enter a valid age.");
            errorAlert.showAndWait();
        }
        catch(Exception e){
            errorAlert.setTitle("Ooops!");
            errorAlert.setContentText("Something went wrong!.");
            errorAlert.showAndWait();
        }
    }
}
