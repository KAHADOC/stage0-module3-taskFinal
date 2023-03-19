package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double tempFahr = temperatureCelsius * 9.0/5.0 + 32;
        System.out.println(tempFahr);
    }
}
