package com.ecl.trainning.cdi;

import javax.inject.Inject;

//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ArchivePaths;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.ByteArrayAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.bean.OrderImpl;
import com.ecl.trainning.cdi.decorator.OrderDecorator;
import com.ecl.trainning.cdi.producer.OrderProducer;
import com.ecl.trainning.cdi.qualifier.MyOrder;

//@RunWith(Arquillian.class)
public class DecoratorTest {
	
//	@Deployment
//	public static JavaArchive createDeployment() {
//		
//		StringBuffer xml = new StringBuffer();
//		
//		xml.append("<decorators>" +
//		            "<class>" 	 +
//				       "com.ecl.trainning.cdi.decorator.OrderDecorator" +
//		 			"</class>" +
//		 			"</decorators>");
//		
//		ByteArrayAsset beanXml = new ByteArrayAsset(xml.toString().getBytes());
//		
//		return ShrinkWrap.
//				create(JavaArchive.class)
//				.addClass(Order.class)
//				.addClass(OrderImpl.class)
//				.addClass(MyOrder.class)
//				.addClass(OrderDecorator.class)
//				.addClass(OrderProducer.class)
//				.addAsManifestResource(beanXml, ArchivePaths.create("beans.xml"));
//						  
//	}

	@Inject @MyOrder Order order;
	
	@Test
	public void testDecorator() {
		System.out.println(order.getShopName());
	}
	
	
}
