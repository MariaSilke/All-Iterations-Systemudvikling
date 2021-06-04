package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static VBox root;
    static List<GridPane> gridPaneList = new ArrayList<>();
    private static int index_current = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("MultisceneIt3.fxml"));
        gridPaneList.add(FXMLLoader.load(getClass().getResource("Smitteoversigt.fxml")));
        gridPaneList.add(FXMLLoader.load(getClass().getResource("Infektionsrater.fxml")));

        primaryStage.setTitle("CoronaNet - Regeringen");
        Scene scene = new Scene(root, 800, 500);

        primaryStage.setScene(scene);                   // add the scene to the stage / application window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void setGridPane(int index) {
        root.getChildren().remove(gridPaneList.get(index_current));
        root.getChildren().add(gridPaneList.get(index));
        index_current = index;
    }
}