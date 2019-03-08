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
            CustomFrame mc = new CustomFrame(t,this);
            add(mc);

        }

        setLayout(null);
        setSize(600, 800);
        setLocation(500,500);






        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);



    }


    public void paint (Graphics g){
        super.paint(g);



        g.drawLine(points[2].x+10,points[2].y+22+10,points[4].x+10,points[4].y+22+10);
        g.drawLine(points[2].x+10,points[2].y+22+10,points[1].x+10,points[1].y+22+10);
        g.drawLine(points[3].x+10,points[3].y+22+10,points[5].x+10,points[5].y+22+10);
        g.drawLine(points[3].x+10,points[3].y+22+10,points[1].x+10,points[1].y+22+10);
        g.drawLine(points[6].x+10,points[6].y+22+10,points[1].x+10,points[1].y+22+10);
        g.drawLine(points[6].x+10,points[6].y+22+10,points[7].x+10,points[7].y+22+10);
        g.drawLine(points[6].x+10,points[6].y+22+10,points[8].x+10,points[8].y+22+10);
        g.drawLine(points[9].x+10,points[9].y+22+10,points[7].x+10,points[7].y+22+10);
        g.drawLine(points[10].x+10,points[10].y+22+10,points[8].x+10,points[8].y+22+10);
        //g.drawOval(points[0].x+10,points[0].y+22+10,Util.distance(points[0],points[1]),Util.distance(points[0],points[1]));

    }



    
}
