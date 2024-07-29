package org.vaadin.marcus.data;

public enum BookingClass {
    ECONOMY("Economy"),
    PREMIUM_ECONOMY("Premium Economy"),
    BUSINESS("Business");

    private String description;

    BookingClass(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static BookingClass fromDescription(String description) {
        for (BookingClass bookingClass : values()) {
            if (bookingClass.getDescription().equals(description)) {
                return bookingClass;
            }
        }
        throw new IllegalArgumentException("No booking class with description " + description);
    }
}
