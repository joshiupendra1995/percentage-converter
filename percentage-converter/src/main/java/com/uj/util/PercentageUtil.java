package com.uj.util;

import java.math.BigDecimal;

public class PercentageUtil {

	private PercentageUtil() {
	}

	public static BigDecimal convertToPercentage(String input) {
		if (input != null && !input.equals("")) {
			return BigDecimal.valueOf(Double.valueOf(input)).multiply(BigDecimal.valueOf(100));
		}
		return null;
	}

}
