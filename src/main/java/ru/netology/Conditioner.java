package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature = 20;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature(){
        if (this.currentTemperature == this.maxTemperature)
            return;
        this.currentTemperature ++;
    }
    public void decreaseCurrentTemperature(){
        if (this.currentTemperature == this.minTemperature)
            return;
        this.currentTemperature --;
    }
}
