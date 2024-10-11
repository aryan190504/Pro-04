package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.RoleBean;
import in.co.rays.model.RoleModel;

public class TestRoleModel {

	public static void main(String[] args) throws Exception {

		testAdd();
		// testUpdate();
		// testDelete();
		// testFindByPk();
		// testFindByName();
		// testSearch();
	}

	private static void testAdd() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setName("kiosk");
		bean.setDescription("liosk");
		bean.setCreatedBy("kiosk@gmail.com");
		bean.setModifiedBy("kiosk");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		RoleModel model = new RoleModel();
		model.add(bean);

	}

	private static void testUpdate() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setId(1);
		bean.setName("admin");
		bean.setDescription("admin");
		bean.setCreatedBy("Admin@gmail.com");
		bean.setModifiedBy("admin");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		RoleModel model = new RoleModel();
		model.update(bean);
	}

	private static void testDelete() throws Exception {

		RoleBean bean = new RoleBean();

		bean.setId(1);

		RoleModel model = new RoleModel();

		model.delete(bean);

	}

	private static void testFindByPk() throws Exception {

		RoleBean bean = new RoleBean();

		RoleModel model = new RoleModel();

		bean = model.findByPK(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		}

	}

	private static void testFindByName() throws Exception {

		RoleBean bean = new RoleBean();

		RoleModel model = new RoleModel();

		bean = model.findByName("admin");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getDescription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		}
	}

	private static void testSearch() throws Exception {

		RoleBean bean = new RoleBean();

		RoleModel model = new RoleModel();

		bean.setName("admin");

		List list = model.search(bean, 0, 1);

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
}
