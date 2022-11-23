/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcr_picko;

import java.util.Objects;
import java.util.ArrayList;

/**
 *
 * @author yannick
 */
public class Pizza {
    private String name;
    private ArrayList<String> addons;
    private String size;
    private double cena;

    public Pizza(String name, ArrayList<String> addons, String size, double cena) {
        this.name = name;
        this.addons = addons;
        this.size = size;
        this.cena = cena;
    }

    public ArrayList<String> getAddons() {
        return addons;
    }

    public double getCena() {
        return cena;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAddon() {
        return addons;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddon(ArrayList<String> addons) {
        this.addons = addons;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
}
