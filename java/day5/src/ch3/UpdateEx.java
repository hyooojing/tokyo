package ch3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateEx {

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
		
		int updateId = 10;
		String newName = "만다린";
		
		// 1. 인덱스 for문으로 수정
		System.out.println(" === for문 수정 === ");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == updateId) {
				list.get(i).setName(newName);
				break;
			}
		}
		System.out.println(list);
		
		list.clear();
		list.add(new ListDTO(10, "한라봉"));
		list.add(new ListDTO(20, "진지향"));
		list.add(new ListDTO(30, "설국향"));
		list.add(new ListDTO(40, "불로초"));
		list.add(new ListDTO(50, "오렌지"));
		list.add(new ListDTO(60, "천혜향"));
		list.add(new ListDTO(70, "레드향"));
		list.add(new ListDTO(80, "윈터프린스"));
		
		// 2. for-each문으로 수정
		System.out.println(" === for-each문 수정 === ");
		for(ListDTO dto : list) {
			if(dto.getId() == updateId) {
				dto.setName(newName);
				break;
			}
		}
		System.out.println(list);
		
		// 3. Iterator 수정
		System.out.println(" === Iterator문 수정 === ");
		Iterator<ListDTO> it = list.iterator();
		while (it.hasNext()) {
			ListDTO dto = it.next();
			if(dto.getId() == updateId) {
				dto.setName("iterator");
				break;
			}
		}
		System.out.println(list);
		
		// 4. Stream 수정
		System.out.println(" === Stream문 수정 === ");
		list.stream()
			.filter(dto -> dto.getId() == updateId)
			.forEach(dto -> dto.setName(newName));
		System.out.println(list);
	}

}
