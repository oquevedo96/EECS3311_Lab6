package controller;

import model.Observer;
import model.ValueToConvert;
import view.ConverterPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarListener implements ActionListener {
    private ConverterPanel panel;
    private ValueToConvert valueToConvert;

    public MenuBarListener(ConverterPanel panel, Observer observer) {
        this.panel = panel;
        valueToConvert = new ValueToConvert(observer);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "SAVE":
                try {
                    double cmValue = Double.parseDouble(panel.getCentimetersConversionArea().getText());
                    valueToConvert.setValueToConvert(cmValue);
                } catch (Exception ex) {

                }
        }
    }
}
