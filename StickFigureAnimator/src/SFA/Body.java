package SFA;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.lang.reflect.Field;

public class Body implements ChangeListener {

    public PointColored headUp=new PointColored(50,10,2);
    public PointColored headDown=new PointColored(50,40,2);
    public PointColored leftHandMid=new PointColored(30,25,1);
    public PointColored rightHandMid=new PointColored(70,25,0);
    public PointColored leftHand=new PointColored(10,10,1);
    public PointColored rightHand=new PointColored(90,10,0);
    public PointColored legJoint=new PointColored(50,75,2);
    public PointColored leftLegMid=new PointColored(30,100,1);
    public PointColored righttLegMid=new PointColored(70,100,0);
    public PointColored leftLeg=new PointColored(10,120,1);
    public PointColored rightLeg=new PointColored(90,120,0);


    public PointColored[] getAllPoints() throws IllegalAccessException {

        PointColored[] res=new PointColored[11];
        int i=0;

        Field[] fields=this.getClass().getFields();
        for (Field field:
             fields) {
            res[i++]=(PointColored) field.get(this);
            //System.out.println();

        }
        return res;
    }
    


    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println("changed");

    }
}
