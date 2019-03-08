package SFA;

import java.awt.*;
import java.util.List;
import java.util.Vector;

public class Util {

    static int distance(Point a,Point b)
    {
        return (int)a.distance(b);
    }

    static int distance(PointColored a,PointColored b)
    {
        return (int)new Point(a.x,a.y).distance(new Point(b.x,b.y));
    }

}
