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
		if(Math.random() < 0.34) {
		System.out.println("We don't need ya here, get the fudge inside!");
		}
		else {
			if(Math.random() < 0.67) {
				System.out.println("Why don't ya go suck on your mama's chest.");
			}
			else {
				System.out.println("Omae wa mou shindeiru.");
			}
		}
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
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
		boolean d2Loaded = false;
		
		if(Math.random() <0.25){
			return 3;
		}
		else {
			if(Math.random()<0.75) {
				return 2;
			}
			else {
				if(d2Loaded == false) {
					d2Loaded = true;
					return 0;
				}
				else {
					d2Loaded = false;
					return 1;
				}
			}
			
		}
	}
	public void hit(Object caller) {
		if(caller instanceof Duel) {
		 this.hp = this.hp - 10;
		}
	}
}

