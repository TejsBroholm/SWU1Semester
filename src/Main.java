import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by frederikchristensen on 27/11/14.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        showBioView(primaryStage);
    }

    public void showBioView(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("View/BioBooking.fxml"));
            Parent bioView = loader.load();
            stage.setTitle("BioBooking");
            stage.setScene(new Scene(bioView, 300, 275));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


public static void main(String[] args) {
    launch(args);
}
}