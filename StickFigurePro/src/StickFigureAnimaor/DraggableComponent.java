package StickFigureAnimaor;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

public class DraggableComponent extends JComponent implements MouseListener,MouseMotionListener {

    int posX;
    int posY;

    JFrame frame;

    int maxDistance;

    public DraggableComponent parent;
    public ArrayList<DraggableComponent> childs=new ArrayList<>();

    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;

    private static Color[] colors=new Color[]{Color.red,Color.green,Color.blue};

    private int rad=10;

    public void addParent(DraggableComponent p)
    {
        this.parent=p;
    }

    public void addChild(DraggableComponent dg)
    {
        if(childs==null)
        {
            childs=new ArrayList<>();
        }
        //dg.addParent(this);
        childs.add(dg);
    }

    public DraggableComponent()
    {
        this(50,50,0);
    }

    public DraggableComponent(int posX,int posY,int color) {

        this(null,posX,posY,color);


    }

    public DraggableComponent(JFrame frame,int posX,int posY,int color) {

        this(null,posX,posY,color,null);


    }
    public DraggableComponent(JFrame frame,int posX,int posY,int color,ArrayList<DraggableComponent> childs) {

        this(frame,posX,posY,color,childs,null);

    }
    public DraggableComponent(JFrame frame,int posX,int posY,int color,ArrayList<DraggableComponent> childs,DraggableComponent parent) {
        this(frame,posX,posY,color,childs,null,50);

    }
    public DraggableComponent(JFrame frame,int posX,int posY,int color,ArrayList<DraggableComponent> childs,DraggableComponent parent,int maxDistance) {
        this.frame=frame;
        setBorder(new LineBorder(colors[color], 3));
        setBackground(Color.WHITE);
        setBounds(posX-rad/2, posY-rad/2, rad, rad);
        setOpaque(false);
        this.posX=posX;
        this.posY=posY;
        this.childs=childs;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        Editor.components.add(this);
        this.parent=parent;
        this.maxDistance=maxDistance;
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
        int deltaX = e.getXOnScreen() - screenX;
        int deltaY = e.getYOnScreen() - screenY;

        if(myX + deltaX-rad/2<20 || myY + deltaY-rad/2<20 || myY + deltaY-rad/2>frame.getHeight()-60 || myX + deltaX-rad/2>frame.getWidth()-40)
        {
            return;
        }

        /*
        if(parent!=null && parent.getLocation().distance(this.getX(),this.getY())>=maxDistance)
        {


            setLocation(myX + deltaX-rad/2-2, myY + deltaY-rad/2-2);
            posX=getX();
            posY=getY();


            return;
        }
        */

        setLocation(myX + deltaX-rad/2, myY + deltaY-rad/2);
        posX=getX();
        posY=getY();

        frame.repaint();



    }

    @Override
    public void mouseMoved(MouseEvent e) { }

    /*
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.drawOval(getX(),getY(),rad,rad);
    }

    @Override
    public void repaint() {
        super.repaint();
    }
    */
}
