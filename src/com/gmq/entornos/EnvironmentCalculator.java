package com.gmq.entornos;

import java.math.BigDecimal;

public class EnvironmentCalculator implements Calculator {

	@Override
	public BigDecimal sum(BigDecimal firstSummand, BigDecimal secondSummand) {
		return firstSummand.add(secondSummand);
	}

	@Override
	public BigDecimal substract(BigDecimal minuend, BigDecimal subtrahend) {
		return minuend.subtract(subtrahend);
	}

	@Override
	public BigDecimal multiply(BigDecimal multiplicand, BigDecimal multiplier) {
		return multiplicand.multiply(multiplier);
	}

	@Override
	public BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
		return dividend.divide(divisor);
	}

	@Override
	public BigDecimal mcd(BigDecimal first, BigDecimal second) {

		BigDecimal maxNum = first.max(second);
		BigDecimal minNum = second.min(first);
		BigDecimal mcd = new BigDecimal(0);

		do {
			mcd = minNum;
			minNum = maxNum.remainder(minNum);
			maxNum = mcd;
		} while (minNum.compareTo(BigDecimal.ZERO) != 0);
		return mcd;
	}

	@Override
	public BigDecimal mcm(BigDecimal first, BigDecimal second) {
		BigDecimal mcm = new BigDecimal(0);

		BigDecimal maxNum = first.max(second);
		BigDecimal minNum = first.min(second);
		mcm = (maxNum.divide(this.mcd(first, second))).multiply(minNum);
		return mcm;
	}
}
