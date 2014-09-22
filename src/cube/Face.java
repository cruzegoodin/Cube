package cube;

public class Face {
	
	private Face Left, Right, Down, Up;
	
	private boolean blue;
	
	public Face() {
		
		blue = false;
		Left = null;
		Right = null;
		Down = null;
		Up = null;
		
	}

	public void setRight(Face rightFace)
	{
		Right = rightFace;
		
	}
	
	public void setLeft(Face leftFace)
	{
		Left = leftFace;
		
		
	}
	
	public void setDown(Face downFace)
	{
		Down = downFace;
	}
	
	public void setUp(Face upFace)
	{
		Up = upFace;
	}
	
	public Face getRight()
	{
		return Right;
	}
	
	public Face getLeft()
	{
		return Left;
	}
	
	public Face getDown()
	{
		return Down;
	}
	
	public Face getUp()
	{
		return Up;
	}
	
	public boolean isBlue()
	{
		return blue;
	}

	public void setBlue()
	{
		if(blue)
		{
			blue = false;
		}
		else
		{
			blue = true;
		}
	}
	
}
