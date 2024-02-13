module org.example.project490 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires jdk.jsobject;
    requires java.xml;
    requires java.logging;
    requires javafx.web;

    requires com.google.auth;
    //requires com.google.auth.oauth2;
    requires google.cloud.firestore;
    requires firebase.admin;
    requires com.google.api.apicommon;

    requires google.cloud.core;
    requires com.google.auth.oauth2;

    opens org.example.project490 to javafx.fxml;
    exports org.example.project490;
    opens org.example.project490.modelview to javafx.fxml;

 /*   opens com.example.csc325_firebase_webview_auth;
    exports com.example.csc325_firebase_webview_auth;
    opens com.example.csc325_firebase_webview_auth.modelview;
    exports com.example.csc325_firebase_webview_auth.modelview;
*/
}