package service;

import java.util.ArrayList;
import java.util.List;

import dto.FortuneDto;

//메모리에 운세들을 저장
public class FortuneRepository implements FortuneService {
	
	private List<FortuneDto> fortuneDtos = new ArrayList<>();
	
	@Override
	public void updateFortune(int index, String fortuneStr, int checkIndex) {
		FortuneDto fDto = new FortuneDto();
		if(checkIndex == 1) {
			fDto.setFortuneStr(fortuneStr);
			fortuneDtos.set(index, fDto);			
		} else if(checkIndex == 2) {
			return;
		}
	}
	
	@Override
	public void deleteFortune(int index, int checkIndex) {
		//인덱스 값으로 삭제 하기
		if(checkIndex == 1) {
			fortuneDtos.remove(index);
		} else if(checkIndex == 2) {
			return;
		}
		
		
	}
	
	public List<FortuneDto> getFortuneDtos() {
		return fortuneDtos;
	}

	@Override
	public void createFortune(String fortuneStr) {
		//운세 한개 생성 - FortuneDto 인스턴스 한개 생성
		FortuneDto fDto = new FortuneDto();
		//인스턴스 변수에 데이터 대입
		fDto.setFortuneStr(fortuneStr);
		//배열(ArrayList)에 저장
		fortuneDtos.add(fDto);
	}

	

}
