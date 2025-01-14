package dad.CalendarFX.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
    
    public MainController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MonthView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
    
    private final IntegerProperty year = new SimpleIntegerProperty(2025);
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// bindings
//		listaPalabras.setItems(palabrasList);
//		puntosLabel.textProperty().bind(puntos.asString());
//		puntos.addListener((Observable, oldValue, newValue) -> actualizarImagen(newValue.intValue()));
//		listaPuntuaciones.setItems(puntuacionesList);
    	
    	try {
    		for(int i = 0; i < mesesGridPane.getChildren().size(); i++) {
    			FXMLLoader loader = (FXMLLoader) mesesGridPane.getChildren().get(i).getProperties().get("loader");
    			MonthController monthController = loader.getController();
    			
    			if(monthController != null) {
    				monthController.yearProperty().bind(yearProperty());
    				monthController.setMonth(i + 1);
    			}
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
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
    
}

