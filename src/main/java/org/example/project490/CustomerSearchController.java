package org.example.project490;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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

    Alert a=new Alert(AlertType.ERROR);
    
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
     * event handler for search button
     * will give information to the search engine
     */
    @FXML
    private void engageSearch(){
        String firstName=firstNameSearchTextField.getText();
        String lastName=lastNameSearchTextField.getText();
        String address=addressSearchTextField.getText();
        String phoneNumber=phoneSearchTextField.getText();
        if(firstName!=null&&lastName!=null){
            SearchEngine.customerSearch(firstName,lastName);
        }
        else if(address!=null){
            SearchEngine.customerSearch(address);
        }
        else if(phoneNumber!=null){
            SearchEngine.customerSearch(phoneNumber);
        }
        else{
            a.show();
        }
    }

    @FXML
    private void updateComboBox(){
        customerSelectComboBox.isResizable();
        
        customerSelectComboBox.setItems(null);
    }
    
}
