package com.example.zoofantazy.Models;

public class ZookeeperModel {
    public int id;
    public String name;
    public CageModel cage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public CageModel getCage() {
        return cage;
    }

    public void setCage(CageModel cage) {
        this.cage = cage;
    }
}
