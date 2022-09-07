package kr.or.iei.photo.model.vo;

public class Photo {
	private int PhotoNo;
	private String PhotoWriter;
	private String PhotoTitle;
	private String PhotoContent;
	private String filepath;

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Photo(int photoNo, String photoWriter, String photoTitle, String photoContent, String filepath) {
		super();
		PhotoNo = photoNo;
		PhotoWriter = photoWriter;
		PhotoTitle = photoTitle;
		PhotoContent = photoContent;
		this.filepath = filepath;
	}

	public int getPhotoNo() {
		return PhotoNo;
	}

	public void setPhotoNo(int photoNo) {
		PhotoNo = photoNo;
	}

	public String getPhotoWriter() {
		return PhotoWriter;
	}

	public void setPhotoWriter(String photoWriter) {
		PhotoWriter = photoWriter;
	}

	public String getPhotoTitle() {
		return PhotoTitle;
	}

	public void setPhotoTitle(String photoTitle) {
		PhotoTitle = photoTitle;
	}

	public String getPhotoContent() {
		return PhotoContent;
	}

	public void setPhotoContent(String photoContent) {
		PhotoContent = photoContent;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
