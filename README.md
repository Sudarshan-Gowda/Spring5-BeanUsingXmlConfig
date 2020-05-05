# Spring5-BeanUsingXmlConfig
Spring bean XML configuration example

This repo will demonstrate the creation of spring beans and populate application context in any spring application. This example uses xml configuration to define beans.

### Bean Registartion in xml file

    <bean id="technologyDetails"
		class="com.star.sud.bean.TechnologyDetails"></bean>

### Accessing the bean though ApplicationContext

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TechnologyDetails technologyDetails = context.getBean(TechnologyDetails.class);


