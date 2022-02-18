import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    //sky
    noStroke();
    fill(137, 207, 240);
    rect(0, 0, 400, 200);
    
    //sun
    fill(250, 253, 15);
    ellipse(0, 0, 100, 100);

    //house
    fill(237, 201, 175);
    rect(110, 125, 175, 175);

    //roof
    fill(72, 72, 72);
    triangle(80, 150, 315, 150, (float)197.5, 50);

    //door
    fill(66, 40, 14);
    rect(220, 230, 40, 70);

    //doorknob
    stroke(0, 0, 0);
    fill(250, 253, 15);
    ellipse(253, 265, 5, 5);

    //cloud 1
    noStroke();
    fill(251, 255, 255);
    ellipse(300, 50, 30, 30);

    fill(251, 255, 255);
    ellipse(320, 50, 30, 30);

    fill(251, 255, 255);
    ellipse(340, 50, 30, 30);

    fill(251, 255, 255);
    ellipse(311, 35, 30, 30);

    fill(251, 255, 255);
    ellipse(329, 35, 30, 30);

    //cloud 2
    fill(251, 255, 255);
    ellipse(60, 100, 30, 30);

    fill(251, 255, 255);
    ellipse(80, 100, 30, 30);

    fill(251, 255, 255);
    ellipse(100, 100, 30, 30);

    fill(251, 255, 255);
    ellipse(71, 85, 30, 30);

    fill(251, 255, 255);
    ellipse(89, 85, 30, 30);
    
  }
  
  // define other methods down here.
}