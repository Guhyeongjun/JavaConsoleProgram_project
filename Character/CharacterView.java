package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterView {
	private Scanner sc = new Scanner(System.in);
	private List<Character> characters = new ArrayList<>();
	
	//캐릭터 콘솔
	public int getCharacterMenu() {
		System.out.println("==== Character Console Program ====");
		System.out.println("1. Create Character");
		System.out.println("2. Read Character");
		System.out.println("3. Update Character");
		System.out.println("4. Delete Character");
		System.out.println("5. Exit");
		System.out.print("Choose an option: ");
		int choice = -1;
		try {
			choice = sc.nextInt();
			sc.nextLine();			
		} catch(Exception e) {
			System.out.println("1 ~ 5의 번호를 입력해주세요.");
			sc.nextLine();
		}
		return choice;
	}
	
	//직업 선택
	public void getCharacter() {
		System.out.println("==== Select job ====");
	    System.out.println("1. Warrior");
	    System.out.println("2. Mage");
	    System.out.println("3. Archer");
	    System.out.println("4. Priest");
	    
	    int jobNum;
	    String job = "";
	    try {
	    	System.out.print("Enter job choice (1-4) : ");
	    	while(!sc.hasNextInt()) {
	    		System.out.println("잘못된 입력입니다. 1 ~ 4의 번호를 입력해주세요. : ");
	    		sc.next();
	    	}
	    	jobNum = sc.nextInt();
	    	if(jobNum < 1 || jobNum > 4) {
	    		throw new IllegalArgumentException("1 ~ 4의 번호를 입력해주세요.");
	    	}
	    	switch(jobNum) {
	    		case 1:
	    			job = "Warrior";
	    			break;
	    		case 2:
	    			job = "Mage";
	    			break;
	    		case 3:
	    			job = "Archer";
	    			break;
	    		case 4:
	    			job = "Priest";
	    			break;
	    	}	    	
	    } catch (IllegalArgumentException e) {
	    	System.out.println(e.getMessage());
	    	return;
	    }
	     	
	    //이름 작성
	    System.out.print("Enter name : ");
	    sc.nextLine();
	    String name = sc.nextLine();
	    
	    //성별 선택
	    System.out.println("Select gender : ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        int genderNum;
        String gender = "";
        try {
        	System.out.print("Enter gender choice (1-2) : ");
	    	while(!sc.hasNextInt()) {
	    		System.out.println("잘못된 입력입니다. 1 ~ 2의 번호를 입력해주세요. : ");
	    		sc.next();
	    	}
	    	genderNum = sc.nextInt();
	    	if(genderNum < 1 || genderNum > 2) {
	    		throw new IllegalArgumentException("1 ~ 2의 번호를 입력해주세요.");
	    	}
	    	gender = (genderNum == 1) ? "Male" : "Female";
	    } catch (IllegalArgumentException e) {
	    	System.out.println(e.getMessage());
	    	return;
	    }
        
        //서버 선택
        System.out.println("Select server : ");
        System.out.println("1. Korea");
        System.out.println("2. America");
        System.out.println("3. Russia");
        System.out.println("4. Japan");
        int serverNum;
        String server = "";
        try {
	    	System.out.print("Enter server choice (1-4) : ");
	    	while(!sc.hasNextInt()) {
	    		System.out.println("잘못된 입력입니다. 1 ~ 4의 번호를 입력해주세요. : ");
	    		sc.next();
	    	}
	    	serverNum = sc.nextInt();
	    	if(serverNum < 1 || serverNum > 4) {
	    		throw new IllegalArgumentException("1 ~ 4의 번호를 입력해주세요.");
	    	}
	    	switch (serverNum) {
            	case 1:
            		server = "Korea";
            		break;
            	case 2:
            		server = "America";
            		break;
            	case 3:
            		server = "Russia";
            		break;
            	case 4:
            		server = "Japan";
            		break;
            	
  
	    	}	    	
	    } catch (IllegalArgumentException e) {
	    	System.out.println(e.getMessage());
	    	return;
	    }    
        
        //캐릭터 생성 및 저장
        Character character = new Character(job, name, gender, server);
        characters.add(character);
        System.out.println("Character created successfully.");
	}
	
	//캐릭터 정보 출력
	public void readCharacter() {
		if (characters.isEmpty()) {
	        System.out.println("No characters available.");
	        return;
	    }
		
		System.out.println("==== Display My Characters ====");
		for (int i = 0; i < characters.size(); i++) {
            System.out.println((i+1) + ". " + characters.get(i));
        }	
	}
	
	//캐릭터 이름 변경하기
	public void updateCharacter() {
		 System.out.println("==== Update Character Name ====");
		 System.out.print("Select the character number to update: ");
		 int index = sc.nextInt();
		 sc.nextLine();	
		 
		 if (index < 1 || index > characters.size()) {
	            System.out.println("Invalid character number.");
	            return;
	     }

	     System.out.print("Enter new name : ");
	     String newName = sc.nextLine();	
	     
	     System.out.println("Press 1 to run or 2 to cancel : ");
	     int checkIndex = sc.nextInt();
	     if(checkIndex == 1) {
	    	 Character characterToUpdate = characters.get(index - 1);
	    	 characterToUpdate.setName(newName);
	    	 System.out.println("Character name updated successfully.");	    	 
	     } else {
	    	 return;
	     } 	
		 
	}
	
	//캐릭터 삭제하기
	public void deleteCharacter() {
		if(characters.isEmpty()) {
			System.out.println("No characters available to delete");
			return;
		}
		System.out.println("==== Delete Character ====");
		System.out.print("Select the character number to delete: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (index < 1 || index > characters.size()) {
	        System.out.println("Invalid character number.");
	        return;
	    }
		
		System.out.println("Press 1 to run or 2 to cancel : ");
	     int checkIndex = sc.nextInt();
	     if(checkIndex == 1) {
	    	Character deletedCharacter = characters.remove(index - 1);
	 	    System.out.println("Character deleted successfully:");
	 	    System.out.println(deletedCharacter);    	 
	     } else {
	    	 return;
	     }
	}
	
	//실행 종료하기
	public void exitCharacter() {
		System.out.println("Exiting the program.");
		System.exit(0);
	}
}
