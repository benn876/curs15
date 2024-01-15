import org.fasttrackit.homework.temperature.TemperatureConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fasttrackit.homework.temperature.TemperatureConverter.celsiusToFahrenheit;
import static org.fasttrackit.homework.temperature.TemperatureConverter.fahrenheitToCelsius;

public class TemperatureConverterTest {

    @Test
    @DisplayName("WHEN creating the class THEN the class is created correctly")
    void initClass() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
    }

    @Test
    @DisplayName("WHEN calling the 2 methods THEN the call passes")
    void testMethodsExists() {
        fahrenheitToCelsius(22);
        celsiusToFahrenheit(44);
    }

    @Test
    @DisplayName("WHEN converting Fahrenheit to Celsius THEN the correct result is returned")
    void testFahrenheitToCelsius() {
        double result = fahrenheitToCelsius(100);
        assertThat(result).isEqualTo(37.77777777777778D);
    }

    @Test
    @DisplayName("WHEN converting Celsius to Fahrenheit THEN the correct result is returned")
    void testCelsiusToFahrenheit() {
        double result = celsiusToFahrenheit(37.77777777777778D);
        assertThat(result).isEqualTo(100);
    }


}
