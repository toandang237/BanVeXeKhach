/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dvt.banvexekhach;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class FXMLAdminController implements Initializable {
    @FXML private VBox VBoxAdmin;
    @FXML private MenuBar menuAdmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.load();
        
    }
    
    public void load() {
        Menu mnThongKe = new Menu("Thống kê");
        Menu mnTaiKhoan = new Menu("Tài khoản");
        MenuItem doanhThu = new MenuItem("Doanh thu");
        MenuItem tuyenDi = new MenuItem("Tuyến đi");
        MenuItem doiMk = new MenuItem("Đổi mật khẩu");
        MenuItem dangXuat = new MenuItem("Đăng xuất");
        mnThongKe.getItems().addAll(doanhThu, tuyenDi);
        mnTaiKhoan.getItems().addAll(doiMk, dangXuat);
        menuAdmin.getMenus().addAll(mnThongKe, mnTaiKhoan);
    }
    
    public void thongKeTuyenDiHandler(ActionEvent event) {
        
    }
    
}
