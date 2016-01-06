package application.view;

import application.Cypher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class EncrypterDecrypterController {

	@FXML
	private Label output;
	
	@FXML
	private TextField txFl = new TextField();
	
	@FXML
	private void handleEncrpytButton(ActionEvent event){
		String inputText = txFl.getText();
		String outputText = Cypher.encrypt(inputText);
		output.setText(outputText);
	}
	
	@FXML
	private void handleDecrpytButton(ActionEvent event){
		String inputText = txFl.getText();
		String outputText = Cypher.decrypt(inputText);
		output.setText(outputText);
	}
	
	
}
