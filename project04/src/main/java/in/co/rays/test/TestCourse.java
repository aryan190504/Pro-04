package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.CourseBean;
import in.co.rays.bean.CourseBean;
import in.co.rays.bean.StudentBean;
import in.co.rays.model.CourseModel;
import in.co.rays.model.CourseModel;

public class TestCourse {

	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		// testDelete();
		// testSearch();
		// testfindByPk();
		// testfindByName();

	}

	private static void testfindByName() throws Exception {

		CourseBean bean = new CourseBean();
		CourseModel model = new CourseModel();

		bean = model.findByName("b_tech cs");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDuration());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("Name found ");
		} else {
			System.out.println("Name dosent exist");
		}
	}

	private static void testfindByPk() throws Exception {

		CourseBean bean = new CourseBean();
		CourseModel model = new CourseModel();

		bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDuration());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("Pk found");
		} else {
			System.out.println("Pk not exist");
		}
	}

	private static void testSearch() throws Exception {

		CourseBean bean = new CourseBean();
		CourseModel model = new CourseModel();

		bean.setName("b_tech cs");

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (CourseBean) it.next();

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDuration());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		}

	}

	private static void testDelete() throws Exception {
		CourseBean bean = new CourseBean();
		CourseModel model = new CourseModel();
		bean.setId(1);

		model.delete(bean);

	}

	private static void testUpdate() throws Exception {

		CourseBean bean = new CourseBean();
		CourseModel model = new CourseModel();
		bean.setId(1);
		bean.setName("b_tech cs");
		bean.setDuration("4 yerss");
		bean.setDescription("b_tech");
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.update(bean);
	}

	private static void testAdd() throws Exception {
		CourseBean bean = new CourseBean();
		CourseModel model = new CourseModel();

		bean.setName("b_tech");
		bean.setDuration("4 yerss");
		bean.setDescription("b_tech");
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

}