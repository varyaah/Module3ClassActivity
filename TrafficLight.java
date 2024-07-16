public class TrafficLight {

    private String color;
  
    private int duration;
  
    public TrafficLight(String color, int duration) {
      this.color = color;
      this.duration = duration;
    }
  
    public String getColor() {
      return this.color;
    }
  
    public void setColor(String color) {
      this.color = color;
    }
  
    public boolean isGreen() {
      return this.color.equals("green") ? true : false; 
    }
  
    public boolean isRed() {
      return this.color.equals("red") ? true : false; 
    }
  
    public static void main(String[] args) {
      TrafficLight light = new TrafficLight("green", 5);
      System.out.println("The light is " + light.getColor());
      System.out.println("The light is green: " + light.isGreen());
      System.out.println("The light is red: " + light.isRed());
    }
  }