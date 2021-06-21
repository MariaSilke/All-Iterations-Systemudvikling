package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import org.w3c.dom.Text;

public class Main extends Application {
    // We declare the "Text field/area" here in order to be able to use them in the clearFields method;
    TextField textCprNumber = new TextField();  // a TextField is a single lined field
    TextField textAdgangskode = new TextField();       // Laver et nyt tekstfelt til patientnavnet
    TextArea resultField = new TextArea();      // a TextArea is a multiline text field - more advanced than TextField

    @Override
    public void start(Stage primaryStage) {     // a Stage is the main window for a JavaFX application
        primaryStage.setTitle("Velkommen til CoronaApp borger");   // set the title shown int th title bar
        GridPane grid = new GridPane();         // create a GridPane for a nice even flexible screen layout
        grid.setAlignment(Pos.CENTER);          // Align the grid to the center of the application window
        Label overskrift = new Label("Login med NemID");  //Laver nyt label
        grid.add(overskrift, 1, 0);         // Skriver overskriften over felterne

        //label og text for CPR
        Label CPR = new Label("Bruger-id");
        grid.add(CPR, 0, 1);
        grid.setHgap(10);
        grid.setVgap(10);
        //grid.setGridLinesVisible(true);
        textCprNumber.setPromptText("CPR-nummer");
        textCprNumber.setFocusTraversable(false);
        textCprNumber.setMaxWidth(300);
        textCprNumber.setTooltip(new Tooltip("CPR-nummer skal have formatet ##########"));
        grid.add(textCprNumber, 1, 1);

        // Lav label og text for adgangskode
        Label Adgangskode = new Label("Adgangskode");
        grid.add(Adgangskode, 0, 2);
        textAdgangskode.setPromptText("adgangskode");
        textAdgangskode.setFocusTraversable(false);
        textAdgangskode.setMaxWidth(300);
        grid.add(textAdgangskode, 1, 2);

        //Checkbox til generelt samtykke
        CheckBox ConsentGeneral = new CheckBox("Jeg har accepterer samtykkebetingelserne");
        ConsentGeneral.setTooltip(new Tooltip("Når du logger ind på CoronaApp med NemID, giver du samtykke til deling af journal, testsvar og kommunikation med egen læge"));
        grid.add(ConsentGeneral, 1, 3);

        //Checkbox til sensor og geosamtykke
        CheckBox ConsentExtra = new CheckBox("Jeg vil gerne give samtykke til deling af sensordata og geolokation");
        ConsentExtra.setTooltip(new Tooltip("Hvis du checker dette felt giver du samtykke til deling af sensordata og geolokation"));
        grid.add(ConsentExtra, 1, 4);

        Button buttonLogin = new Button("Næste");
        Button buttonAnnuller = new Button("Annuller");    // create another clickable button

        //Sæt buttons ind
        grid.add(buttonLogin, 2, 6);    // third column, first row
        grid.add(buttonAnnuller, 2, 7); // third column, fifth row


        buttonAnnuller.setOnMouseClicked(event -> {
            clearFields();  // call the method which clears all fields (see below)
        });


        Scene scene = new Scene(grid, 600, 400); // create an scene window 600 x 400 pixels
        primaryStage.setScene(scene);                   // add the scene to the stage / application window
        primaryStage.show();                 // display the stage - important! otherwise nothing happens :-)
    }

    public void clearFields() { // method to clear text fields
        textCprNumber.clear();
        textAdgangskode.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
