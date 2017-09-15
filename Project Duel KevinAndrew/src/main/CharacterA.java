package main;

public class CharacterA implements Dueler{
	private int hp;
	public CharacterA() {
	}
	public void taunt() {
		System.out.println("Pew pew pew");
	}
	public String getName() {
		return "Trishula";
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp)
			return true;
		return false;
	}
	public int getAction(Object caller) {
		if(caller instanceof Dueler)
			return 3;
		else
		{
			return 0;
		}
	}
	public void hit(Object caller) {
		
	};
}
