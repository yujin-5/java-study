package chap1_9.enum_.practice;

public class Main {
    public static void main(String[] args) {
        WeatherApp weather1 = new WeatherApp();
        WeatherApp weather2 = new WeatherApp();

        weather1.sunny();
        weather1.cloudy();
        weather1.rainy();
        weather1.snowy();

        weather2.sunny();

    }
}
