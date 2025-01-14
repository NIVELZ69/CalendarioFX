package dad.CalendarFX.controller;

import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
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
    
    public IntegerProperty monthProperty = new SimpleIntegerProperty();
    public IntegerProperty yearProperty = new SimpleIntegerProperty();
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// bindings
//		listaPalabras.setItems(palabrasList);
//		puntosLabel.textProperty().bind(puntos.asString());
//		puntos.addListener((Observable, oldValue, newValue) -> actualizarImagen(newValue.intValue()));
//		listaPuntuaciones.setItems(puntuacionesList);

		monthProperty.addListener((obs, oldVal, newVal) -> {
	        switch (newVal.intValue()) {
	            case 1: mesLabel.setText("enero"); break;
	            case 2: mesLabel.setText("febrero"); break;
	            case 3: mesLabel.setText("marzo"); break;
	            case 4: mesLabel.setText("abril"); break;
	            case 5: mesLabel.setText("mayo"); break;
	            case 6: mesLabel.setText("junio"); break;
	            case 7: mesLabel.setText("julio"); break;
	            case 8: mesLabel.setText("agosto"); break;
	            case 9: mesLabel.setText("septiembre"); break;
	            case 10: mesLabel.setText("octubre"); break;
	            case 11: mesLabel.setText("noviembre"); break;
	            case 12: mesLabel.setText("diciembre"); break;
	            default: mesLabel.setText(""); break;
	        }
	    });
		
	}

	public IntegerProperty monthProperty() {
		return monthProperty;
	}
	
	public int getMonth() {
		return monthProperty.get();
	}
	
	public void setMonth(int month) {
		this.monthProperty.set(month);
	}
	
	public IntegerProperty yearProperty() {
		return yearProperty;
	}
	
	public int getYear(int year) {
		return yearProperty.get();
	}
	
	public void setYear(int year) {
		this.yearProperty.set(year);
	}

}

