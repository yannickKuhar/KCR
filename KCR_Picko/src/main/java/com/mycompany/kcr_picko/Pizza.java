/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcr_picko;

import java.util.Objects;

/**
 *
 * @author yannick
 */
public class Pizza {
    private String name;
    private String addon;
    private String size;

    public Pizza(String name, String addon, String size) {
        this.name = name;
        this.addon = addon;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getAddon() {
        return addon;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddon(String addon) {
        this.addon = addon;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pizza other = (Pizza) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.addon, other.addon)) {
            return false;
        }
        return Objects.equals(this.size, other.size);
    }
}
