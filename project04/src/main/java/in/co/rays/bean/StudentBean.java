package in.co.rays.bean;

import java.util.Date;

public class StudentBean extends BaseBean {

	private String first_name;
	private String last_name;
	private Date dob;
	private String gernder;
	private String mobile_no;
	private String email;
	private long collage_id;
	private String collage_name;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGernder() {
		return gernder;
	}

	public void setGernder(String gernder) {
		this.gernder = gernder;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCollage_id() {
		return collage_id;
	}

	public void setCollage_id(long collage_id) {
		this.collage_id = collage_id;
	}

	public String getCollage_name() {
		return collage_name;
	}

	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}

}
