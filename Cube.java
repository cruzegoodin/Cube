package cube;

public class Cube {
	
	private Face current;
	
	private int x;
	private int y;
	
	
	public Cube(int xloc, int yloc) {
		
		x = xloc;
		y = yloc;
	
		Face face1 = new Face();
		Face face2 = new Face();
		Face face3 = new Face();
		Face face4 = new Face();
		Face face5 = new Face();
		Face face6 = new Face();
		
		face1.setLeft(face3);
		face1.setRight(face5);
		face1.setDown(face4);
		face1.setUp(face2);
		
		face2.setLeft(face3);
		face2.setRight(face5);
		face2.setDown(face1);
		face2.setUp(face6);

		face3.setLeft(face6);
		face3.setRight(face1);
		face3.setDown(face4);
		face3.setUp(face2);

		face4.setLeft(face3);
		face4.setRight(face5);
		face4.setDown(face6);
		face4.setUp(face1);
		
		face5.setLeft(face1);
		face5.setRight(face6);
		face5.setDown(face4);
		face5.setUp(face2);
		
		face6.setLeft(face5);
		face6.setRight(face3);
		face6.setDown(face2);
		face6.setUp(face4);

		current = face1;
	}
	
	public void Left()
	{
		current = current.getLeft();
		x--;
		
	}
	public void Right()
	{
		current = current.getRight();
		x++;
		
	}
	public void Down()
	{
		current = current.getDown();
		y--;	
		
	}
	public void Up()
	{
		current = current.getUp();
		y++;
		
	}
	
	public int getLoc()
	{
		return y*4+x;
	}
	
	public boolean isBlue()
	{
		return current.isBlue();
	}

	public void setBlue()
	{
		current.setBlue();
	}
}
