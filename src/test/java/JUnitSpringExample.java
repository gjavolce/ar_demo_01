/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author expert
 */


import org.hibernate.SessionFactory;
import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
//@ComponentScan("com.incogro.books3")
public class JUnitSpringExample {

//    @Configuration
//    static class AccountServiceTestContextConfiguration {
//
//        @Bean
//        public CustomerService customerService() {
//            return new CustomerService();
//        }
//
//        @Bean
//        public CustomerDAO customerDAO() {
//            return new CustomerDAO();
//        }
//
//        
//
//    }
//
//    @Autowired
//    private CustomerService customerService;
//    @Autowired
//    private CustomerDAO customerDAO;
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Test
//    public void testSampleService() {
//        assertEquals(
//                "class com.incogro.books3.service.CustomerService",
//                this.customerService.getClass().toString());
//    }
//    
//    //@Test
//    public void testSampleService2() {
//        assertTrue(customerService.getTrue());
//    }
    
//    @Test
//    public void testSampleService3() {
//        Customer c = new Customer();
//        
//        c.setId(25);
//        c.setName("test1");
//        c.setSurname("test2");
//        
//        customerService.addCustomer(c);
//        
//    }
//
//	@Test
//	public void testSampleServiceGetAccountDescription() {
//		// Check if the return description has a Description: string.
//		assertTrue(sampleService.getOrderDescription().contains("Description:"));
//	}
//
//	@Test
//	public void testSampleServiceGetAccountCode() {
//		// Check if the return description has a Code: string.
//		assertTrue(sampleService.getOrderStringCode().contains("Code:"));
//	}
//
//	@Test
//	public void testSampleServiceCreateNewOrder() {
//		Order newOrder = new Order();
//		newOrder.setSecurityCode("XYZ");
//		newOrder.setDescription("Description");
//		if (newOrder != null) {
//			assertThat(sampleService.createOrder(newOrder),
//					instanceOf(Order.class));
//			assertNotNull("Security isn't null", newOrder.getSecurityCode());
//			assertNotNull("Description isn't not null",
//					newOrder.getDescription());
//		}
//
//		assertNotNull("New Order is not null", newOrder);
//
//	}

//	@Test
//	public void testSampleServiceGetOrder() {
//
//		Order existingOrder = sampleService.getOrder(0);
//
//		if (existingOrder != null) {
//			assertThat(sampleService.getOrder(0), instanceOf(Order.class));
//			assertNotNull("Security isn't null",
//					existingOrder.getSecurityCode());
//			assertNotNull("Description isn't null",
//					existingOrder.getDescription());
//		}
//
//		assertNotNull("Object is not null", existingOrder);
//	}
}
