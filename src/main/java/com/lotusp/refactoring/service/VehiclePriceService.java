package com.lotusp.refactoring.service;

public class VehiclePriceService {

    public double calculateTotalVehiclePrice(double vehicleMsrp,
                                             double paintPrice,
                                             double upperPaintPrice,
                                             double trimPrice,
                                             double optionalOptionPrices) {
        return vehicleMsrp + paintPrice + upperPaintPrice  + trimPrice+ optionalOptionPrices;
    }
}
