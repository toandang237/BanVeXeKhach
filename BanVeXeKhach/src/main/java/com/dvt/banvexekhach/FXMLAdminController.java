/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dvt.banvexekhach;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class FXMLAdminController implements Initializable {
    @FXML private VBox VBoxAdmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        FlowPane fpAdmin = new FlowPane();
        Button btn_TuyenDi = new Button("Tuyến đi");
        btn_TuyenDi.setPrefSize(100, 100);
        
        fpAdmin.getChildren().add(btn_TuyenDi);
        VBoxAdmin.getChildren().add(fpAdmin);
    }    
    
}
