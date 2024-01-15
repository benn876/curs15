package org.fasttrackit.homework.temperature;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double input) {
        return (input - 32) * 5/9;
    }

    public static double celsiusToFahrenheit(double input) {
        return input * 9/5 + 32;
    }
}
