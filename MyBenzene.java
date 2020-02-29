import gpdraw.*;
import java.awt.Color;
/**
 *draw Benzene
 * 
 * @author Minji Jenny Ahn 
 * @version 9/6/16
 */

public class MyBenzene{
 	private DrawingTool pencil;
    private SketchPad paper;
	public MyBenzene(){
		paper = new SketchPad(300, 300);
	    pencil = new DrawingTool(paper);
	}

  	public void drawBenzene(){
	    // draw a circle
	    pencil.drawCircle(65);
	    pencil.setWidth(2);
	    pencil.drawCircle(55);
	    pencil.setWidth(4);
	    pencil.drawCircle(45);
	    pencil.setWidth(6);
	    pencil.drawCircle(35);
	    pencil.setWidth(8);
	    pencil.drawCircle(25);
	    pencil.fillCircle(17);
 
	    //draw a hexagon
	    pencil.setColor(Color.red);
	    pencil.setWidth(2);
	    pencil.up();
	    pencil.home();
	    pencil.setDirection(90);
	    pencil.forward(100);
	    pencil.turnRight(120);
	    pencil.down();
	    pencil.forward(100);
	    pencil.turnRight(60);
	    pencil.forward(100);
	    pencil.turnRight(60);
	    pencil.forward(100);
	    pencil.turnRight(60);
	    pencil.forward(100);
	    pencil.turnRight(60);
	    pencil.forward(100);
	    pencil.turnRight(60);
	    pencil.forward(100);
	    
	    //second hexagon
	    pencil.setColor(Color.orange);
	    pencil.up();
	    pencil.home();
	    pencil.setDirection(90);
	    pencil.forward(110);
	    pencil.turnRight(110);
	    pencil.down();
	    pencil.forward(110);
	    pencil.turnRight(60);
	    pencil.forward(110);
	    pencil.turnRight(60);
	    pencil.forward(110);
	    pencil.turnRight(60);
	    pencil.forward(110);
	    pencil.turnRight(60);
	    pencil.forward(110);
	    pencil.turnRight(60);
	    pencil.forward(110);
	    
	    //third hexagon
	    pencil.setColor(Color.yellow);
	    pencil.up();
	    pencil.home();
	    pencil.setDirection(90);
	    pencil.forward(120);
	    pencil.turnRight(120);
	    pencil.down();
	    pencil.forward(120);
	    pencil.turnRight(60);
	    pencil.forward(120);
	    pencil.turnRight(60);
	    pencil.forward(120);
	    pencil.turnRight(60);
	    pencil.forward(120);
	    pencil.turnRight(60);
	    pencil.forward(120);
	    pencil.turnRight(60);
	    pencil.forward(120);
	    
	    //fourth hexagon
	    pencil.setColor(Color.green);
	    pencil.up();
	    pencil.home();
	    pencil.setDirection(90);
	    pencil.forward(130);
	    pencil.turnRight(130);
	    pencil.down();
	    pencil.forward(130);
	    pencil.turnRight(60);
	    pencil.forward(130);
	    pencil.turnRight(60);
	    pencil.forward(130);
	    pencil.turnRight(60);
	    pencil.forward(130);
	    pencil.turnRight(60);
	    pencil.forward(130);
	    pencil.turnRight(60);
	    pencil.forward(130);
	    
	    //fifth hexagon
	    pencil.setColor(Color.blue);
	    pencil.up();
	    pencil.home();
	    pencil.setDirection(90);
	    pencil.forward(140);
	    pencil.turnRight(140);
	    pencil.down();
	    pencil.forward(140);
	    pencil.turnRight(60);
	    pencil.forward(140);
	    pencil.turnRight(60);
	    pencil.forward(140);
	    pencil.turnRight(60);
	    pencil.forward(140);
	    pencil.turnRight(60);
	    pencil.forward(140);
	    pencil.turnRight(60);
	    pencil.forward(140);
	    
  	}
  	
}
