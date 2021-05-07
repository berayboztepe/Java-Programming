/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author beray
 */
public class Panel extends JPanel {
    
    private ArrayList<Circle> clist;
    private int size = 200;
    
    private Timer timer;
    private final int DELAY = 33; // 33 ms (1sn / 30) for 30 fps frame
    
    // when the panel is on, i will be able to do some mouse actions. and while my mouse is on the panel, the circles will move.
    // otherwise, the circles will be stopped.
    public Panel(){
        clist = new ArrayList<>();
        setBackground(Color.BLACK);
        
        addMouseListener(new Listener());
        addMouseMotionListener(new Listener());
        addMouseWheelListener(new Listener());
        
        timer = new Timer(DELAY, new Listener());
        timer.start();
    }
    // this is for paint the circles to different colours. and also there ise a counter to count circles and print the number
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(Circle c:clist){
            g.setColor(c.color);
            g.drawOval(c.x, c.y, c.size, c.size);
        }
        
        g.setColor(Color.yellow);
        g.drawString(Integer.toString(clist.size()), 10, 15);
    }
    // for mouse actions. When mouse is pressed, it will create new circles with random x and y coordinates and size as given at the beginning
    private class Listener implements MouseListener,MouseMotionListener, ActionListener, MouseWheelListener  {

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getX() + size <= getWidth() && e.getX() + size > 0 && e.getY() + size > 0 && e.getY() + size < getHeight()){
                clist.add(new Circle(e.getX(), e.getY(), size));
                repaint();
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }
        
        // when my mouse has entered to panel again, move all the stopped circles again.
        @Override
        public void mouseEntered(MouseEvent e) {
            timer.start();
        }
        
        // when my mouse is out of the panel, stop all the moving circles.
        @Override
        public void mouseExited(MouseEvent e) {
            timer.stop();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if(e.getX() + size <= getWidth() && e.getX() + size > 0 && e.getY() + size > 0 && e.getY() + size < getHeight()){
                clist.add(new Circle(e.getX(), e.getY(), size));
                repaint();
            }
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for(Circle c:clist){
                c.update();
            }
            repaint();
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            if(e.getWheelRotation() < 0) {
                if(size < 500) size += 10;
                else size = 500;
            }
            else{
                if(size > 10) size -= 10;
                else size = 10;
            }
            repaint();
            }
        }
        
    
    
    // Creating a class to make new circles.
    public class Circle{
        private int x, y, xspeed, yspeed, size;
        private Color color;
        private final int MAX_SPEED = 7;

        public Circle(int x, int y, int size) {
            this.x = x;
            this.y = y;
            this.size = size;
            
            // creating a circle with random RGB colours and random speeds for x and y
            color = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
            xspeed = (int)(Math.random() * 2 * MAX_SPEED - MAX_SPEED);
            yspeed = (int)(Math.random() * 2 * MAX_SPEED - MAX_SPEED);
            while(xspeed == 0) xspeed = (int)(Math.random() * 2 * MAX_SPEED - MAX_SPEED);
            while(yspeed == 0) yspeed = (int)(Math.random() * 2 * MAX_SPEED - MAX_SPEED);
                    
            
        }
        public void update(){
            x += xspeed;
            y += yspeed;
            if(x < 0 || x + size > getWidth()) xspeed *= -1;
            if(y < 0 || y + size > getHeight()) yspeed *= -1;
        }
    }
}
