class MessPricing implements PricingComponent {
    public Money getPrice(BookingRequest req) {
        if (req.addOns.contains(AddOn.MESS)) {
            return new Money(1000);
        }
        return new Money(0);
    }
}

class LaundryPricing implements PricingComponent {
    public Money getPrice(BookingRequest req) {
        if (req.addOns.contains(AddOn.LAUNDRY)) {
            return new Money(500);
        }
        return new Money(0);
    }
}

class GymPricing implements PricingComponent {
    public Money getPrice(BookingRequest req) {
        if (req.addOns.contains(AddOn.GYM)) {
            return new Money(300);
        }
        return new Money(0);
    }
}
