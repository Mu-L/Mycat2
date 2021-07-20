package io.mycat.ui;

import io.mycat.config.LogicSchemaConfig;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.Data;

@Data
public class GlobalTableConfigVO {
    @FXML
   public TextField schemaName;
    @FXML
    public TextField tableName;

    @FXML
    public ListView targets;

}
