package model;

import view.ConverterPanel;

public class Observer {
    private ConverterPanel panel;

    public Observer(ConverterPanel panel) {
        this.panel = panel;
    }

    public void notify(double cmValue) {
        panel.getFeetConversionArea().setText(Double.toString(cmValue * 0.0328084)+" ft");
        panel.getMeterConversionArea().setText(Double.toString(cmValue / 100.0)+" m");
        update();
    }
    public void update(){
        panel.repaint();
    }
}
