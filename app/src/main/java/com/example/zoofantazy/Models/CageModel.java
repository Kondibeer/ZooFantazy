package com.example.zoofantazy.Models;

import java.util.ArrayList;

public class CageModel {
    public int id;
    public String name;
    public ArrayList<ZookeeperModel> zookeepers;
    public ArrayList<BeastsModel> beasts;

    // Constr with Id und name parameters
    public CageModel(int id, String name) {
        this.id = id;
        this.name = name;
    }


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


    public ArrayList<ZookeeperModel> getZookeepers() {
        return zookeepers;
    }

    public void setZooKeepers(ArrayList<ZookeeperModel> zooKeepers) {
        this.zookeepers = zooKeepers;
    }

    public ArrayList<BeastsModel> getBeasts() {
        return beasts;
    }

    public void setBeasts(ArrayList<BeastsModel> beasts) {
        this.beasts = beasts;
    }
}
