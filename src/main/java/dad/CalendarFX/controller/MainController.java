package dad.CalendarFX.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class MainController implements Initializable {

    @FXML
    private BorderPane root;

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    private Label añoLabel;

    @FXML
    private GridPane mesesGridPane;

    @FXML
    private BorderPane eneroMonth;
    @FXML
    private BorderPane febreroMonth;
    @FXML
    private BorderPane marzoMonth;
    @FXML
    private BorderPane abrilMonth;
    @FXML
    private BorderPane mayoMonth;
    @FXML
    private BorderPane junioMonth;
    @FXML
    private BorderPane julioMonth;
    @FXML
    private BorderPane agostoMonth;
    @FXML
    private BorderPane septiembreMonth;
    @FXML
    private BorderPane octubreMonth;
    @FXML
    private BorderPane noviembreMonth;
    @FXML
    private BorderPane diciembreMonth;

    private final IntegerProperty year = new SimpleIntegerProperty(2025);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Vincula cada mes
        for (int i = 0; i < mesesGridPane.getChildren().size(); i++) {
            BorderPane monthPane = (BorderPane) mesesGridPane.getChildren().get(i);

            MonthController monthController = (MonthController) monthPane.getProperties().get("controller");
            if (monthController != null) {
                monthController.setMonth(i + 1);
                monthController.monthProperty().bind(yearProperty());
            }
        }
    }

    public IntegerProperty yearProperty() {
        return year;
    }

    public int getYear() {
        return year.get();
    }

    public void setYear(int year) {
        this.year.set(year);
    }

    @FXML
    private void onLeftAction() {
        setYear(getYear() - 1);
    }

    @FXML
    private void onRightAction() {
        setYear(getYear() + 1);
    }

    public BorderPane getRoot() {
        return root;
    }

    public void setRoot(BorderPane root) {
        this.root = root;
    }
}
