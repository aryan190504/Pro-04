package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.RoleBean;
import in.co.rays.model.RoleModel;

public class TestRole {

	public static void main(String[] args) throws Exception {

		// testAdd();

		testUpdate();
		// testDelete();
		// testSearch();
		// testFindById();
		// testFindByName();
	}

	private static void testFindByName() throws Exception {
		RoleBean bean = new RoleBean();
		RoleModel model = new RoleModel();
		bean = model.findByName("Admin");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("Name Already exist.....");
		} else {
			System.out.println("name not found ...");
		}
	}

	private static void testFindById() throws Exception {

		RoleBean bean = new RoleBean();
		RoleModel model = new RoleModel();
		bean = model.findByPK(1);

		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getModifiedDatetime());

			System.out.println("Primary Key Already Exist...");

		} else {
			System.out.println("Primary Key Not found...");
		}

	}

	private static void testSearch() throws Exception {
		RoleBean bean = new RoleBean();

		RoleModel model = new RoleModel();

		bean.setName("Admin");

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (RoleBean) it.next();

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		}

	}

	private static void testDelete() throws Exception {
		RoleBean bean = new RoleBean();
		RoleModel model = new RoleModel();

		bean.setId(1);

		model.delete(bean);
	}

	private static void testUpdate() throws Exception {
		RoleBean bean = new RoleBean();
		RoleModel model = new RoleModel();

		bean.setName("admin");
		bean.setDescription("admin");
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		bean.setId(1);

		model.update(bean);
	}

	private static void testAdd() throws Exception {

		RoleBean bean = new RoleBean();
		RoleModel model = new RoleModel();

		bean.setId(1);
		bean.setName("kiosk");
		bean.setDescription("Admin");
		bean.setCreatedBy("abc@gmail.com");
		bean.setModifiedBy("xyz@gmail.com");
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		model.add(bean);

	}

}