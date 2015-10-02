public class WeatherStation {
  public static void main(String[] args){
    WeatherData weatherData = new WeatherData(); 
    
    
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    
    
    weatherData.setMeasurements(70, 65, 20.5f);
    weatherData.setMeasurements(15, 20, 88.7f);
    weatherData.setMeasurements(87, 23, 20.5f);
   
    
    
  }

}
