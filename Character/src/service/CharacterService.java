package service;

import java.util.List;

//Model - 캐릭터 데이터와 연관 있는 클래스들
public interface CharacterService {
	
	//Update(수정)
	void updateCharacter(int index, String newName, int checkIndex);
	
	//Delete(삭제)
	void deleteCharacter(int index, int checkIndex);
	
	//캐릭터 정보가 저장된 배열을 가져 오는 메소드
	List<view.Character> getAllCharacters();

	
}


