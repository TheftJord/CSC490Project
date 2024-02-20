package org.example.project490;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Luke Green
 */
public class CustomerProfileController {
    
    @FXML
    private TextField firstNameTextField;
    
    @FXML
    private TextField lastNameTextField;
    
    @FXML
    private TextField streetAddressTextField;
    
    @FXML
    private TextField townTextField;
    
    @FXML
    private TextField stateTextFIeld;
            
    @FXML
    private TextField areaCodeTextField;
            
    @FXML
    private TextField phoneTextField;
            
    @FXML
    private TextField dobTextField;
    
    /**
     * event handler for home page menu button
     * will change the screen to the home page view
     */
    @FXML
    private void switchToHome() throws IOException{
        HelloApplication.setRoot("homePage-view");
    }
    
    /**
     * event handler for customer profile page menu button
     * will change the screen to the customer profile page view
     */
    @FXML
    private void switchToCustomerProfile() throws IOException {
        HelloApplication.setRoot("customerProfile-view");
    }
    
    /**
     * event handler for customer search page menu button
     * will change the screen to the customer search page view
     */
    @FXML
    private void switchToCustomerSearch() throws IOException {
        HelloApplication.setRoot("customerSearch-view");
    }
    
    /**
     * event handler for close application button in menubar
     * will close the GUI
     */
    @FXML
    private void closeGUI() {
        System.exit(0);
    }
    
    /**
     * event handler for the edit fields toggle button
     * will check if text fields are editable, if so make them not editable
     * if not editable, then make them editable
     */
    @FXML
    private void toggleEdit() {
        if (firstNameTextField.isEditable() == true && lastNameTextField.isEditable() == true && streetAddressTextField.isEditable() == true && 
                townTextField.isEditable() == true && stateTextFIeld.isEditable() == true && areaCodeTextField.isEditable() == true &&
                phoneTextField.isEditable() == true && dobTextField.isEditable() == true) {
            firstNameTextField.setEditable(false);
            lastNameTextField.setEditable(false);
            streetAddressTextField.setEditable(false);
            townTextField.setEditable(false);
            stateTextFIeld.setEditable(false);
            areaCodeTextField.setEditable(false);
            phoneTextField.setEditable(false);
            dobTextField.setEditable(false);
        } else {
            firstNameTextField.setEditable(true);
            lastNameTextField.setEditable(true);
            streetAddressTextField.setEditable(true);
            townTextField.setEditable(true);
            stateTextFIeld.setEditable(true);
            areaCodeTextField.setEditable(true);
            phoneTextField.setEditable(true);
            dobTextField.setEditable(true);
        }
    }
            
}
