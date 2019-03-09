package StickFigureAnimaor;

import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Editor extends JFrame {

    int xFit=12;
    int yFit=36;


    public static ArrayList<DraggableComponent> components=new ArrayList<>();

    Editor()
    {
        setSize(800,600);
        //setLocation(500,500);
        setTitle("Mr. Stick Editor");

        setLayout(null);

        setMinimumSize(new Dimension(400,300));


        new StickFigure(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




        setVisible(true);


        /*
        ArrayList<Component> components=getAllComponents(this);

        for(Component xx:components)
        {
            System.out.println(xx);
        }
        */



    }


    public static ArrayList<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        ArrayList<Component> compList = new ArrayList<Component>();
        for (Component comp : comps) {
            compList.add(comp);
            if (comp instanceof Container)
                compList.addAll(getAllComponents((Container) comp));
        }
        return compList;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int i=0;i<components.size();i++)
        {
            try{
                DraggableComponent dC=components.get(i);
                ArrayList<DraggableComponent> c =dC.childs;
                for (DraggableComponent x:c)
                {
                    g.drawLine(dC.getX()+xFit,dC.getY()+yFit,x.getX()+xFit,x.getY()+yFit);
                }
            }
            catch (Exception e)
            {

            }
        }

    }
}
