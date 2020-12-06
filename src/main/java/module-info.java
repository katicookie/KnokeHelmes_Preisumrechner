module de.whs.mcim.knokehelmes_preisumrechner {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens de.whs.mcim.knokehelmes_preisumrechner to javafx.fxml;
    exports de.whs.mcim.knokehelmes_preisumrechner;
}
