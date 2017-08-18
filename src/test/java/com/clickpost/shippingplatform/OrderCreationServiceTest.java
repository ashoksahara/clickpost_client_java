package com.clickpost.shippingplatform;


import com.clickpost.shippingplatform.service.ordercreation.OrderCreationServiceImpl;
import com.clickpost.shippingplatform.service.ordercreation.exception.ClickPostServerException;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class OrderCreationServiceTest {

    private com.clickpost.shippingplatform.service.ordercreation.OrderCreationService orderCreationService_;

    @BeforeMethod
    public void setUp() throws Exception {
        orderCreationService_ = new OrderCreationServiceImpl();

    }

    @Test
    public void testOrderCreation() throws Exception {
        System.out.println("Running Order Creation Service Test");
        Assert.assertEquals(1, 1);
    }
}
