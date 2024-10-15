package in.co.rays.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.FacultyBean;
import in.co.rays.model.FacultyModel;

public class TestFaculty {

	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		// testDelete();
		 //testSearch();
		// testfindByPk();
		 testfindByEmail();
	}

	private static void testfindByEmail() throws Exception {

		FacultyBean bean = new FacultyBean();

		FacultyModel model = new FacultyModel();

		bean = model.findByEmail("ram@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getDob());
			System.out.println(bean.getGender());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getCourseId());
			System.out.println(bean.getCourseName());
			System.out.println(bean.getSubjectId());
			System.out.println(bean.getSubjectName());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("login id already exist");

		} else {

			System.out.println("login id not exist");

		}
	}

	private static void testfindByPk() throws Exception {
		FacultyBean bean = new FacultyBean();

		FacultyModel model = new FacultyModel();

		bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getDob());
			System.out.println(bean.getGender());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getCourseId());
			System.out.println(bean.getCourseName());
			System.out.println(bean.getSubjectId());
			System.out.println(bean.getSubjectName());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getModifiedDatetime());
			System.out.println(bean.getCreatedDatetime());
			System.out.println("Pk Already Exist");

		} else {

			System.out.println("Pk Not Exist");

		}
	}

	private static void testSearch() throws Exception {
		FacultyBean bean = new FacultyBean();

		FacultyModel model = new FacultyModel();

		bean.setLast_name("sharma");
		
		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (FacultyBean) it.next();

			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getDob());
			System.out.println(bean.getGender());
			System.out.println(bean.getMobileNo());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollegeId());
			System.out.println(bean.getCollegeName());
			System.out.println(bean.getCourseId());
			System.out.println(bean.getCourseName());
			System.out.println(bean.getSubjectId());
			System.out.println(bean.getSubjectName());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getModifiedDatetime());
			System.out.println(bean.getCreatedDatetime());

		}
	}

	private static void testDelete() throws Exception {
		FacultyBean bean = new FacultyBean();
		FacultyModel model = new FacultyModel();

		bean.setId(1);
		model.delete(bean);
	}

	private static void testUpdate() throws Exception {
		FacultyBean bean = new FacultyBean();
		FacultyModel model = new FacultyModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bean.setId(1);
		bean.setFirst_name("ram");
		bean.setLast_name("sharma");
		bean.setDob(sdf.parse("1998-11-05"));
		bean.setGender("male");
		bean.setMobileNo("9696332545");
		bean.setEmail("ram@gmail.com");
		bean.setCollegeId(1);
		bean.setCollegeName("medicaps");
		bean.setCourseId(1);
		bean.setCourseName("b_tech cs");
		bean.setSubjectId(1);
		bean.setSubjectName("java");
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.update(bean);

	}

	private static void testAdd() throws Exception {

		FacultyBean bean = new FacultyBean();
		FacultyModel model = new FacultyModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirst_name("ram");
		bean.setLast_name("sharma");
		bean.setDob(sdf.parse("1998-10-05"));
		bean.setGender("male");
		bean.setMobileNo("9696332545");
		bean.setEmail("ram@gmail.com");
		bean.setCollegeId(1);
		bean.setCourseId(1);
		bean.setSubjectId(1);
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

}