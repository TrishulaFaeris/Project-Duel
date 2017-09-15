package main;

public class CharacterB implements Dueler {
	private int hp;
	public CharacterB()
	{
		
	}
	public String getName()
	{
		return "Zegion Tempest";
	}
	public void taunt()
	{
		System.out.println("We don't need ya here, get the fudge inside!");
	}
	public void setStartingHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public int getAction(Object caller) {

	}
	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		
	}
}
