package hw;

import java.util.List;
import java.util.Scanner;

public class YoutubeController {

	Scanner sc = new Scanner(System.in);
	
	private YoutubeService service = new YoutubeService();
	public void run() {
		while(true) {
			System.out.println("\n1. 유튜브 등록 | 2. 전체 조회 | 3. 개별 조회 | 4. 수정 | 5. 삭제 | 0. 종료");
			int q = sc.nextInt();
			switch(q) {
			case 1:
				break;
			case 2:
				viewAllYoutube();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			default:
				System.out.println("정해진 숫자만 입력하세요.");
				break;
			}
		}
	}
	
	// 전체 조회
	private void viewAllYoutube() {
		List<YoutubeDTO> list = service.getAllYoutube();
		outYoutubeList(list);
		
	}

	// 출력
	private void outYoutubeList(List<YoutubeDTO> list) {
		if (list == null || list.isEmpty()) {
			System.out.println("등록된 영상이 없습니다.");
		} else {
			for (YoutubeDTO dto : list) {
				System.out.println(dto);
			}
		}
		
	}
}
