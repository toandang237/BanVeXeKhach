/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dvt.banvexekhach;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.eclipse.sisu.launch.Main;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class FXMLAdminController implements Initializable {
    @FXML private VBox VBoxAdmin;
    @FXML private MenuBar menuAdmin;
    Menu mnThongKe;
    Menu mnTaiKhoan;
    MenuItem mnItemDoanhThu;
    MenuItem mnItemTuyenDi;
    MenuItem mnItemDoiMk;
    MenuItem mnItemDangXuat;

    
    FXMLLoader fxmlLoginLoader = new FXMLLoader(App.class.getResource("login.fxml"));
    FXMLLoader fxmlAdminLoader = new FXMLLoader(App.class.getResource("FXMLAdmin.fxml"));
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.load();
        
    }
    
    public void load() {
        mnThongKe = new Menu("Thống kê");
        mnTaiKhoan = new Menu("Tài khoản");
        mnItemDoanhThu = new MenuItem("Doanh thu");
        mnItemTuyenDi = new MenuItem("Tuyến đi");
        mnItemDoiMk = new MenuItem("Đổi mật khẩu");
        mnItemDangXuat = new MenuItem("Đăng xuất");
        mnThongKe.getItems().addAll(mnItemDoanhThu, mnItemTuyenDi);
        mnTaiKhoan.getItems().addAll(mnItemDoiMk, mnItemDangXuat);
        menuAdmin.getMenus().addAll(mnThongKe, mnTaiKhoan);
        
        mnItemDangXuat.setOnAction((ActionEvent t) -> {
            dangXuatHandler(t);
        });
    }
    
    public void thongKeTuyenDiHandler(ActionEvent event) {
        
    }
    
    public void thongKeDoanhThuHandler(ActionEvent event) {
        
    }
    
    public void dangXuatHandler(ActionEvent event) {
        Stage window = new Stage();
        Scene sc;
        

        try {
            sc = new Scene(fxmlLoginLoader.load());
            window.setScene(sc);
            System.exit();
            window.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(FXMLAdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
