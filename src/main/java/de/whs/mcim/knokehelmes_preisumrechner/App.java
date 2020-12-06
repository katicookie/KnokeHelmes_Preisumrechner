package de.whs.mcim.knokehelmes_preisumrechner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    static final int WINDOW_WIDTH = 500;
    static final int WINDOW_HEIGHT = 300;
    static final String titel = "Preisumrechner";
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Preisumrechner"), WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setTitle(titel);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}