package arrayList;

import java.util.*;

public class Array_Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Contents> students = new ArrayList<>();
		int selNum_W,selNum_S, score, count = 0;
		String name;
		
		while(true) {
		System.out.println("================= ���� �Է� =================");
		System.out.printf("0. �ʱ�ȭ\n1. ���� �Է�\n2. ���� ���\n3. ������\n");
		System.out.println("==========================================");
		System.out.printf(">> ");
		selNum_W = scan.nextInt();
			
			switch (selNum_W) {
		
				case 0 :
				
				if (students.isEmpty()) {
					System.out.println("�Էµ� ������ �����ϴ�. \n");
					count ++;
				}
				else {
					students.clear();
					
					break;
				}
			case 1 :
				while(true) {
					
					int C_Input = 0;
					System.out.println("�̸� �Է� > ");
					name = scan.next();
					System.out.println("���� �Է� > ");
					score = scan.nextInt();
				
					students.add(new Contents(name, score));
				
					System.out.println("��� �Է��Ͻ÷��� 1, �ƴϸ� �ٸ� ���ڸ� �Է� ���ּ���.");
					selNum_S = scan.nextInt();
				
					if (selNum_S == 1) {
						C_Input ++;
					}
					else {
						break;
						
					}
					break;
				}
			case 2 :
				if (students.isEmpty()) {
					System.out.println("�Էµ� ������ �����ϴ�.");
					count ++;
				}
				else {
				System.out.println("�̸� �Է� >> ");
				name = scan.next();
				int C_Output = 0;
				
				for (int i = 0; i < students.size(); i++) {
					if(name.equals(students.get(i).getName())) {
						System.out.println("�̸� : " + students.get(i).getName() + ", ���� : " + students.get(i).getScore());
						System.out.println();
						C_Output ++;
					}
				}
				if(C_Output == 0) {
					System.out.println("�˻��� �̸��� �����ϴ�.");
				}
				
				break;
				}
			
			case 3 :
				break;
	
				
		
				
			default :
				break;
			}
			break;
		}
		
	}
}

