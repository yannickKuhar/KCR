/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcr_picko;
import java.util.ArrayList;

/**
 *
 * @author yannick97
 */
public class Narocilo {
    private String ime;
    private String Priimek;
    private String naslov;
    private ArrayList<Pizza> pizze;

    public Narocilo(String ime, String Priimek, String naslov, ArrayList<Pizza> pizze) {
        this.ime = ime;
        this.Priimek = Priimek;
        this.naslov = naslov;
        this.pizze = pizze;
    }

    public String getIme() {
        return ime;
    }

    public String getPriimek() {
        return Priimek;
    }

    public String getNaslov() {
        return naslov;
    }

    public ArrayList<Pizza> getPizze() {
        return pizze;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPriimek(String Priimek) {
        this.Priimek = Priimek;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setPizze(ArrayList<Pizza> pizze) {
        this.pizze = pizze;
    }
}
