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

/*    public void increaseCurrentTemperature(){
        int temp = getCurrentTemperature() + 1;
        if(temp > getMaxTemperature())
            return;
        if(temp <= getMaxTemperature())
            setCurrentTemperature(temp);
    }

    public void decreaseCurrentTemperature(){
        int temp = getCurrentTemperature() - 1;
        if(temp < getMinTemperature())
            return;
        if (temp >= getMinTemperature())
            setCurrentTemperature(temp);
    }*/

    public void increaseCurrentTemperature(){
        int temp = this.currentTemperature + 1;
        if (temp > this.maxTemperature)
            return;
        this.currentTemperature = temp;
    }
    public void decreaseCurrentTemperature(){
        int temp = this.currentTemperature - 1;
        if (temp < this.minTemperature)
            return;
        this.currentTemperature = temp;
    }
}
