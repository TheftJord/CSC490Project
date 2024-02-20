package org.example.project490;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Luke Green
 */
public class CustomerSearchController {
    
    @FXML
    private TextField firstNameSearchTextField;
    
    @FXML
    private TextField lastNameSearchTextField;
    
    @FXML
    private TextField addressSearchTextField;
    
    @FXML
    private TextField phoneSearchTextField;
    
    @FXML
    private ComboBox customerSelectComboBox;
    
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
    
}
