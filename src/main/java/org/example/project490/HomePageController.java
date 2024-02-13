package org.example.project490;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Luke Green
 */
public class HomePageController {
    
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
     * 
     * as of right now, this button is labeled "customer page" in the GUI.
     */
    @FXML
    private void switchToCustomerProfile() throws IOException {
        HelloApplication.setRoot("customerProfile-view");
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
