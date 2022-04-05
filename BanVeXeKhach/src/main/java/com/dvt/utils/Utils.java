/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvt.utils;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class Utils {
    public static Alert getBox(String content, Alert.AlertType  type) {
        Alert alert = new Alert(type);
        alert.setContentText(content);
        return alert;
    }
    
    public static void showForm(FXMLLoader loader, String title) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
    
}
