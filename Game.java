package cube;

public class Game {

	Arrow arrow;
	
	
	public Game() {
		
		arrow = new Arrow();
		
		
	}
	
	public void Run()
	{
		Trivial();
	}

	public void Trivial()
	{
	arrow.Move(0);
	arrow.Move(1);
	arrow.Move(1);
	arrow.Move(1);
	arrow.Move(2);
	arrow.Move(2);
	arrow.Move(2);
	
	if(arrow.isGoal())
	{
		System.out.println("You WON!");
	}
	else
	{
		System.out.println("You lose...");
	}
	
	
	}
}
