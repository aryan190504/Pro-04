
package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.CollegeBean;
import in.co.rays.bean.CourseBean;
import in.co.rays.bean.SubjectBean;
import in.co.rays.bean.TimetableBean;
import in.co.rays.util.JDBCDataSource;

public class TimetableModel {
	public int nextPk() throws Exception {

		int pk = 0;

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select max(id) from st_timetable");

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

			System.out.println("max id = " + pk);

		}
		return pk + 1;

	}

	public void add(TimetableBean bean) throws Exception {

		TimetableBean existBean = findByPk(bean.getId());

		if (existBean != null) {
			throw new Exception("roll_no already exist");
		}
		CourseModel courseModel = new CourseModel();
		CourseBean courseBean = courseModel.findByPk(bean.getCourse_id());

		bean.setCourse_name(courseBean.getName());

		SubjectModel subjectModel = new SubjectModel();
		SubjectBean subjectBean = subjectModel.findByPk(bean.getSubject_id());

		bean.setSubject_name(subjectBean.getName());

		System.out.println("CollegeBean: " + courseBean);
		System.out.println("College Name: " + courseBean.getName());
		
		System.out.println("SubjectBean: " + subjectBean);
		System.out.println("Subject Name: " + subjectBean.getName());

		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("insert into st_timetable values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
		int pk = nextPk();

		pstmt.setLong(1, pk);
		pstmt.setString(2, bean.getSemester());
		pstmt.setString(3, bean.getDescription());
		pstmt.setDate(4, new java.sql.Date(bean.getExam_date().getTime()));
		pstmt.setString(5, bean.getExam_time());
		pstmt.setLong(6, bean.getCourse_id());
		pstmt.setString(7, bean.getCourse_name());
		pstmt.setLong(8, bean.getSubject_id());
		pstmt.setString(9, bean.getSubject_name());
		pstmt.setString(10, bean.getCreatedBy());
		pstmt.setString(11, bean.getModifiedBy());
		pstmt.setTimestamp(12, bean.getCreatedDatetime());
		pstmt.setTimestamp(13, bean.getModifiedDatetime());

		int i = pstmt.executeUpdate();

		System.out.println("Data Inserted  Successfully !!!" + i);

	}

	public void update(TimetableBean bean) throws Exception {

		TimetableBean existBean = findByPk(bean.getId());

		if (existBean != null && bean.getId() != existBean.getId()) {
			throw new Exception("Data updated successfully...");
		}

		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(
				"update st_timetable semester = ?,description = ?,exam_date = ?,exam_time = ?,course_id = ?, course_name = ?, subject_id = ?, subject_name = ?,created_by = ?, modified_by = ?, created_datetime = ?, modified_datetime = ? where id = ?");

		pstmt.setString(1, bean.getSemester());
		pstmt.setString(2, bean.getDescription());
		pstmt.setDate(3, new java.sql.Date(bean.getExam_date().getTime()));
		pstmt.setString(4, bean.getExam_time());
		pstmt.setLong(5, bean.getCourse_id());
		pstmt.setString(6, bean.getCourse_name());
		pstmt.setLong(7, bean.getSubject_id());
		pstmt.setString(8, bean.getSubject_name());
		pstmt.setString(9, bean.getCreatedBy());
		pstmt.setString(10, bean.getModifiedBy());
		pstmt.setTimestamp(11, bean.getCreatedDatetime());
		pstmt.setTimestamp(12, bean.getModifiedDatetime());
		pstmt.setLong(13, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println("Data Updated Successfully..." + i);

	}

	public void delete(TimetableBean bean) throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("delete from st_timetable where id = ?");

		pstmt.setLong(1, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println("Data Deleted Successfully..." + i);
	}

	public List search(TimetableBean bean) throws Exception {

		Connection conn = JDBCDataSource.getConnection();
		StringBuffer sql = new StringBuffer("select * from st_timetable where 1=1");

		if (bean != null) {
			if (bean.getSemester() != null && bean.getSemester().length() > 0) {
				sql.append(" and semester like '" + bean.getSemester() + "'");

			}
		}
		System.out.println(sql.toString());

		PreparedStatement pstmt = conn.prepareStatement(sql.toString());

		ResultSet rs = pstmt.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {

			bean = new TimetableBean();

			bean.setId(rs.getLong(1));
			bean.setSemester(rs.getString(2));
			bean.setDescription(rs.getString(3));
			bean.setExam_date(rs.getDate(4));
			bean.setExam_time(rs.getString(5));
			bean.setCourse_id(rs.getLong(6));
			bean.setCourse_name(rs.getString(7));
			bean.setSubject_id(rs.getLong(8));
			bean.setSubject_name(rs.getString(9));
			bean.setCreatedBy(rs.getString(10));
			bean.setModifiedBy(rs.getString(11));
			bean.setCreatedDatetime(rs.getTimestamp(12));
			bean.setModifiedDatetime(rs.getTimestamp(13));
			
			list.add(bean);
		}

		return list;

	}

	public TimetableBean findByPk(long id) throws Exception {
		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from st_timetable where id = ?");
		pstmt.setLong(1, id);

		ResultSet rs = pstmt.executeQuery();

		TimetableBean bean = null; // Initialize the bean to null

		if (rs.next()) {
			bean = new TimetableBean(); // Create a new instance of UserBean when data is found
			
			bean.setId(rs.getLong(1));
			bean.setSemester(rs.getString(2));
			bean.setDescription(rs.getString(3));
			bean.setExam_date(rs.getDate(4));
			bean.setExam_time(rs.getString(5));
			bean.setCourse_id(rs.getLong(6));
			bean.setCourse_name(rs.getString(7));
			bean.setSubject_id(rs.getLong(8));
			bean.setSubject_name(rs.getString(9));
			bean.setCreatedBy(rs.getString(10));
			bean.setModifiedBy(rs.getString(11));
			bean.setCreatedDatetime(rs.getTimestamp(12));
			bean.setModifiedDatetime(rs.getTimestamp(13));
		}

		JDBCDataSource.closeConnection(conn);

		return bean; // Returns null if no record is found, otherwise returns the bean
	}

	public TimetableBean findBySemester(String semester) throws Exception {

		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from st_timetable where semester = ?");

		pstmt.setString(1, semester);

		ResultSet rs = pstmt.executeQuery();

		TimetableBean bean = null;

		while (rs.next()) {
			bean = new TimetableBean(); // Create a new instance of UserBean when data is found
		
			bean.setId(rs.getLong(1));
			bean.setSemester(rs.getString(2));
			bean.setDescription(rs.getString(3));
			bean.setExam_date(rs.getDate(4));
			bean.setExam_time(rs.getString(5));
			bean.setCourse_id(rs.getLong(6));
			bean.setCourse_name(rs.getString(7));
			bean.setSubject_id(rs.getLong(8));
			bean.setSubject_name(rs.getString(9));
			bean.setCreatedBy(rs.getString(10));
			bean.setModifiedBy(rs.getString(11));
			bean.setCreatedDatetime(rs.getTimestamp(12));
			bean.setModifiedDatetime(rs.getTimestamp(13));
		}

		JDBCDataSource.closeConnection(conn);

		return bean;
	}
}
