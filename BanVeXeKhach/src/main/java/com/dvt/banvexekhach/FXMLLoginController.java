/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dvt.banvexekhach;

import com.dvt.pojo.User;
import com.dvt.sevices.UserSevices;
import com.dvt.utils.Utils;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.codec.digest.DigestUtils;


/**
 * FXML Controller class
 *
 * @author pc
 */
public class FXMLLoginController implements Initializable {
    private static final UserSevices S = new UserSevices();
    @FXML private TextField txtUsername;
    @FXML private TextField txtPassword;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        try {
//            User user = S.getUserById(1);
//            Utils.getBox(user.getUsername() + " " + user.getPassword(), Alert.AlertType.INFORMATION);
//        } catch (SQLException ex) {
//            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }  
    
    public void loginHandler(ActionEvent evt) throws NoSuchAlgorithmException, IOException {
        FXMLLoader fxmlAdminLoader = new FXMLLoader(App.class.getResource("FXMLAdmin.fxml"));
        FXMLLoader fxmlEmployeeLoader = new FXMLLoader(App.class.getResource("FXMLEmployee.fxml"));
        try {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            User user = S.getUserByUsername(username);
            if (S.checkAccount(username, password)) {
                if (user.getUserRole()) {
                    Scene scene = new Scene(fxmlAdminLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Admin");
                    stage.show();
                }
                else {
                    Scene scene = new Scene(fxmlEmployeeLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Employee");
                    stage.show();
                }
            }
            else {
                Utils.getBox("Tài khoản hoặc mật khẩu chưa chính xác!!!", Alert.AlertType.WARNING).show();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
