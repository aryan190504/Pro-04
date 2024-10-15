package in.co.rays.bean;

import java.math.BigInteger;

public class MarksheetBean extends BaseBean {

	private String roll_no;
	private long student_id;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long l) {
		this.student_id = l;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

}
