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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author pc
 */
public class FXMLLoginController implements Initializable {
    private static final UserSevices S = new UserSevices();
    @FXML private TextField txtUsername;
    @FXML private TextField txtPassword;
    @FXML private VBox VBoxMain;
    @FXML private Button btnLogin;
    @FXML private Button btnExit;
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
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        try {
            if (username != "" && password != "") {
                
                
                User user = S.getUserByUsername(username);
                if (S.checkAccount(username, password)) {
                    if (user.getUserRole()) {
                        Utils.showForm(fxmlAdminLoader, "Admin");
                        Stage stageCurrent = (Stage) btnLogin.getScene().getWindow();
                        stageCurrent.close();
                    }
                    else {
                        Utils.showForm(fxmlAdminLoader, "Nh??n vi??n");
                        Stage stageCurrent = (Stage) btnLogin.getScene().getWindow();
                        stageCurrent.close();
                    }
                }
                else {
                    Utils.getBox("T??i kho???n ho???c m???t kh???u ch??a ch??nh x??c!!!", Alert.AlertType.WARNING).show();
                }
            }
            else {
                Utils.getBox("Vui l??ng nh???p ?????y ????? th??ng tin!!!", Alert.AlertType.WARNING).show();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    
}
