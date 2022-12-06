package model;

public class StudentDTO {
	// DTO : Data Transfer Object 데이터를 이동할 수 있게 하는 나만의 자료형
	
	
	// id , pw , 이름 , 나이
	// 필드 , 메소드(생성자) , getter , setter
	private String id;
	private String pw;
	private String name;
	private int age;

	public StudentDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
