package org.class3;
/*
Traffic Light Actions: Declare a String variable
trafficLight and set it to either "Red", "Yellow", or
"Green". Use if-else statements to print "Stop" if the
light is "Red", "Caution" if the light is "Yellow", and
"Go" if the light is "Green"
 */
public class T9 {
    public static void main(String[] args) {

        String trafficLight="Yellow";

        if(trafficLight.equals("Red")){
            System.out.println("Stop");
        }else if(trafficLight.equals("Yelllo")){
            System.out.println("Caution");
        } else if(trafficLight.equals("Green")){
            System.out.println("Go");
        }
    }
}
