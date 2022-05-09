module org.crescentschool.ics3ufinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.crescentschool.ics3ufinal to javafx.fxml;
    exports org.crescentschool.ics3ufinal;
}