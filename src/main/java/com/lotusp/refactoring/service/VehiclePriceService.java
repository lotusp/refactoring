package com.lotusp.refactoring.service;

import java.util.Arrays;

public class VehiclePriceService {

    public double calculateTotalVehiclePrice(double vehicleMsrp,
                                             double paintPrice,
                                             double trimPrice,
                                             String optionalOptionPrices) {
        double optionalOptionPrice = calculateOptionalOptionPrice(optionalOptionPrices);
        return vehicleMsrp + paintPrice + trimPrice + optionalOptionPrice;
    }

    private double calculateOptionalOptionPrice(String optionalOptionPrices) {
        String[] prices = optionalOptionPrices.split(",");
        return Arrays.asList(prices).stream().mapToDouble(Double::valueOf).sum();
    }
}
