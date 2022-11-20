/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcr_picko;

/**
 *
 * @author yannick97
 */
import javax.swing.ImageIcon;

public class IconFetch {

    private static IconFetch instance;

    private IconFetch(){
    }

    public static IconFetch getInstance() {
        if (instance == null)
            instance = new IconFetch();
        return instance;
    }

    public ImageIcon getIcon(String iconName) {
        java.net.URL imgUrl = getClass().getResource(iconName);
        if (imgUrl != null) {
            return new ImageIcon(imgUrl);
        } else {
            throw new IllegalArgumentException("This icon file does not exist");
        }
    }

    public static final String MARGARITA = "Margarita.jpg";
}
