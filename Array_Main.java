package arrayList;

import java.util.*;

public class Array_Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Contents> students = new ArrayList<>();
		int selNum_W,selNum_S, score, count = 0;
		String name;
		
		while(true) {
		System.out.println("================= 성적 입력 =================");
		System.out.printf("0. 초기화\n1. 성적 입력\n2. 성적 출력\n3. 끝내기\n");
		System.out.println("==========================================");
		System.out.printf(">> ");
		selNum_W = scan.nextInt();
			
			switch (selNum_W) {
		
				case 0 :
				
				if (students.isEmpty()) {
					System.out.println("입력된 정보가 없습니다. \n");
					count ++;
				}
				else {
					students.clear();
					
					break;
				}
			case 1 :
				while(true) {
					
					int C_Input = 0;
					System.out.println("이름 입력 > ");
					name = scan.next();
					System.out.println("성적 입력 > ");
					score = scan.nextInt();
				
					students.add(new Contents(name, score));
				
					System.out.println("계속 입력하시려면 1, 아니면 다른 숫자를 입력 해주세요.");
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
					System.out.println("입력된 정보가 없습니다.");
					count ++;
				}
				else {
				System.out.println("이름 입력 >> ");
				name = scan.next();
				int C_Output = 0;
				
				for (int i = 0; i < students.size(); i++) {
					if(name.equals(students.get(i).getName())) {
						System.out.println("이름 : " + students.get(i).getName() + ", 성적 : " + students.get(i).getScore());
						System.out.println();
						C_Output ++;
					}
				}
				if(C_Output == 0) {
					System.out.println("검색한 이름이 없습니다.");
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

