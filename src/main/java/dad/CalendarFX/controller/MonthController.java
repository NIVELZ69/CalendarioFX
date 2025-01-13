package dad.CalendarFX.controller;

import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;

public class MonthController implements Initializable {
	
    @FXML
    private Label catorceLabel;

    @FXML
    private Label cincoLabel;

    @FXML
    private Label cuatroLabel;

    @FXML
    private Label diecinueveLabel;

    @FXML
    private Label dieciochoLabel;

    @FXML
    private Label dieciseisLabel;

    @FXML
    private Label diecisieteLabel;

    @FXML
    private Label diezLabel;

    @FXML
    private Label doceLabel;

    @FXML
    private ColumnConstraints domingoColumn;

    @FXML
    private Label domingoLabel;

    @FXML
    private Label dosLabel;

    @FXML
    private ColumnConstraints juevesColumn;

    @FXML
    private Label juevesLabel;

    @FXML
    private ColumnConstraints lunesColumn;

    @FXML
    private Label lunesLabel;

    @FXML
    private ColumnConstraints martesColumn;

    @FXML
    private Label martesLabel;

    @FXML
    private Label mesLabel;

    @FXML
    private ColumnConstraints miercolesColumn;

    @FXML
    private Label miercolesLabel;

    @FXML
    private Label nueveLabel;

    @FXML
    private Label ochoLabel;

    @FXML
    private Label onceLabel;

    @FXML
    private Label quinceLabel;

    @FXML
    private BorderPane rootMonth;

    @FXML
    private ColumnConstraints sabadoColumn;

    @FXML
    private Label sabadoLabel;

    @FXML
    private Label seisLabel;

    @FXML
    private Label sieteLabel;

    @FXML
    private Label treceLabel;

    @FXML
    private Label treintaLabel;

    @FXML
    private Label treintaycincoLabel;

    @FXML
    private Label treintaycuatroLabel;

    @FXML
    private Label treintaydosLabel;

    @FXML
    private Label treintaytresLabel;

    @FXML
    private Label treintayunoLabel;

    @FXML
    private Label tresLabel;

    @FXML
    private Label unoLabel;

    @FXML
    private Label veinteLabel;

    @FXML
    private Label veinticincoLabel;

    @FXML
    private Label veinticuatroLabel;

    @FXML
    private Label veintidosLabel;

    @FXML
    private Label veintinuevaLabel;

    @FXML
    private Label veintiochoLabel;

    @FXML
    private Label veintiseisLabel;

    @FXML
    private Label veintisieteLabel;

    @FXML
    private Label veintitresLabel;

    @FXML
    private Label veintiunoLabel;

    @FXML
    private ColumnConstraints viernesColumn;

    @FXML
    private Label viernesLabel;
    
    public MonthController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MonthView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// bindings
//		listaPalabras.setItems(palabrasList);
//		puntosLabel.textProperty().bind(puntos.asString());
//		puntos.addListener((Observable, oldValue, newValue) -> actualizarImagen(newValue.intValue()));
//		listaPuntuaciones.setItems(puntuacionesList);

	}

}

