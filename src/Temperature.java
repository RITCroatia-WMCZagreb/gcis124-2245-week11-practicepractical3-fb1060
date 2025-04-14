/*
@ASSESSME.USERID: fb1060
@ASSESSME.AUTHOR: 
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Temperature {

    public interface TemperatureScale {
        double convert(double temperature);
    }

    /**
     * Part A
     * Create and return an anonymous class of type TemperatureScale that
     * converts a temperature given in Fahrenheit to Celsius
     * C = (F - 32) / 1.8
     * @return
     */
    public static TemperatureScale createF2C() {
        TemperatureScale f2C = null;

        // Delete from here
       

        
        // to here

        return f2C;
    }

    /**
     * Part B
     * Create and return an lambda of type TempConv that
     * converts a temperature given in Celsius to Fahrenheit
     * F = (C * 1.8) + 32
     * @return
     */
    public static TemperatureScale createC2F() {
        TemperatureScale c2F = null;

        // Delete from here
       
        // to here

        return c2F;
    }

    public static void main(String[] args) {
        
        TemperatureScale c2F = createC2F();
        TemperatureScale f2C = createF2C();

        List<Double> temps = Arrays.asList(0.0, 32.0, 12.3, 45.6, -12.0);

        List<Double> celsiusTemps = new ArrayList<>();
        List<Double> fahrenheitTemps = new ArrayList<>();

        // Part C
        // For each temperature in temps
            // 1. Use c2F variable to convert the temperature to Fahrenheit and
            //    store result in fahrenheitTemps
            // 2. Use f2C variable to convert the temperature to Celsius and
            //    store result in celciusTemps
        // Delete from here
       

        // to here

        // Part D
        // Using stream(), filter(), and forEach(), print on a separate line all
        // elements of fahrenheitTemps that are *above* feezing (32F)
        // Delete from here
      
       
      
        // to here

        // Part E
        // Using streams(), filter(), and forEach(), print on a separate line all
        // elements of celsiusTemps that are *below* freezing (0C)
        // Delete from here
      
    
      
        // to here
    }
    
}
