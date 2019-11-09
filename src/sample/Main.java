package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main interface for the spirograph
 */
public class Main extends Application {

    /**
     * Displays the window for the UI
     * @param primaryStage The main window to show
     * @throws Exception The FXML can't be found
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Spirograph");
        primaryStage.setScene(new Scene(root, 800, 650));
        primaryStage.show();
    }

    /**
     * Starts the program
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
