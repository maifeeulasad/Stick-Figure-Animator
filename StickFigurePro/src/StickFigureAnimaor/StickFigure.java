package StickFigureAnimaor;

public class StickFigure {

    int fitX=50;
    int fitY=50;

    StickFigure(Editor editor)
    {

        fitX=editor.getWidth()/3;
        fitY=editor.getHeight()/3;

        DraggableComponent head=new DraggableComponent(editor,fitX+50,fitY+50,0,null);
        DraggableComponent handJoint=new DraggableComponent(editor,fitX+50,fitY+100,0,null);
        DraggableComponent legJoint=new DraggableComponent(editor,fitX+50,fitY+150,0,null);

        DraggableComponent leftHandMid=new DraggableComponent(editor,fitX+30,fitY+70,1,null);
        DraggableComponent leftHandUp=new DraggableComponent(editor,fitX+25,fitY+40,1,null);
        DraggableComponent leftLegMid=new DraggableComponent(editor,fitX+30,fitY+160,1,null);
        DraggableComponent leftLegDown=new DraggableComponent(editor,fitX+25,fitY+200,1,null);


        DraggableComponent rightHandMid=new DraggableComponent(editor,fitX+70,fitY+70,2,null);
        DraggableComponent rightHandUp=new DraggableComponent(editor,fitX+75,fitY+40,2,null);
        DraggableComponent rightLegMid=new DraggableComponent(editor,fitX+70,fitY+160,2,null);
        DraggableComponent rightLegDown=new DraggableComponent(editor,fitX+75,fitY+200,2,null);

        head.addChild(handJoint);
        handJoint.addChild(leftHandMid);
        handJoint.addChild(rightHandMid);
        handJoint.addChild(legJoint);
        leftHandMid.addChild(leftHandUp);
        rightHandMid.addChild(rightHandUp);
        legJoint.addChild(leftLegMid);
        legJoint.addChild(rightLegMid);
        leftLegMid.addChild(leftLegDown);
        rightLegMid.addChild(rightLegDown);


        editor.add(head);
        editor.add(handJoint);
        editor.add(legJoint);


        editor.add(leftHandMid);
        editor.add(leftHandUp);
        editor.add(rightHandMid);
        editor.add(rightHandUp);

        editor.add(leftLegMid);
        editor.add(leftLegDown);
        editor.add(rightLegMid);
        editor.add(rightLegDown);


    }

}
