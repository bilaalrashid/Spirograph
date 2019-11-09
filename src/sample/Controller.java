package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.net.URL;
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
     * Initialises the graphics context from the canvas
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.graphicsContext = this.canvas.getGraphicsContext2D();
    }

    /**
     * Draws the spirograph on the graphics context
     */
    @FXML
    private void draw() {

    }

}
