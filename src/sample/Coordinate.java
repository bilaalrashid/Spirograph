package sample;

/**
 * A coordinate
 */
class Coordinate {

    // Properties

    /**
     * The x value of the coordinate
     */
    private double x;

    /**
     * The y value of the coordinate
     */
    private double y;

    // Constructor

    /**
     * Creates a new coordinate
     * @param x The x value of the coordinate
     * @param y The y value of the coordinate
     */
    Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters

    /**
     * Gets the x value of the coordinate
     * @return The x value
     */
    double getX() {
        return this.x;
    }

    /**
     * Sets the x value of the coordinate
     * @param x The new x value
     */
    void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the y value of the coordinate
     * @return The y value
     */
    double getY() {
        return this.y;
    }

    /**
     * Sets the y value of the coordinate
     * @param y The new y value
     */
    void setY(double y) {
        this.y = y;
    }

}
