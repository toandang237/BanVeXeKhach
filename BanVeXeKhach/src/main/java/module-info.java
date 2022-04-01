module com.dvt.banvexekhach {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires org.apache.commons.codec;

    opens com.dvt.banvexekhach to javafx.fxml;
    exports com.dvt.banvexekhach;
}
