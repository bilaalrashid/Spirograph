package sample;

import java.util.ArrayList;

/**
 * A spirograph
 */
class Spirograph {

    // Properties

    /**
     * The R variable in the parametric equation
     */
    private double r1;

    /**
     * The r variable in the parametric equation
     */
    private double r2;

    /**
     * The O variable in the parametric equation
     */
    private double o;

    // Contructor

    /**
     * Creates a new spirograph
     * @param r1 The R variable in the parametric equation
     * @param r2 The r variable in the parametric equation
     * @param o The O variable in the parametric equation
     */
    Spirograph(double r1, double r2, double o) {
        this.r1 = r1;
        this.r2 = r2;
        this.o = o;
    }

    // Public methods

    /**
     * Generates all of the coordinates in the spirograph pattern
     * @return All of the coordinates in the pattern
     */
    ArrayList<Coordinate> getCoordiantes() {
        ArrayList<Coordinate> coordinateList = new ArrayList<Coordinate>();

        for (double t = 0.0; t < 3 * Math.PI; t += 0.001) {
            double x = calculateXCoord(this.r1, this.r2, this.o, t);
            double y = calculateYCoord(this.r1, this.r2, this.o, t);

            Coordinate coordinate = new Coordinate(x, y);
            coordinateList.add(coordinate);
        }

        return coordinateList;
    }

    // Private methods

    /**
     * Calculates the x value a coordinate for the parametric equation
     * @param R The R variable in the parametric equation
     * @param r The r variable in the parametric equation
     * @param O The O variable in the parametric equation
     * @param t The common t parameter in the parametric equation
     * @return The x value of the coordinate
     */
    private double calculateXCoord(double R, double r, double O, double t) {
        return (R+r) * Math.cos(t) - (r+O) * Math.cos(((R+r)/r)*t);
    }

    /**
     * Calculates the y value a coordinate for the parametric equation
     * @param R The R variable in the parametric equation
     * @param r The r variable in the parametric equation
     * @param O The O variable in the parametric equation
     * @param t The common t parameter in the parametric equation
     * @return The y value of the coordinate
     */
    private double calculateYCoord(double R, double r, double O, double t) {
        return (R+r) * Math.sin(t) - (r+O) * Math.sin(((R+r)/r)*t);
    }

}
