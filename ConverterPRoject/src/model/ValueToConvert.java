package model;



public class ValueToConvert {
    private double valueToConvert;
    private Observer observer;
    public ValueToConvert(Observer observer){
        this.observer=observer;
    }
    public double getValueToConvert() {
        return valueToConvert;
    }

    public void setValueToConvert(double valueToConvert) {
        this.valueToConvert = valueToConvert;
        observer.notify(valueToConvert);
    }
}
