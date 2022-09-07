package kr.or.iei.photo.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import kr.or.iei.photo.model.dao.PhotoDao;

public class PhotoService {
	private PhotoDao dao;

	public PhotoService() {
		super();
		dao = new PhotoDao();
	}

	public PhotoService(PhotoDao dao) {
		super();
		this.dao = dao;
	}

	public int totalCount() {
		Connection conn = JDBCTemplate.getConnection();
		int totalCount = dao.totalCount(conn);
		JDBCTemplate.close(conn);
		return totalCount;
	}

}
