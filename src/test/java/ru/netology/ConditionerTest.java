package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'currentTemperatureBetweenMaxAndMin',22, 35, 18, 22",
                    "'currentTemperatureEqualMax',35, 35, 18, 35",
                    "'currentTemperatureEqualMin',18, 35, 18, 18",
                    "'currentTemperatureOverMax',100, 35, 18, 20",
                    "'currentTemperatureLessMin',-100, 35, 18, 20"
            }
    )
    void shouldSetCurrentTemperature(String test, int currentTemperature, int maxTemperature, int minTemperature, int expected) {
        Conditioner tempConditioner = new Conditioner();
        tempConditioner.setMaxTemperature(maxTemperature);
        tempConditioner.setMinTemperature(minTemperature);
        tempConditioner.setCurrentTemperature(currentTemperature);
        assertEquals(tempConditioner.getCurrentTemperature(),expected);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'increaseTemperatureBetweenMaxAndMin',22, 35, 18, 23",
                    "'increaseTemperatureEqualMax',34, 35, 18, 35",
                    "'increaseTemperatureEqualMin',18, 35, 18, 19",
                    "'increaseTemperatureOverMax',35, 35, 18, 35"
            }
    )
    void shouldIncreaseCurrentTemperature(String test, int currentTemperature, int maxTemperature, int minTemperature, int expected) {
        Conditioner tempConditioner = new Conditioner();
        tempConditioner.setMinTemperature(minTemperature);
        tempConditioner.setMaxTemperature(maxTemperature);
        tempConditioner.setCurrentTemperature(currentTemperature);
        tempConditioner.increaseCurrentTemperature();
        assertEquals(tempConditioner.getCurrentTemperature(),expected);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'increaseTemperatureBetweenMaxAndMin',22, 35, 18, 21",
                    "'increaseTemperatureEqualMax',35, 35, 18, 34",
                    "'increaseTemperatureEqualMin',19, 35, 18, 18",
                    "'increaseTemperatureLessMin',18, 35, 18, 18"
            }
    )
    void shouldDecreaseCurrentTemperature(String test, int currentTemperature, int maxTemperature, int minTemperature, int expected) {
        Conditioner tempConditioner = new Conditioner();
        tempConditioner.setMinTemperature(minTemperature);
        tempConditioner.setMaxTemperature(maxTemperature);
        tempConditioner.setCurrentTemperature(currentTemperature);
        tempConditioner.decreaseCurrentTemperature();
        assertEquals(tempConditioner.getCurrentTemperature(),expected);
    }
}