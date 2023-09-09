package lk.ijse.D24.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.security.auth.login.LoginContext;
import java.awt.*;
import java.io.IOException;

public class LoginFormController {
    @FXML
    private AnchorPane LoginWin;

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("") && txtPassword.getText().equals("")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/dashboard.fxml"));
            Parent parent=loader.load();
            Scene scene=new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            Stage stage1= (Stage) LoginWin.getScene().getWindow();
            stage1.close();
        }else{
            new Alert(Alert.AlertType.ERROR, "Invalid User Name Or Password.Please Try Again" ).show();
        }
    }

//    public void showPasswordOnMousePressed(javafx.scene.input.MouseEvent mouseEvent) {
//        Image img = new Image("view/assets/show.png");
//        ImageView view = new ImageView(img);
//        view.setFitHeight(30);
//        view.setFitWidth(30);
//        lblHide.setGraphic(view);
//
//        txtPassword.setStyle("-fx-background-color:white ");
//        txtPassword.setPromptText(txtPassword.getText());
//        txtPassword.setText("");
//        txtPassword.setDisable(true);
//
//    }

}
