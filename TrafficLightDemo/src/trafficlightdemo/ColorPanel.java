/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficlightdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author araju55
 */
public class ColorPanel extends JPanel {
    
    private static final Dimension COLOR_PANEL_SIZE = new Dimension(60,200);
    
    private static final int LIGHT_DIAMETER = 50;
    private static final int CENTRE_X = COLOR_PANEL_SIZE.width / 2;
    
    private final TLModel model;
    
    public ColorPanel(TLModel model) {
        this.model = model;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintChildren(g);
        if (model.getRed())
                g.setColor(Color.RED);
        else
            g.setColor(Color.BLACK);
        g.fillOval(CENTRE_X,0, LIGHT_DIAMETER, LIGHT_DIAMETER);
        if (model.getAmber())
            g.setColor(Color.ORANGE);
        else
            g.setColor(Color.BLACK);
        g.fillOval(CENTRE_X, LIGHT_DIAMETER, LIGHT_DIAMETER, LIGHT_DIAMETER);
        if (model.getGreen())
            g.setColor(Color.GREEN);
        else
            g.setColor(Color.BLACK);
        g.fillOval(CENTRE_X, LIGHT_DIAMETER * 2, LIGHT_DIAMETER, LIGHT_DIAMETER);
    }
    
    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
    
    @Override
    public Dimension getMaximumSize() {
        return getPreferredSize();
    }
    
    @Override
    public Dimension getPreferredSize() {
     return COLOR_PANEL_SIZE;
   }
    
}
