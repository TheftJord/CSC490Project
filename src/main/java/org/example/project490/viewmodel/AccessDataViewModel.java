package org.example.project490.viewmodel;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 *
 *                      READ ME
 *                      READ ME
 *                      READ ME
 *
 *                      TBH i am not sure what this code is for,
 *                      I copied this code skeleton from alrajab's software engineering
 *                      I am not familiar with this functionality so just be careful.
 *                      I also did not test to see if the connection could be established
 *                      if this file was not included, regtardless i added it.
 */
public class AccessDataViewModel {

    private final StringProperty userName = new SimpleStringProperty();
    private final StringProperty userMajor = new SimpleStringProperty();
    private final int age = 0;
    private final ReadOnlyBooleanWrapper writePossible = new ReadOnlyBooleanWrapper();

    public AccessDataViewModel() {
        writePossible.bind(userName.isNotEmpty().and(userMajor.isNotEmpty()));
    }

    public StringProperty userNameProperty() {
        return userName;
    }

    public StringProperty userMajorProperty() {
        return userMajor;
    }

    public ReadOnlyBooleanProperty isWritePossibleProperty() {
        return writePossible.getReadOnlyProperty();
    }
}

