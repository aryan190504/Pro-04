package in.co.rays.bean;

import java.util.Date;

public class TimetableBean extends BaseBean {

	private String semester;
	private String description;
	private Date exam_date;
	private String exam_time;
	private long course_id;
	private String course_name;
	private long subject_id;
	private String subject_name;

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getExam_date() {
		return exam_date;
	}

	public void setExam_date(Date exam_date) {
		this.exam_date = exam_date;
	}

	public String getExam_time() {
		return exam_time;
	}

	public void setExam_time(String exam_time) {
		this.exam_time = exam_time;
	}

	public long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(long l) {
		this.course_id = l;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public long getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(long l) {
		this.subject_id = l;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

}
