package com.dpbird.odata.annotation;

import java.util.ArrayList;
import java.util.List;

public class ValueList extends Term {
    private String label;
    private String collectionPath;
    private String collectionRoot;
    private boolean searchSupported = true;
    private boolean withFixedValues = false;

    private List<String> parameterDisplayOnly = new ArrayList<>();

    public ValueList(String label, String collectionPath, String qualifier) {
        super(qualifier);
        this.appliesTo = "Property Parameter";
        this.label = label;
        this.collectionPath = collectionPath;
        this.termName = "Common.ValueList";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCollectionPath() {
        return collectionPath;
    }

    public void setCollectionPath(String collectionPath) {
        this.collectionPath = collectionPath;
    }

    public String getCollectionRoot() {
        return collectionRoot;
    }

    public void setCollectionRoot(String collectionRoot) {
        this.collectionRoot = collectionRoot;
    }

    public boolean isSearchSupported() {
        return searchSupported;
    }

    public void setSearchSupported(boolean searchSupported) {
        this.searchSupported = searchSupported;
    }

    public List<String> getParameterDisplayOnly() {
        return parameterDisplayOnly;
    }

    public void setParameterDisplayOnly(List<String> parameterDisplayOnly) {
        this.parameterDisplayOnly = parameterDisplayOnly;
    }

    public boolean isWithFixedValues() {
        return withFixedValues;
    }

    public void setWithFixedValues(boolean withFixedValues) {
        this.withFixedValues = withFixedValues;
    }
}
