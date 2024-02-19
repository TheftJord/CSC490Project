package org.example.project490;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;

public class FirestoreContext {

    /**
     * this is where the connection is established.
     * @return
     */
    public Firestore firebase() {
        try {
            //VERY IMPORTANT
            //the getResource... must match the file name, otherwise it wont be able to connect to DB
            //this is a json file stored under the resoruces folder.
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(getClass().getResourceAsStream("key.json")))
                    .build();
            FirebaseApp.initializeApp(options);
            System.out.println("Firebase is initialized");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return FirestoreClient.getFirestore();
    }

}



