/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faltlaf.main;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args){
        FlatLightLaf.setup();
        
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Flatlaf Dashboard");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100,700);
            frame.setLocationRelativeTo(null);
            
            JLabel message = new JLabel("This is Flatlat Dashboard",SwingConstants.CENTER);
            
            frame.add(message);
            frame.setVisible(true);
        });
    }
}
