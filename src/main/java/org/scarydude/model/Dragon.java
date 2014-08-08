package org.scarydude.model;

import java.awt.*;

public class Dragon {
    private String name;
    private Integer size;
    private Integer weight;
    private Color color;
    private Integer numOfHeads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getNumOfHeads() {
        return numOfHeads;
    }

    public void setNumOfHeads(Integer numOfHeads) {
        this.numOfHeads = numOfHeads;
    }
}
