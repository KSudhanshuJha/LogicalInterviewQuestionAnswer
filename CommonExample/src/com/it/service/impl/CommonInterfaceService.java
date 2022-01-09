/**
 *  Service class for common calculation
 */
package com.it.service.impl;

import com.it.service.CommonInterface;

/**
 * @author Sudhanshu
 *
 */
public class CommonInterfaceService implements CommonInterface {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public int multiply(int x, int y) {
		return x*y;
	}

	@Override
	public int division(int x, int y) {
		return x/y;
	}

	@Override
	public int remander(int number) {
		return number%2;
	}

	
}
