package 객체배열;

public class Pokemon {

	// 1. 필드
	private String name; // 이름
	private String type; // 타입
	private int hp; // hp
	private int atk; // 공격력
	private String skill; // 스킬

	// 2. 메소드
	// 생성자 단축키
	// alt+shift+s
	public Pokemon(String name, String type, int hp, int atk, String skill) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.skill = skill;
	}

	// 모든 필드의 getter, setter 메소드 생성하기
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	// getter , setter 메소드 생성 단축키
	// alt + shift + s

	// 모든 필드의 값을 초기화 시킬 수 있는 생성자를 새롭게 만들기

}
