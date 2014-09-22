package cube;

public class Arrow {
	
	public Cube cube;
	public Board board;
	
	

	public Arrow() {
	
		cube = new Cube(1,3);
		board = new Board();
		
		
	}
	
	public void Move(int dir)
	{
		switch(dir)
		{
		case 0:
			if(cube.getLoc()%4 != 0)
			{
			cube.Left();
			}
		break;
		case 1: 
			if(cube.getLoc()%4 != 3)
			{
				cube.Right();
			}
		break;
		case 2: 
			if(cube.getLoc() > 3)
			{
			cube.Down();
			}
		break;
		case 3: 
			if(cube.getLoc() < 12)
			{
			cube.Up();
			}
		break;
		}
		State();
		
	}
	
	public void State()
	{
		int cubeLoc = cube.getLoc();
		boolean cubeBlue = cube.isBlue();
		boolean boardBlue = board.getSquare(cubeLoc);
		
		if(cubeBlue != boardBlue)
		{
			
			board.setSquare(cubeLoc);
			cube.setBlue();
	
		}		
		
	}
	
	public boolean isGoal()
	{
		if(board.number() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
