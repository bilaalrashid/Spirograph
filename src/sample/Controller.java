package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * The controller for the main stage
 */
public class Controller implements Initializable {

    // Properties

    /**
     * The canvas to display the spirograph on
     */
    @FXML
    private Canvas canvas;

    /**
     * The slider controlling that value of R
     */
    @FXML
    private Slider r1Slider;

    /**
     * The slider controlling the value of r
     */
    @FXML
    private Slider r2Slider;

    /**
     * The slider controlling the value of O
     */
    @FXML
    private Slider oSlider;

    /**
     * The graphics context of the canvas to draw on
     */
    private GraphicsContext graphicsContext;

    /**
     * The spirograph
     */
    private Spirograph spirograph;

    // Initializer

    /**
     * Initialises the graphics context from the canvas
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.graphicsContext = this.canvas.getGraphicsContext2D();
        this.graphicsContext.clearRect(0, 0, 600, 600);
        this.spirograph = new Spirograph(this.r1Slider.getValue(), this.r2Slider.getValue(), this.oSlider.getValue());
    }

    // Private methods

    /**
     * Draws the spirograph in a random color on the canvas
     */
    @FXML
    private void draw() {
        this.updateSliderValues();
        this.graphicsContext.setStroke(this.generateRandomColor());

        ArrayList<Coordinate> coordinates = this.spirograph.getCoordiantes();

        for (Coordinate coordinate : coordinates) {
            this.graphicsContext.strokeOval(coordinate.getX() + 300, coordinate.getY() + 300, 1.0, 1.0);
        }
    }

    /**
     * Clears the canvas
     */
    @FXML
    private void clear() {
        this.graphicsContext.clearRect(0, 0, 600, 600);
    }

    /**
     * Updates the spirograph with the current values of the sliders
     */
    private void updateSliderValues() {
        this.spirograph.setR1(this.r1Slider.getValue());
        this.spirograph.setR2(this.r2Slider.getValue());
        this.spirograph.setO(this.oSlider.getValue());
    }

    /**
     * Generates a random color
     * @return The randomly generated color
     */
    private Color generateRandomColor() {
        Random random = new Random();

        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        return Color.rgb(red, green, blue);
    }

}
