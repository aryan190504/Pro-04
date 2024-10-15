package in.co.rays.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.mchange.v2.c3p0.impl.NewProxyDatabaseMetaData;

import in.co.rays.bean.BaseBean;
import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		/*
		 * testAdd(); testUpdate(); testDelete();
		 * 
		 * testSearch();
		 */

		// testfindByPk();
		testfindByRoll_no();

	}

	private static void testfindByRoll_no() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();

		bean = model.findByRoll_no("va101");

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRoll_no());
			System.out.println(bean.getStudent_id());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
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

		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();

		bean = model.findByPk(1);

		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getRoll_no());
			System.out.println(bean.getStudent_id());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
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

		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();

		bean.setName("sushobhit pandey");

		List list = model.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getRoll_no());
			System.out.println(bean.getStudent_id());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		}

	}

	private static void testDelete() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();
		bean.setId(1);

		model.delete(bean);

	}

	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();
		bean.setId(1);
		bean.setRoll_no("va101");
		bean.setStudent_id(1);
		bean.setPhysics(76);
		bean.setChemistry(89);
		bean.setMaths(69);
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.update(bean);
	}

	private static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();

		bean.setRoll_no("va101");
		bean.setStudent_id(1);
		bean.setPhysics(67);
		bean.setChemistry(89);
		bean.setMaths(69);
		bean.setCreatedBy("admin@gmail.com");
		bean.setModifiedBy("admin@gmail.com");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		model.add(bean);

	}

}