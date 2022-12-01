package ArrayList;

public class Music {

	// 1. 필드
	private String title; // 제목
	private String singer; // 가수이름
	private int second; // 몇초짜리 노래인지

	// 2. 메소드
	// 모든 필드에 대한 getter 메소드
	// 모든 필드를 생성하는 순간 초기화 시킬 수 있는 생성자 메소드
	public Music(String title, String singer, int second) {

		this.title = title;
		this.singer = singer;
		this.second = second;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
