public abstract class Building {
    private int numberOfRooms;
    private String dateOfConstruction;
    private int numberOfFloors;
    private double rentPrice;
    private boolean needRepairs;

    public Building(int numberOfRooms, int numberOfFloors, String dateOfConstruction, double rentPrice) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.dateOfConstruction = dateOfConstruction;
        this.rentPrice = rentPrice;
        this.needRepairs = false;

    }

// Properties with only getters as they are fairly permanent qualities
    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }
    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }
    public String getDateOfConstruction() {
        return dateOfConstruction;
    }

// Properties with both getters and setters
    public double getRentPrice() {
        return this.rentPrice;
    }
    public void setRentPrice(double rent) {
        this.rentPrice = rent;
    }
    public boolean isNeedRepairs() {
        return this.needRepairs;
    }
    public void setNeedRepairs(boolean needRepairs) {
        this.needRepairs = needRepairs;
    }
}

