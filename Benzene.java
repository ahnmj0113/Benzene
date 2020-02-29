import gpdraw.*;
import java.awt.Color;
/**
 *draw Benzene
 * 
 * @author Minji Jenny Ahn 
 * @version 9/8/16
 */

public class Benzene{
 	private DrawingTool myPencil;
    private SketchPad myPaper;
	public Benzene(){
		myPaper = new SketchPad(300, 300);
	    myPencil = new DrawingTool(myPaper);
	}

  	public void drawHexagon(int side){    
	    //draw a hexagon
	    myPencil.setColor(Color.red);
	    myPencil.setWidth(2);
	    myPencil.up();
	    myPencil.home();
	    myPencil.setDirection(90);
	    myPencil.forward(side);
	    myPencil.turnRight(120);
	    myPencil.down();
	    myPencil.forward(side);
	    myPencil.turnRight(60);
	    myPencil.forward(side);
	    myPencil.turnRight(60);
	    myPencil.forward(side);
	    myPencil.turnRight(60);
	    myPencil.forward(side);
	    myPencil.turnRight(60);
	    myPencil.forward(side);
	    myPencil.turnRight(60);
	    myPencil.forward(side);
	    
	    //second hexagon
	    myPencil.setColor(Color.orange);
	    myPencil.up();
	    myPencil.home();
	    myPencil.setDirection(90);
	    myPencil.forward(side+10);
	    myPencil.turnRight(125);
	    myPencil.down();
	    myPencil.forward(side+10);
	    myPencil.turnRight(60);
	    myPencil.forward(side+10);
	    myPencil.turnRight(60);
	    myPencil.forward(side+10);
	    myPencil.turnRight(60);
	    myPencil.forward(side+10);
	    myPencil.turnRight(60);
	    myPencil.forward(side+10);
	    myPencil.turnRight(60);
	    myPencil.forward(side+10);
	    
	    //third hexagon
	    myPencil.setColor(Color.yellow);
	    myPencil.up();
	    myPencil.home();
	    myPencil.setDirection(90);
	    myPencil.forward(side+20);
	    myPencil.turnRight(130);
	    myPencil.down();
	    myPencil.forward(side+20);
	    myPencil.turnRight(60);
	    myPencil.forward(side+20);
	    myPencil.turnRight(60);
	    myPencil.forward(side+20);
	    myPencil.turnRight(60);
	    myPencil.forward(side+20);
	    myPencil.turnRight(60);
	    myPencil.forward(side+20);
	    myPencil.turnRight(60);
	    myPencil.forward(side+20);
	    
	    //fourth hexagon
	    myPencil.setColor(Color.green);
	    myPencil.up();
	    myPencil.home();
	    myPencil.setDirection(90);
	    myPencil.forward(side+30);
	    myPencil.turnRight(135);
	    myPencil.down();
	    myPencil.forward(side+30);
	    myPencil.turnRight(60);
	    myPencil.forward(side+30);
	    myPencil.turnRight(60);
	    myPencil.forward(side+30);
	    myPencil.turnRight(60);
	    myPencil.forward(side+30);
	    myPencil.turnRight(60);
	    myPencil.forward(side+30);
	    myPencil.turnRight(60);
	    myPencil.forward(side+30);
	    
	    //fifth hexagon
	    myPencil.setColor(Color.blue);
	    myPencil.up();
	    myPencil.home();
	    myPencil.setDirection(90);
	    myPencil.forward(side+40);
	    myPencil.turnRight(140);
	    myPencil.down();
	    myPencil.forward(side+40);
	    myPencil.turnRight(60);
	    myPencil.forward(side+40);
	    myPencil.turnRight(60);
	    myPencil.forward(side+40);
	    myPencil.turnRight(60);
	    myPencil.forward(side+40);
	    myPencil.turnRight(60);
	    myPencil.forward(side+40);
	    myPencil.turnRight(60);
	    myPencil.forward(side+40);
  	}
  	
  	public void drawCir(int radius){
  	    // draw a circle
	    myPencil.drawCircle(radius);
	    myPencil.drawCircle(radius);
	    myPencil.setWidth(2);
	    myPencil.drawCircle(radius-10);
	    myPencil.setWidth(4);
	    myPencil.drawCircle(radius-20);
	    myPencil.setWidth(6);
	    myPencil.drawCircle(radius-30);
	    myPencil.setWidth(8);
	    myPencil.drawCircle(radius-40);
	    myPencil.fillCircle(radius-47);
  	 }
}
