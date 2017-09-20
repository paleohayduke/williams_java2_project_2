/*
    Walter Williams
    Car
    9/19/2017
    
    This is car class as per assignment's UML diagram
 */
package williams_java2_project_2;

import java.awt.Color;

/**
 *
 * @author PALEOHAYDUKE
 */
public class Car {
    String make; //self describing names
    String model;
    Color color;
    int speed;
    
    // constructor
    Car(String make, String model, Color color){
        setMake(make);
        setModel(model);
        setColor(color);
    }
    
    //Walter Williams
    // 9/19/2017
    // following are getters and setters as requested in UML diagram
    public String getMake(){
        return make;
    }
    
    // Reason for private vs public:
    // set car information when you initialize. Does not make sense
    // that a car could change its "make" after it has been created. 
    // It might be easier, in some circumstances, to have this public so
    // user can "fix" the car... but risk of them changing these settings on
    // correctly entered Cars makes me want to keep this private and rely on
    // initialization in the constructor. 
    private void setMake(String make){
        this.make = make;
    }
    
    public String getModel(){
        return model;
    }
    
    private void setModel(String model){
        this.model = model;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void accelerate(){
        speed+=5;
    }
    
    public void brake(){
        if(speed>0){
            speed-=5;
        }
    }
}
