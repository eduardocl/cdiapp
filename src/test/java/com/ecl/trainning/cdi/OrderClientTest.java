package com.ecl.trainning.cdi;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

import com.ecl.trainning.cdi.bean.Order;
import com.ecl.trainning.cdi.qualifier.FakeOrder;
import com.ecl.trainning.cdi.qualifier.MyOrder;

@RunWith(DemoiselleRunner.class)
public class OrderClientTest {

	@Inject
	@MyOrder
	Order order;

	@Inject
	@FakeOrder
	Order fakeOrder;

	@Test
	public void testOrder() {
		assertNotNull(order);
		assertEquals("1234", order.getNumber());
		assertEquals("Fast Shop", order.getShopName());
	}

	@Test
	public void testFakeOrder() {
		assertNotNull(fakeOrder);
		assertEquals("00000", fakeOrder.getNumber());
		assertEquals("Fake Shop", fakeOrder.getShopName());

	}

}
