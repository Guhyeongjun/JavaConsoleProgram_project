package controller;

import java.util.Scanner;

import view.CharacterView;

public class CharacterController {
	private Scanner sc = new Scanner(System.in);
	
	private CharacterView characterView;
	
	public CharacterController() {
		this.characterView = new CharacterView();
	}
	
	//캐릭터 생성 프로그램 시작
	public void runCharacter() {
		int choice;
			while(true) {
				//캐릭터 메뉴
				choice = characterView.getCharacterMenu();
				//번호에 따라 기능 분류
				switch(choice) {
				case 1:
					getCharacter();
					break;
				case 2:
					readCharacter();
					break;
				case 3:
					updateCharacter();
					break;
				case 4:
					deleteCharacter();
					break;
				case 5:
            		System.out.println("Exiting the program.");
            		System.exit(0);
            		break;
				}
			}
	}
	
	//Create character
	public void getCharacter() {
		characterView.getCharacter();
	}
	//Read character
	public void readCharacter() {
		characterView.readCharacter();
	}
	//Update character
	public void updateCharacter() {
		characterView.updateCharacter();
	}
	//Delete character
	public void deleteCharacter() {
		characterView.deleteCharacter();
	}
	
	
}