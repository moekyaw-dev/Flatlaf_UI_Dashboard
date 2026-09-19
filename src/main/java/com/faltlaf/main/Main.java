/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faltlaf.main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.PopupMenu;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


public class Main {
    private static final Color SIDEBAR_COLOR = new Color(35,40,50);
    private static final Color CONTENT_COLOR = new Color(245, 247, 250);
    
    public static void main(String[] args){
        FlatLightLaf.setup();
        
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Flatlaf Dashboard");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100,700);
            frame.setLocationRelativeTo(null);
            
            JPanel rootPanel = new JPanel(new BorderLayout());
            rootPanel.setBackground(CONTENT_COLOR);
            
            JPanel sidebar = createSidebar();
            JPanel header = createHeader();
            JPanel content = createContent();
            
            rootPanel.add(sidebar, BorderLayout.WEST);
            rootPanel.add(header, BorderLayout.NORTH);
            rootPanel.add(content, BorderLayout.CENTER);
            
            frame.setContentPane(rootPanel);
            frame.setVisible(true);
        });
    }

    private static JPanel createSidebar() {
        JPanel sidebar = new JPanel(new BorderLayout());
        sidebar.setPreferredSize(new Dimension(220,0));
        sidebar.setBackground(SIDEBAR_COLOR);
        
        JLabel logo = new JLabel("POS Mart",SwingConstants.CENTER);
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("SansSerif",Font.BOLD,22));
        logo.setBorder(BorderFactory.createEmptyBorder(25,10,25,10));
        
        JPanel menuPanel = new JPanel(new GridLayout(0,1,0,10));
        menuPanel.setOpaque(false);
        menuPanel.setBorder(BorderFactory.createEmptyBorder(20,15,20,15));
        
        menuPanel.add(createMenuButton("Dashboard"));
        menuPanel.add(createMenuButton("Products"));
        menuPanel.add(createMenuButton("Sales"));
        menuPanel.add(createMenuButton("Customers"));
        menuPanel.add(createMenuButton("Suppliers"));
        menuPanel.add(createMenuButton("Users"));
        menuPanel.add(createMenuButton("Expenses"));
        menuPanel.add(createMenuButton("Settings"));
        
        sidebar.add(logo, BorderLayout.NORTH);
        sidebar.add(menuPanel, BorderLayout.CENTER);
        
        return sidebar;
    }
    
    private static JButton createMenuButton(String text) {
        JButton button = new JButton(text);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setForeground(Color.WHITE);
        button.setBackground(new java.awt.Color(19, 91, 91));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setMargin(new Insets(10,15,10,15));
        button.setFont(new Font("SansSerif", Font.PLAIN,15));
        
        return button;
    }

    private static JPanel createHeader() {
        JPanel header = new JPanel(new BorderLayout());
        header.setPreferredSize(new Dimension(0,60));
        header.setBackground(Color.WHITE);
        header.setBorder(BorderFactory.createEmptyBorder(0,25,0,25));
        
        JLabel title = new JLabel("Dashboard");
        title.setFont(new Font("SansSerif", Font.BOLD,25));
        
        JLabel user = new JLabel("Admin");
        user.setFont(new Font("SansSerig", Font.PLAIN,15));
        
        header.add(title, BorderLayout.WEST);
        header.add(user, BorderLayout.EAST);
        
        return header;
    }

    private static JPanel createContent() {
        JPanel content = new JPanel(new BorderLayout());
        content.setBackground(CONTENT_COLOR);
        content.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        JLabel welcome = new JLabel("Welcone to your Dashboard");
        welcome.setFont(new Font("SansSerif", Font.BOLD, 26));
        
        content.add(welcome, BorderLayout.PAGE_START);
        
        return content;
    }

}
