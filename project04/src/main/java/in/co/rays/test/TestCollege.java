
package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.TextSyntax;

import in.co.rays.bean.CollegeBean;
import in.co.rays.bean.UserBean;
import in.co.rays.model.CollegeModel;
import in.co.rays.model.UserModel;

public class TestCollege {

	public static void main(String[] args) throws Exception {

		// testAdd();
	//	 testUpdate();
	//	testDelete();
	//	 testSearch();
		// testfindByPk();
		testfindByNmae();
	}

	private static void testfindByNmae() throws Exception {
		CollegeModel model = new CollegeModel();
		CollegeBean bean = new CollegeBean();
		bean = model.findByName("medicaps");
		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getState());
			System.out.println(bean.getCity());
			System.out.println(bean.getPhone_no());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("name already exist");
		} else {
			System.out.println("name dont exist");
		}
	}

	private static void testfindByPk() throws Exception {
		CollegeModel model = new CollegeModel();
		CollegeBean bean = new CollegeBean();
		bean = model.findByPk(1);
		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getState());
			System.out.println(bean.getCity());
			System.out.println(bean.getPhone_no());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
			System.out.println("login id already exist");
		} else {
			System.out.println("login id not exist");
		}

	}

	private static void testSearch() throws Exception {
		CollegeBean bean = new CollegeBean();

		CollegeModel model = new CollegeModel();

		bean.setName("medicaps");

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (CollegeBean) it.next();

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getState());
			System.out.println(bean.getCity());
			System.out.println(bean.getPhone_no());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		}
	}

	private static void testDelete() throws Exception {
		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();
		bean.setId(1);
		model.delete(bean);
	}

	private static void testUpdate() throws Exception {

		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();

		bean.setId(1);
		bean.setName("medicaps");
		bean.setAddress("indore");
		bean.setState("madhya pradesh");
		bean.setCity("indore");
		bean.setPhone_no("7648880017");
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.update(bean);
	}

	private static void testAdd() throws Exception {
		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();

		bean.setName("medicaps");
		bean.setAddress("rau");
		bean.setState("madhya pradesh");
		bean.setCity("indore");
		bean.setPhone_no("7648880017");
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

}
