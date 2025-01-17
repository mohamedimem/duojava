module org.imem.duojava {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;
    requires json.simple;
    requires org.json;

    opens org.imem.duojava to javafx.fxml;
    exports org.imem.duojava;
    exports org.imem.duojava.Section.task;
    opens org.imem.duojava.Section.task to javafx.fxml;
    exports org.imem.duojava.Section;
    opens org.imem.duojava.Section to javafx.fxml;
    exports org.imem.duojava.Section.UI;
    opens org.imem.duojava.Section.UI to javafx.fxml;
    exports org.imem.duojava.Section.task.model;
    opens org.imem.duojava.Section.task.model to javafx.fxml;
    exports org.imem.duojava.Section.task.model.types;
    opens org.imem.duojava.Section.task.model.types to javafx.fxml;
    exports org.imem.duojava.Section.task.model.types.QCM;
    opens org.imem.duojava.Section.task.model.types.QCM to javafx.fxml;
}