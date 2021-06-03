package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class InfektionsraterController {
    public Label LabelKommune;
    public TextField TextKommune;
    public Button ButtonSøg;
    public Label Dato;
    public DatePicker DatePicker;
    public Label labelPostnummer;
    public TextField textPostnummer;
    public Label labelSmittede;
    public TextField textSmittede;
    public BarChart barchartMutationer;

    @FXML
    private GridPane grid;

    private void clearTextFields(GridPane grid) {
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                // clear
                ((TextField) node).setText("");
                node.setStyle(null);
            }
        }
    }

    public void ActionSearch(ActionEvent actionEvent) { clearTextFields(grid);
    }
}

