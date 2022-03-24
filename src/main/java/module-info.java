module com.mycompany.csc321hw {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc321hw to javafx.fxml;
    exports com.mycompany.csc321hw;
}
