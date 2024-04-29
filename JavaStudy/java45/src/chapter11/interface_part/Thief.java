package chapter11.interface_part;

//도적
public class Thief extends Novice implements Skill{

	private String name;		//캐릭터 이름
	private int strength;		//힘 스탯
	private int dexterity;		//민첩 스탯
	private int intelligence;	//지능 스탯
	
	//명시적 생성자
	public Thief() {};
	//Thief형 인스턴스 생성시 Novice의 명시적 생성자를 호출하여 각각의 초기값을 가지는 인스턴스 생성
	public Thief(String name, int strength, int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	//상위 클래스 Novice의 attack()메서드를 재정의(오버라이드)
	@Override
	public void attack() {
		System.err.println("치명적인 공격\n");
	}

	//interface Skill의 메서드 skill()를 구현한다. (오버라이드) 
	@Override
	public void skill() {
		System.err.println("중독\n");
	}
	
	public String toString() {
		return String.format("[ID: %s(도적), stat: 힘(%d), 민첩(%d), 지능(%d)]"
				, name, strength, dexterity, intelligence);
	}
}