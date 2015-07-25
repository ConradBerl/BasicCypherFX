package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Primary extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		//load the FXML document
		Parent root = FXMLLoader.load(getClass().getResource("view/EncrypterDecrypterView.fxml"));
		//create the scene
		Scene scene = new Scene(root);
		//put the scene on the stage
		primaryStage.setTitle("Cypher");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	

    public static void main(String[] args) {
        launch(args);
    }
}
