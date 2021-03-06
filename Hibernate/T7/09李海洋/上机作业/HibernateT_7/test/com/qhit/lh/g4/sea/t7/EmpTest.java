/**
 * 
 */
package com.qhit.lh.g4.sea.t7;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.qhit.lh.g4.sea.t7.bean.Dept;
import com.qhit.lh.g4.sea.t7.bean.Emp;
import com.qhit.lh.g4.sea.t7.service.BaseService;
import com.qhit.lh.g4.sea.t7.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.sea.t7.utils.HibernateSessionFactory;

/**
 * @author 李海洋
 *TODO
 *2017年12月16日下午2:02:11
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	private Emp emp;
	private List<Emp> emplist;
	private List<Dept> deptlist;
	@Test
	//基本查询
	public void getByName() {
		String hql = "select e from Emp e where e.ename like ? ";
		
		Query query = baseService.getByName(hql);
		query.setString(0, "%S%");
		
		emplist = query.list();
		for (Emp e : emplist) {
			System.out.println(e.getEid()+":"+e.getEname());
		}
	}
	@Test
	//实例化查询
	public void getEmp1() {
		String hql = "select new Emp(e.ename,e.esex,e.ebirth) from Emp e where e.ename like ? ";
		
		Query query = baseService.getByName(hql);
		query.setString(0, "小%");
		
		emplist = query.list();
		for (Emp e : emplist) {
			System.out.println(e);
		}
	}
	@Test
	//连接查询
	public void getEmp2() {
		String hql = "select d from Dept d join d.emps where d.dname = '董事会' ";
		
		deptlist = baseService.getObjects(hql);
		for (Dept d : deptlist) {
			System.out.println(d.getDid()+":"+d.getDname()+"  "+d.getDadress());
			System.out.println("部门下的员工有：");
			for (Object o : d.getEmps()) {
				System.out.println(o);
			}
		}
	}
	@Test
	//统计查询
	public void getEmp3() {
		String hql = "select d.dname, count(e) from Dept d left join d.emps e group by d.dname ";
		
		List<Object[]> list = baseService.getObjects(hql);
		
		for (Object[] o : list) {
			System.out.println(o[0]+"  人数："+o[1]);
		}
	}
	@Test
	//子查询
	public void getEmp4() {
		String hql = "select e from Emp e where e.dept = (select d from Dept d where d.dname = '保卫科')";
		
		emplist = baseService.getObjects(hql);
		
		for (Emp e : emplist) {
			System.out.println(e);
		}
	}
	@Test
	//子查询
	public void getEmp5() {
		String hql = "select d from Dept d where exists (select e from Emp e where e.dept = d)";
		
		deptlist = baseService.getObjects(hql);
		
		for (Dept d : deptlist) {
			System.out.println(d.getDid()+":"+d.getDname()+"  "+d.getDadress());
		}
	}
	@Test
	//多态查询
	public void getEmp6() {
		String hql = "select o from java.lang.Object o ";
		
		List<Object> list = baseService.getObjects(hql);
		
		for (Object o : list) {
			System.out.println(o);
		}
	}
}