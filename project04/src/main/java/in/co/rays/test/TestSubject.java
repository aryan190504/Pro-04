package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.SubjectBean;
import in.co.rays.model.SubjectModel;

public class TestSubject {

	public static void main(String[] args) throws Exception {

		testAdd();
	//	testUpdate();
		//testDelete();
		//testSearch();
		//testfindByPk();
		//testfindByRoll_no();

	}

	private static void testfindByRoll_no() throws Exception {

		SubjectBean bean = new SubjectBean();
		SubjectModel model = new SubjectModel();

		bean = model.findByRoll_no("va101");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getCourse_id());
			System.out.println(bean.getCourse_name());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			
			System.out.println("RollNo found");
		} else {
			System.out.println("RollNo dosent exist");
		}
	}

	private static void testfindByPk() throws Exception {

		SubjectBean bean = new SubjectBean();
		SubjectModel model = new SubjectModel();

		bean = model.findByPk(1);

		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getCourse_id());
			System.out.println(bean.getCourse_name());
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

		SubjectBean bean = new SubjectBean();
		SubjectModel model = new SubjectModel();

		bean.setName("java");

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (SubjectBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getCourse_id());
			System.out.println(bean.getCourse_name());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		}

	}

	private static void testDelete() throws Exception {
		SubjectBean bean = new SubjectBean();
		SubjectModel model = new SubjectModel();
		bean.setId(1);

		model.delete(bean);

	}

	private static void testUpdate() throws Exception {

		SubjectBean bean = new SubjectBean();
		SubjectModel model = new SubjectModel();
		
		bean.setId(1);
		bean.setName("java");
		bean.setCourse_id(1);
		bean.setDescription("java");
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.update(bean);
	}

	private static void testAdd() throws Exception {
		SubjectBean bean = new SubjectBean();
		SubjectModel model = new SubjectModel();

		bean.setName("java");
		bean.setCourse_id(1);
		bean.setDescription("java");
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}
}