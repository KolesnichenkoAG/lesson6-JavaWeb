module ru.gb.lesson6javaweb {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.lesson6javaweb to javafx.fxml;
    exports ru.gb.lesson6javaweb;
}