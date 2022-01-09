/**
 * 
 */
package com.it.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import comit.singleton.EagerSingletonExple;

/**
 * @author prash
 *
 */
class SingletonTest {
	
	static Logger logger=Logger.getLogger("SingletonTest");
	private  EagerSingletonExple eagerSingletonExple=null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() {
		logger.log(Level.SEVERE,"Something Wrong:{0}","setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() {
		logger.log(Level.SEVERE,"something Wrong: {0}","tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() {
		logger.log(Level.SEVERE,"something Wrong:{0}","setUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() {
		logger.log(Level.SEVERE,"something Wrong:{0}","tearDown");
	}

	@SuppressWarnings("static-access")
	@Test
	void test() {
		assertEquals(null, eagerSingletonExple.getSingleObject());
		fail("Not yet implemented");
	}

}
