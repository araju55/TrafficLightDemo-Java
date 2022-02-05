/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficlightdemo;

/**
 *
 * @author araju55
 */
import java.util.Observable;

public class TLModel extends Observable {
    
    private boolean red;
    private boolean amber;
    private boolean green;
   
    public boolean getRed() {
        return red;
    }
    
     public boolean getAmber() {
        return amber;
    }
     
    public boolean getGreen() {
        return green;
    }
    
    public void change(){
        if (red && !amber && !green) {
            amber = true;
        }
        else if (red && amber && !green){
            red = false;
            amber = false;
            green = true;
        }
        else if (!red && !amber && green){
            green = false;
            amber = true;
        }
        else {//just assume that the lights are amber (is this wise?)
            red = true;
            amber = false;
            green = false;
        }
        setChanged();
        notifyObservers();
    }
    
    public void initialise()
    {
        red = true;
        amber = false;
        green = false;
        setChanged();
        notifyObservers();
    }
    
    public TLModel(){
        initialise();   
    }
    
}
