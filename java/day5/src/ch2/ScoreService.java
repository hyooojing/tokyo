package ch2;

import java.util.List;

// 비지니스 로직: 총점, 평균, 학점
public class ScoreService {

	private ScoreDAO dao;

	// 의존성 주입: 외부 DAO를 받아와 내부 변수로 저장. 교체 용이
	public ScoreService(ScoreDAO dao) {
		super();
		this.dao = dao;
	}
	
	// 점수 입력, 계산
	public void addScore(String name, int kor, int eng, int math) {
		
		ScoreDTO dto = new ScoreDTO(name, kor, eng, math);
	
		int total = kor + eng + math;
		double avg = total / 3.0;
		String grade = getGrade(avg);
		
		dto.setTotal(total);
		dto.setAvg(avg);
		dto.setGrade(grade);
		
		dao.save(dto);
	}
	
	private String getGrade(double avg) {
		
		if(avg >= 90) return "A";
		else if(avg >= 80) return "B";
		else if(avg >= 70) return "C";
		else if(avg >= 60) return "D";
		else return "F";
	}
	
	public List<ScoreDTO> getAllScore() {
		return dao.findAll();	// DAO에 저장된 학생 점수 리스트 전부 반환
	}

	public int getMaxTotal() {
		// 저장된 학생 리스트
		List<ScoreDTO> scores = getAllScore();
		if (scores.isEmpty()) 
			return 0;
		// 최대값을 찾을 때 제일 작은 값으로 초기화
		int max = Integer.MIN_VALUE;
		// 조건을 만족할 때까지 순회, 이전 값과 현재 값을 비교해서 더 큰 값을 max에 재할당
		for(ScoreDTO dto: scores) {		// 리스트 안에 들어있는 데이터만큼
			if (max < dto.getTotal())
				max = dto.getTotal();
		}
		return max;
	}

	public int getMinTotal() {
		List<ScoreDTO> scores = getAllScore();
		if (scores.isEmpty()) 
			return 0;
		int min = Integer.MAX_VALUE;
		for(ScoreDTO dto: scores) {
			if (min > dto.getTotal())
				min = dto.getTotal();
		}
		return min;
	}

	public double getAvgTotal() {
		List<ScoreDTO> scores = getAllScore();
		if (scores.isEmpty())
			return 0.0;
		// 전체 총점의 합 / 학생 수
		int total = 0;
		for(ScoreDTO dto: scores) {
			total += dto.getTotal();
		}
		return (double) total / scores.size();
	}
}

/*
	상수
	한 번 값이 대입되면 절대 바꿀 수 없는 값
	final 키워드 사용
	전부 대문자로 작성. 띄어쓰기의 경우 _로 표기
	MAX_VALUE, PI, DEFAULT_NUM
	
	공용 상수
	여러 곳에서 쓸 수 있도록 public static final로 선언
	객체 생성 없이 클래스 이름으로 바로 접근 가능
	Integer.MIN_VALUE; int형이 가질 수 있는 가장 작은 값(-2의 31승)
	Integer.MAX_VALUE; int형이 가질 수 있는 가장 큰 값(2의 31승)
*/

