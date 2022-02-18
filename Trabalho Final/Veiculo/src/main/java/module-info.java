module com {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence; 
    requires org.hibernate.orm.core;
    requires java.sql;
    requires java.base;

    opens com to javafx.fxml;
    exports com;
}
