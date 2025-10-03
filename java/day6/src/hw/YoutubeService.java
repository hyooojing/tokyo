package hw;

import java.util.List;

public class YoutubeService {

	private YoutubeDAO dao = new YoutubeDAO();
	
	// 전체 조회
	public List<YoutubeDTO> getAllYoutube() {
		return dao.selectAllYoutube();
	}
}
