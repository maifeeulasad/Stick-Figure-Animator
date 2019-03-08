package SFA;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.lang.reflect.InvocationTargetException;

public class StickFrame extends JFrame {

    Body body ;
    PointColored[] points;

    StickFrame() throws IllegalAccessException, InvocationTargetException, InterruptedException {
        super("Mr.Stick");
        body= new Body();

        points = body.getAllPoints();

        for (PointColored t:
                points) {
            CustomFrame mc = new CustomFrame(t);
            add(mc);
            System.out.println("g");

        }

        setLayout(null);
        setSize(600, 800);
        setLocation(500,500);






        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);



    }


    /*
    public void paint (Graphics g){
        super.paint(g);



        g.drawLine(points[2].x,points[2].y,points[4].x,points[4].y);
        g.drawLine(points[2].x,points[2].y,points[1].x,points[1].y);
        g.drawLine(points[3].x,points[3].y,points[5].x,points[5].y);
        g.drawLine(points[3].x,points[3].y,points[1].x,points[1].y);
        g.drawLine(points[6].x,points[6].y,points[1].x,points[1].y);
        g.drawLine(points[6].x,points[6].y,points[7].x,points[7].y);
        g.drawLine(points[6].x,points[6].y,points[8].x,points[8].y);
        g.drawLine(points[9].x,points[9].y,points[7].x,points[7].y);
        g.drawLine(points[10].x,points[10].y,points[8].x,points[8].y);
    }
    */



    
}
