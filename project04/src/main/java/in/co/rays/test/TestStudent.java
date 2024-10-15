package in.co.rays.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.StudentBean;
import in.co.rays.bean.UserBean;
import in.co.rays.model.StudentModel;
import in.co.rays.model.UserModel;

public class TestStudent {

	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		// testDelete();
		// testSearch();
		//testfindByPk();
		testfindByEmail();
	}

	private static void testfindByEmail() throws Exception {
		
		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		bean = model.findByEmail("sushobhit@gmail.com");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getDob());
			System.out.println(bean.getGernder());
			System.out.println(bean.getMobile_no());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollage_id());
			System.out.println(bean.getCollage_name());
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
		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getDob());
			System.out.println(bean.getGernder());
			System.out.println(bean.getMobile_no());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollage_id());
			System.out.println(bean.getCollage_name());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("Pk Already Exist");

		} else {

			System.out.println("Pk Not Exist");

		}
	}

	private static void testSearch() throws Exception {
		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		bean.setFirst_name("sushobhit");

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (StudentBean) it.next();

			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getDob());
			System.out.println(bean.getGernder());
			System.out.println(bean.getMobile_no());
			System.out.println(bean.getEmail());
			System.out.println(bean.getCollage_id());
			System.out.println(bean.getCollage_name());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		}
	}

	private static void testDelete() throws Exception {
		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();

		bean.setId(1);
		model.delete(bean);
	}

	private static void testAdd() throws Exception {

		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirst_name("sushobhit");
		bean.setLast_name("pandey");
		bean.setDob(sdf.parse("2000-02-05"));
		bean.setGernder("male");
		bean.setMobile_no("7000201952");
		bean.setEmail("sushobhit@gmail.com");
		bean.setCollage_id((long) 1);
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

	private static void testUpdate() throws Exception {
		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setFirst_name("sushobhit");
		bean.setLast_name("pandey");
		bean.setDob(sdf.parse("2000-02-05"));
		bean.setGernder("male");
		bean.setMobile_no("7000201952");
		bean.setEmail("sushobhit@gmail.com");
		bean.setCollage_id((long) 1);
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.update(bean);

	}
}