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
        return first.max(second);
    }

    @Override
    public BigDecimal mcm(BigDecimal first, BigDecimal second) {
    	BigDecimal mcm = new BigDecimal(val: 0);
    	
    	BigDecimal maxNum = first.max(second);
    	BigDecimal minNum = first.min(second);
    	mcm = (maxNum.divide(this.mcd(first, second))).multiply(minNum);
        return mcm;
    }
}
