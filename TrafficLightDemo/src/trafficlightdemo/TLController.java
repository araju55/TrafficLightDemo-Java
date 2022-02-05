package trafficlightdemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author araju55
 */
public class TLController {
    
    private TLModel model;
    private TLView view;
    
    public TLController(TLModel model) {
        this.model = model;
    }
    
    public void setView(TLView  view) {
        this.view = view;
    }
    
    public void change() {
        model.change();
    }
    
    public void initialise() {
        model.initialise();
    }
}
