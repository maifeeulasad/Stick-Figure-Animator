package SFA;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class PointColored implements ChangeListener {
    int x,y,color;
    PointColored(int x,int y,int color){

        this.x=x;
        this.y=y;
        this.color=color;


    }

    public Point getPoint()
    {
        return new Point(x,y);
    }

    public int color()
    {
        return color;
    }

    public void posChange(Point x)
    {
        this.x=x.x;
        this.y=x.y;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println("point change");
    }
}
