package com.scp.TestMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scp.entity.AddressEntity;
import com.scp.entity.EmployeeEntity;
import com.scp.pojo.EmployeePojo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("crudBean.xml");
		EmployeePojo employeepojo=(EmployeePojo) context.getBean("EmployeePojo");
		
		
		
		
		
		SessionFactory sf=(SessionFactory) context.getBean("SessioNFactory");
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		session.save(mappojotoentity(employeepojo));
		session.flush();
		tran.commit();
		session.close();
		
		
		
		
		
		
		
		
	}

	private static EmployeeEntity mappojotoentity(EmployeePojo employeepojo) {
		
		AddressEntity add= new AddressEntity();
		EmployeeEntity entity=new EmployeeEntity();
		entity.setAge(employeepojo.getAge());
		entity.setId(employeepojo.getId());
		entity.setName(employeepojo.getName());
		add.setId(employeepojo.getAd().getId());
		add.setCity(employeepojo.getAd().getCity());
		add.setPincode(employeepojo.getAd().getPincode());
		entity.setAd(add);
		
		
		
		
		// TODO Auto-generated method stub
		return entity;
	}

}
