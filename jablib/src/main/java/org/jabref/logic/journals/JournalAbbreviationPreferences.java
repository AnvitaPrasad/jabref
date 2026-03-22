package org.jabref.logic.journals;

import java.util.List;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class JournalAbbreviationPreferences {

    private final ObservableList<String> externalJournalLists;
    private final BooleanProperty useFJournalField;
    private final BooleanProperty useBuiltInList;

    public JournalAbbreviationPreferences(List<String> externalJournalLists,
                                          boolean useFJournalField,
                                          boolean useBuiltInList) {
        this.externalJournalLists = FXCollections.observableArrayList(externalJournalLists);
        this.useFJournalField = new SimpleBooleanProperty(useFJournalField);
        this.useBuiltInList = new SimpleBooleanProperty(useBuiltInList);
    }

    public ObservableList<String> getExternalJournalLists() {
        return externalJournalLists;
    }

    public void setExternalJournalLists(List<String> list) {
        externalJournalLists.clear();
        externalJournalLists.addAll(list);
    }

    public boolean shouldUseFJournalField() {
        return useFJournalField.get();
    }

    public BooleanProperty useFJournalFieldProperty() {
        return useFJournalField;
    }

    public void setUseFJournalField(boolean useFJournalField) {
        this.useFJournalField.set(useFJournalField);
    }

    public boolean shouldUseBuiltInList() {
        return useBuiltInList.get();
    }

    public BooleanProperty useBuiltInListProperty() {
        return useBuiltInList;
    }

    public void setUseBuiltInList(boolean useBuiltInList) {
        this.useBuiltInList.set(useBuiltInList);
    }
}
