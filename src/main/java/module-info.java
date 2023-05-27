module com.vm.registro {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.vm.registro to javafx.fxml;
    exports com.vm.registro;
}