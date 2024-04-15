package service;

import java.util.ArrayList;
import view.Character;
import java.util.List;

public class CharacterRepository implements CharacterService{
	private List<Character> characters = new ArrayList<>();
	
	@Override
	public void updateCharacter(int index, String newName, int checkIndex) {
		if (index < 1 || index > characters.size()) {
	        System.out.println("Invalid character number.");
	        return;
	    }
		
		Character characterToUpdate = characters.get(index - 1);
	    characterToUpdate.setName(newName);
	    System.out.println("Character name updated successfully.");
	}
	
	@Override
	public void deleteCharacter(int index, int checkIndex) {
		if (characters.isEmpty()) {
	        System.out.println("No characters available to delete");
	        return;
	    }

	    if (index < 1 || index > characters.size()) {
	        System.out.println("Invalid character number.");
	        return;
	    }

	    Character deletedCharacter = characters.remove(index - 1);
	    System.out.println("Character deleted successfully:");
	    System.out.println(deletedCharacter);
	}

	@Override
	public List<Character> getAllCharacters() {
		return characters;
	}

}



