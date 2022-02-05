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
import java.util.Observer;
import javax.swing.JFrame;

public class TLGraphicalView implements Observer {
    
    private final TLModel model;
    private ColorPanel pane;
    
    public TLGraphicalView(TLModel model) {
        this.model = model;
        JFrame frame = new JFrame("MVC Lights");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pane = new ColorPanel(model);
        frame.getContentPane().add(pane);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        model.addObserver(this);
        update(model, null);

}

    @Override
    public void update(Observable o, Object arg) {
        pane.repaint();
    }
    
}
