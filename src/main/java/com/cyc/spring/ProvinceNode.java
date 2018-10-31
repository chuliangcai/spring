package com.cyc.spring;

import java.util.List;

public class ProvinceNode {
    private String value;
    private String label;
    private List<ProvinceNode> children;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<ProvinceNode> getChildren() {
        return children;
    }

    public void setChildren(List<ProvinceNode> children) {
        this.children = children;
    }
}
