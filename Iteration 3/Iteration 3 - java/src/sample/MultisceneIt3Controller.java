package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class MultisceneIt3Controller {
    public MenuBar MenubarIt3;
    public Menu Smitteoverblik;
    public Menu Infektionsrater;
    public Menu OpdaterRestriktioner;
    public Menu OmCoronaNet;

    public void ActionSmittetal(ActionEvent actionEvent) { Main.setGridPane(0); }

    public void ActionInfektionstal(ActionEvent actionEvent) { Main.setGridPane(1); }

    public void ActionOpdater(ActionEvent actionEvent) { Main.setGridPane(2); }

    public void ActionCoronaNet(ActionEvent actionEvent) { Main.setGridPane(3); }
}
