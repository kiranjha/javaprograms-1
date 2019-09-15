package sep15;

public class InheritancePlayerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = null;
		
		
		player = new Cricket_Player();
		player.action();
		player = new Football_Player();
		player.action();
		player = new Hockey_Player();
		player.action();
		player.setName("Ignou");
		System.out.println(player.getName());

	}

}

class Player{
	int i;
	private String name;
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void action() {
		System.out.print("Playing");
	}
}

class Cricket_Player extends Player{
	
	@Override
	public void action() {
		// TODO Auto-generated method stub
		super.action();
		System.out.println("Hitting sixes and fours.");
	}
}
class Football_Player extends Player{
	@Override
	public void action() {
		// TODO Auto-generated method stub
		super.action();
		System.out.println("Scoring goals");
	}
}
class Hockey_Player extends Player{
	@Override
	public void action() {
		// TODO Auto-generated method stub
		super.action();
		System.out.println("Giving pass to other players");
	}
	
}
