/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trafficlightdemo;

/**
 *
 * @author araju55
 */
public class TrafficLightDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        createAndShowGUI();
                    }
                }
        );
    }
    
    public static void createAndShowGUI() {
        TLModel model = new TLModel();
        TLController controller = new TLController(model);
        TLView view = new TLView(model, controller);
        TLGraphicalView gview = new TLGraphicalView(model);
    }
   
}
