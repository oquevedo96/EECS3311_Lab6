package main;

import controller.MenuBarListener;
import model.Observer;
import view.ConverterBar;
import view.ConverterPanel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame projectFrame = new JFrame("Converter");
        ConverterPanel panel= new ConverterPanel();
        Observer observer = new Observer(panel);
        projectFrame.add(panel);
        MenuBarListener menuBarListener=new MenuBarListener(panel,observer);
        ConverterBar bar = new ConverterBar(menuBarListener);
        projectFrame.setSize(700,700);
        projectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        projectFrame.setJMenuBar(bar);
        projectFrame.setVisible(true);
    }
}
