package org.example.project490.modelview;//package modelview;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.project490.HelloApplication;
import org.example.project490.models.Person;
import org.example.project490.viewmodel.AccessDataViewModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class AccessFBView {


     @FXML
    private TextField nameField;
    @FXML
    private TextField majorField;
    @FXML
    private TextField ageField;
    @FXML
    private Button writeButton;
    @FXML
    private Button readButton;
    @FXML
    private TextArea outputField;
     private boolean key;
    private ObservableList<Person> listOfUsers = FXCollections.observableArrayList();
    private Person person;
    public ObservableList<Person> getListOfUsers() {
        return listOfUsers;
    }

    void initialize() {

        AccessDataViewModel accessDataViewModel = new AccessDataViewModel();
        nameField.textProperty().bindBidirectional(accessDataViewModel.userNameProperty());
        majorField.textProperty().bindBidirectional(accessDataViewModel.userMajorProperty());
        writeButton.disableProperty().bind(accessDataViewModel.isWritePossibleProperty().not());
    }

    @FXML
    private void addRecord(ActionEvent event) {
        addData();
    }

        @FXML
    private void readRecord(ActionEvent event) {
        readFirebase();
    }

            @FXML
    private void regRecord(ActionEvent event) {
        registerUser();
    }

     @FXML
    private void switchToSecondary() throws IOException {
        HelloApplication.setRoot("WebContainer.fxml");
    }

    public void addData() {

        //uuid is just the name of the doccument it will appear as in the database
        DocumentReference docRef = HelloApplication.fstore.collection("References").document(UUID.randomUUID().toString());

        Map<String, Object> data = new HashMap<>();
        data.put("Name", nameField.getText());
        data.put("Major", majorField.getText());
        data.put("Age", Integer.parseInt(ageField.getText()));
        //asynchronously write data
        ApiFuture<WriteResult> result = docRef.set(data);
    }

        public boolean readFirebase()
         {
             key = false;

        //asynchronously retrieve all documents
        ApiFuture<QuerySnapshot> future =  HelloApplication.fstore.collection("References").get();
        // future.get() blocks on response
        List<QueryDocumentSnapshot> documents;
        try
        {
            documents = future.get().getDocuments();
            if(documents.size()>0)
            {
                System.out.println("Outing....");
                for (QueryDocumentSnapshot document : documents)
                {
                    outputField.setText(outputField.getText()+ document.getData().get("Name")+ " , Major: "+
                            document.getData().get("Major")+ " , Age: "+
                            document.getData().get("Age")+ " \n ");
                    System.out.println(document.getId() + " => " + document.getData().get("Name"));
                    person  = new Person(String.valueOf(document.getData().get("Name")),
                            document.getData().get("Major").toString(),
                            Integer.parseInt(document.getData().get("Age").toString()));
                    listOfUsers.add(person);
                }
            }
            else
            {
               System.out.println("No data");
            }
            key=true;

        }
        catch (InterruptedException | ExecutionException ex)
        {
             ex.printStackTrace();
        }
        return key;
    }

        public void sendVerificationEmail() {
        try {
            UserRecord user = HelloApplication.fauth.getUser("name");
            //String url = user.getPassword();

        } catch (Exception e) {
        }
    }

    public boolean registerUser() {
        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail("user@example.com")
                .setEmailVerified(false)
                .setPassword("secretPassword")
                .setPhoneNumber("+11234567890")
                .setDisplayName("John Doe")
                .setDisabled(false);

        UserRecord userRecord;
        try {
            userRecord = HelloApplication.fauth.createUser(request);
            System.out.println("Successfully created new user: " + userRecord.getUid());
            return true;

        } catch (FirebaseAuthException ex) {
           // Logger.getLogger(FirestoreContext.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
