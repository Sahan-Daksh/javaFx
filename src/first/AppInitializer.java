package first;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Catch Fxml File
        URL resource = getClass().getResource("MainForm.fxml");

        //Load to the Ram
        Parent load = FXMLLoader.load(resource);

        //Create a Scene
        Scene scene = new Scene(load);

        //Set Scene to Stage
        primaryStage.setScene(scene);

        //Show Stage
        primaryStage.show();

    }
}
