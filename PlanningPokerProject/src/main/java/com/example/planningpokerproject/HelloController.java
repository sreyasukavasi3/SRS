package com.example.planningpokerproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;

    public HelloController() {
    }

    public void cancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage)this.cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtonOnAction(ActionEvent e) {
        if (!this.usernameTextField.getText().isBlank() && !this.passwordPasswordField.getText().isBlank()) {
            this.validateLogin();
        } else {
            this.loginMessageLabel.setText("Please enter username and password.");
        }

    }

    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String var10000 = this.usernameTextField.getText();
        String verifyLogin = "SELECT COUNT(1) FROM users WHERE Username = '" + var10000 + "' AND Password = '" + this.passwordPasswordField.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(verifyLogin);

            while(resultSet.next()) {
                if (resultSet.getInt(1) == 1) {
                    this.loginMessageLabel.setText("Welcome!");
                } else {
                    this.loginMessageLabel.setText("Invalid login. Please try again.");
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }
}
