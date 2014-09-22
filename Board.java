package cube;

public class Board {

	public boolean[] square;
	
	public Board() {
		
		square = new boolean[16];
		
		square[0] = false;
		square[1] = false;
		square[2] = false;
		square[3] = true;
		square[4] = false;
		square[5] = false;
		square[6] = false;
		square[7] = true;
		square[8] = false;
		square[9] = false;
		square[10] = false;
		square[11] = true;
		square[12] = true;
		square[13] = false;
		square[14] = true;
		square[15] = true;

		
	}
	
	public int number()
	{
	int index = 0;
	int numberblue = 0;
		while(index < square.length)
		{
			if(square[index])
			{
			numberblue++;
			}
			index++;
		}
		return numberblue;
	}
	
	public void setSquare(int loc)
	{
		if(square[loc])
		{
			square[loc] = false;
		}
		
		else
		{
			square[loc] = true;
		}
	}

	public boolean getSquare(int loc)
	{	
	return square[loc];
	}
}
