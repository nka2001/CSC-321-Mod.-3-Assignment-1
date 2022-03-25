package com.mycompany.csc321hw;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.collections.ObservableList;
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
    private ListView<ArrayList<String>> listView;

    @FXML
    private void CloseHW(ActionEvent event) {

        Platform.exit();
        System.exit(0);

    }

    @FXML
    private void analyzeInput(ActionEvent event) {

        LexemAnalyzer la = new LexemAnalyzer(inputArea.getText());
        
        la.analyze();
        
        ObservableList<ArrayList<String>> i = listView.getItems();
        i.add(la.getSeperators());
        i.add(la.getOperators());
        //i.add(la.getConstants());
        i.add(la.getDelimeters());
        System.out.println(la.getSnippet());
    }

    public void initialize() {

        String str = "/* The main function */\n"
                + "\n"
                + "int main() {\n"
                + "\n"
                + "  std::cout << \"Hello world\";\n"
                + "\n"
                + "  return 0;\n"
                + "\n"
                + "}";
        
        inputArea.setText(str);

    }
}
