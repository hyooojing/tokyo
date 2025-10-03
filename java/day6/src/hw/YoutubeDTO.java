package hw;

import java.sql.Date;
import java.text.NumberFormat;
import java.util.Locale;

public class YoutubeDTO {

	private int id;
	private String title;
	private Date upload_date;
	private String channel;
	private int views;
	private int likes;
	
	public YoutubeDTO() {}

	public YoutubeDTO(String title, Date upload_date, String channel, int views, int likes) {
		super();
		this.title = title;
		this.upload_date = upload_date;
		this.channel = channel;
		this.views = views;
		this.likes = likes;
	}

	public YoutubeDTO(int id, String title, Date upload_date, String channel, int views, int likes) {
		super();
		this.id = id;
		this.title = title;
		this.upload_date = upload_date;
		this.channel = channel;
		this.views = views;
		this.likes = likes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUpload_date() {
		return upload_date;
	}

	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
	    NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA);
	    String viewsStr = nf.format(views);
	    String likesStr = nf.format(likes);

	    return String.format("[%d] : %-20s | 조회수 %8s | 좋아요 %7s | 채널명 %-8s | %s",
	            id, title, viewsStr, likesStr, channel, upload_date);
	}
	
	
	
}
