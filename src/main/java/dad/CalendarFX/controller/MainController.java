package dad.CalendarFX.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class MainController {

    @FXML
    private BorderPane root;

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    private Label añoLabel;

    @FXML
    private GridPane gridPane;

    // Referencias a los componentes personalizados (fx:include)
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

}

