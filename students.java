package arrayList;

public class students {
	private String name;
	private int result, ranking;
	
	students(String name, int result) { //학생의 이름, 결과를 입력받음
		this.name = name;//students 의 이름, 결과 값
		this.result = result;
	}
	
	public String pName() { //출력 할 이름, 결과, 순위 값
		return name;
	}
	public int presult() {
		return result;
	}
	public int pranking() {
		return ranking;
	}
	public void set_ranking(int ranking) { //아직 어떻게 쓰이는지 모름
		this.ranking = ranking;
	}
}
