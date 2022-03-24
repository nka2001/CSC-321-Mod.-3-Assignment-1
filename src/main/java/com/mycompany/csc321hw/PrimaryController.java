package com.mycompany.csc321hw;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private MenuItem closeProgram;
    @FXML
    private Button analyzeButton;
    @FXML
    private TextField inputArea;
    @FXML
    private ListView<String> listView;


    @FXML
    private void CloseHW(ActionEvent event) {
        
        Platform.exit();
        System.exit(0);
        
    }

    @FXML
    private void analyzeInput(ActionEvent event) {
        
        
        
        
    }
}
