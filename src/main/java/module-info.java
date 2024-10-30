module com.agthanae {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.agthanae to javafx.fxml;
    exports com.agthanae;
}
