package arrayList;

public class students {
	private String name;
	private int result, ranking;
	
	students(String name, int result) { //�л��� �̸�, ����� �Է¹���
		this.name = name;//students �� �̸�, ��� ��
		this.result = result;
	}
	
	public String pName() { //��� �� �̸�, ���, ���� ��
		return name;
	}
	public int presult() {
		return result;
	}
	public int pranking() {
		return ranking;
	}
	public void set_ranking(int ranking) { //���� ��� ���̴��� ��
		this.ranking = ranking;
	}
}
