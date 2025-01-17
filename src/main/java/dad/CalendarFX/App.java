package dad.CalendarFX;

import dad.CalendarFX.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML y obtener el controlador
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
        BorderPane root = loader.load(); // Carga la vista principal
        MainController mainController = loader.getController(); // Obtén el controlador asociado

        // Configurar la escena y el stage
        primaryStage.setTitle("CalendarFX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
