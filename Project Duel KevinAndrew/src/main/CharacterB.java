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
	public void setStartingHP(int hp) {

	}
	public int getHP() {

	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {

	}
}
