package com.lotusp.refactoring.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehiclePriceServiceTest {

    @Test
    public void should_return_correct_price_when_calculate_total_vehicle_price() {
        double vehicleMsrp = 1.0;
        double paintPrice = 1.0;
        double trimPrice = 1.0;
        String optionalOptionPrices = "1.0,2.0";
        VehiclePriceService vehiclePriceService = new VehiclePriceService();
        assertEquals(6.0, vehiclePriceService.calculateTotalVehiclePrice(vehicleMsrp, paintPrice, trimPrice, optionalOptionPrices), Double.MIN_VALUE);
    }

}