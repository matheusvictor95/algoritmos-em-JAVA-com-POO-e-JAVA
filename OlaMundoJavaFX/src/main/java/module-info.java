module olamundojavafx.OlaMundoJavaFX {
    requires javafx.controls;
    requires javafx.fxml;

    opens olamundojavafx.OlaMundoJavaFX to javafx.fxml;
    exports olamundojavafx.OlaMundoJavaFX;
}
