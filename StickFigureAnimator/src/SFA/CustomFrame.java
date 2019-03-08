package SFA;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CustomFrame extends JComponent implements MouseListener,MouseMotionListener {

    PointColored pointColored;

    StickFrame frame;

    private Color colors[]={Color.red,Color.green,Color.blue,Color.yellow,Color.orange};

    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;

    public CustomFrame(PointColored pointColored)
    {
        this(pointColored.color,pointColored.x,pointColored.y,10);
        this.pointColored=pointColored;
    }

    public CustomFrame(int color,int x,int y,int size)
    {

        setBorder(new LineBorder(colors[color], 3));
        setBackground(Color.WHITE);
        setBounds(x, y, size, size);
        setOpaque(false);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public CustomFrame(int color,int size)
    {
        this(color,0,0,size);
    }

    public  CustomFrame(int color){


        this(color,5);
    }


    public CustomFrame() {

        this(0);

    }

    public CustomFrame(PointColored t, StickFrame stickFrame) {

        this(t.color,t.x,t.y,10);
        this.frame=stickFrame;
        this.pointColored=t;
    }


    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mousePressed(MouseEvent e) {
        screenX = e.getXOnScreen();
        screenY = e.getYOnScreen();

        myX = getX();
        myY = getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }


    @Override
    public void mouseDragged(MouseEvent e) {
        if(getLocation().x<0 || getLocation().y<0)
        {
            return;
        }
        int deltaX = e.getXOnScreen() - screenX;
        int deltaY = e.getYOnScreen() - screenY;

        setLocation(myX + deltaX, myY + deltaY);

        pointColored.posChange(getLocation());

        frame.repaint();


    }

    @Override
    public void mouseMoved(MouseEvent e) { }




}
