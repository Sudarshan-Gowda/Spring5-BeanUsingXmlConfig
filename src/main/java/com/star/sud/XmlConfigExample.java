package com.star.sud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.star.sud.bean.TechnologyDetails;

public class XmlConfigExample {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TechnologyDetails technologyDetails = context.getBean(TechnologyDetails.class);
		System.out.println(technologyDetails);
		context.close();
	}

}
