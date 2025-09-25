package ch3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DelEX {

	public static void main(String[] args) {
		
		List<ListDTO> list = new ArrayList<>();
		
		list.add(new ListDTO(10, "한라봉"));
		list.add(new ListDTO(20, "진지향"));
		list.add(new ListDTO(30, "설국향"));
		list.add(new ListDTO(40, "불로초"));
		list.add(new ListDTO(50, "오렌지"));
		list.add(new ListDTO(60, "천혜향"));
		list.add(new ListDTO(70, "레드향"));
		list.add(new ListDTO(80, "윈터프린스"));
		
		int deleteId = 30;
		
		// 1. 인덱스 기반 삭제
		System.out.println("=== for문 삭제 ===");
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == deleteId) {
				list.remove(i);
				break;
			}
		}
		System.out.println(list);
		
		// 2. Iterator 삭제
		// List 같은 여러 데이터를 순차적으로 꺼낼 수 있게 도와주는 객체
		System.out.println("=== Iterator 삭제 ===");
		
		Iterator<ListDTO> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getId() == deleteId) {
				it.remove();
				break;
			}
		}
		System.out.println(list);
		
		// 3. Stream 삭제 .removeIf()
		/*
			Stream
			List, Set, 배열 등 여러 데이터를 반복문 없이 처리할 수 있게 도와줌
			메서드 체이닝: .method().method2()
			
			.filter(): 걸러냄
			.map(): 값 변환
			.forEach(): 각 요소들의 반복
			.findFirst(): 첫번째 값만 반환
			.sorted(): 정렬
			.collect(): 여러 데이터를 모아 새로운 컬렉션으로 반환
		 */
		System.out.println("=== Stream 삭제 ===");
		// 람다식: 이름 없는 함수로 한 줄로 표현. (매개변수) -> { 실행문 }
		list.removeIf(n -> n.getId() == deleteId);
		System.out.println(list);
		
		// 4. Stream + Collect = 원본 리스트는 그대로 두고 새로운 리스트로 반환
		System.out.println("=== Stream + Collect 삭제 ===");
		List<ListDTO> newList = list.stream()
								.filter(n -> n.getId() != deleteId)
								.toList();
		System.out.println("newList: " + newList);
		System.out.println("원본" + list); 
	}

}
