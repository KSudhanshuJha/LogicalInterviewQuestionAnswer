/**
 * 
 */
package com.it.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.it.service.impl.CommonInterfaceService;

/**
 * @author Sudhanshu
 *
 */
public class CommonTestCase {
	
	static Logger logger=Logger.getLogger("CommonTestCase.class");
	
	private CommonInterfaceService commonInterface=new CommonInterfaceService();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass(){
		logger.info("Before All...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() {
		logger.info("After All...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp(){
		logger.info("Before Each...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown(){
		logger.info("After Each...");
	}

	@Test
	public void testAdd() {
		logger.info("Start testAdd() in CommonTestCase");
		int rsult=commonInterface.add(10, 20);
		logger.info("End testAdd() in CommonTestCase");
		assertEquals(30, rsult);
	}
	
	@Test
	public void testSubstraction() {
		logger.info("Start testSubstraction() in CommonTestCase");
		int rsult=commonInterface.sub(30, 20);
		logger.info("End testSubstraction() in CommonTestCase");
		assertEquals(10, rsult);
	}
	
	@Test
	public void testMultiply() {
		logger.info("Start testMultiply() in CommonTestCase");
		int rsult=commonInterface.multiply(10, 30);
		logger.info("End testMultiply() in CommonTestCase");
		assertEquals(300, rsult);
	}
	
	@Test
	public void testDivision() {
		logger.info("Start testDivision() in CommonTestCase");
		int rsult=commonInterface.division(40, 20);
		logger.info("End testDivision() in CommonTestCase");
		assertEquals(2, rsult);
	}
	
	@Test
	public void testRemainder() {
		logger.info("Start testRemainder() in CommonTestCase");
		int rsult=commonInterface.remander(10);
		logger.info("End testRemainder() in CommonTestCase");
		assertEquals(0, rsult);
	}

}
