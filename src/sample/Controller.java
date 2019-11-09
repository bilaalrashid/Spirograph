package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * The controller for the main stage
 */
public class Controller implements Initializable {

    /**
     * The canvas to display the spirograph on
     */
    @FXML
    private Canvas canvas;

    /**
     * The graphics context of the canvas to draw on
     */
    private GraphicsContext graphicsContext;

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
     * The spirograph
     */
    private Spirograph spirograph;

    /**
     * Initialises the graphics context from the canvas
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.graphicsContext = this.canvas.getGraphicsContext2D();
        this.graphicsContext.clearRect(0, 0, 600, 600);
        this.spirograph = new Spirograph(this.r1Slider.getValue(), this.r2Slider.getValue(), this.oSlider.getValue());
    }

    /**
     * Draws the spirograph on the graphics context
     */
    @FXML
    private void draw() {
        this.spirograph.setR1(this.r1Slider.getValue());
        this.spirograph.setR2(this.r2Slider.getValue());
        this.spirograph.setO(this.oSlider.getValue());

        ArrayList<Coordinate> coordinates = this.spirograph.getCoordiantes();

        for (Coordinate coordinate : coordinates) {
            this.graphicsContext.strokeOval(coordinate.getX() + 300, coordinate.getY() + 300, 1.0, 1.0);
        }
    }

    @FXML
    private void clear() {
        this.graphicsContext.clearRect(0, 0, 600, 600);
    }

}
