package day5;

import java.util.ArrayList;
import java.util.List;

// 회원 리스트 저장, 조회
public class MemberDAO {

	/*
		List
		인터페이스
		
		ArrayList
		클래스
		
		.add(추가), .remove(삭제), .size(데이터 갯수), .get(읽기)
	 */
	
	// 회원정보를 순서대로 저장
	// [MemberDTO(한라봉), MemberDTO(진지향), MemberDTO(레드향) ... ]
	List<MemberDTO> memberList = new ArrayList<>();
	
	// 회원 한 명의 정보를 받아 memberList에 추가
	public void save(MemberDTO dto) {
		memberList.add(dto);
	}
	
	// 회원 리스트에 조회 -> 반환
	public List<MemberDTO> findAll() {
		return memberList;
	}
}
