package hw;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ch1.DBUtill;

public class YoutubeDAO {

	public List<YoutubeDTO> selectAllYoutube() {
		List<YoutubeDTO> list = new ArrayList<>();
		String sql = "select * from youtube";
		
		try(Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String channel = rs.getString("channel");
				int views = rs.getInt("views");
				int likes = rs.getInt("likes");
				Date upload_date = rs.getDate("upload_date");
				
				YoutubeDTO dto = new YoutubeDTO(id, title, upload_date, channel, views, likes);
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("전체 조회 오류: " + e.getMessage());
		}
		
		return list;
	}
}
