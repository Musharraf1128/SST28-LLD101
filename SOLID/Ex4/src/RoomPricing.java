class SingleRoomPricing implements PricingComponent {
    public Money getPrice(BookingRequest req) {
        if (req.roomType == LegacyRoomTypes.SINGLE) {
            return new Money(14000);
        }
        return new Money(0);
    }
}

class DoubleRoomPricing implements PricingComponent {
    public Money getPrice(BookingRequest req) {
        if (req.roomType == LegacyRoomTypes.DOUBLE) {
            return new Money(15000);
        }
        return new Money(0);
    }
}

class TripleRoomPricing implements PricingComponent {
    public Money getPrice(BookingRequest req) {
        if (req.roomType == LegacyRoomTypes.TRIPLE) {
            return new Money(12000);
        }
        return new Money(0);
    }
}

class DeluxeRoomPricing implements PricingComponent {
    public Money getPrice(BookingRequest req) {
        if (req.roomType == LegacyRoomTypes.DELUXE) {
            return new Money(16000);
        }
        return new Money(0);
    }
}
