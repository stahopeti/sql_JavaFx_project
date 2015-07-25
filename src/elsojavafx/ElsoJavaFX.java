/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsojavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Lajos
 */
public class ElsoJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Signing in!");
        
        primaryStage.show();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        grid.setGridLinesVisible(false);
        
        Scene scene = new Scene(grid, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        primaryStage.centerOnScreen();
        
        Text signIn = new Text("Sign in!");
        signIn.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, 20));
        grid.add(signIn, 1,1);
        
        Text signUp = new Text("Sign up!");
        signUp.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, 20));
        grid.add(signUp, 3, 1);
        
        Label userName = new Label("Username:");
        userName.setFont(new Font("Arial", 12));
        grid.add(userName, 0,2);
        
        
        Label newUserName = new Label("New Username:");
        newUserName.setFont(new Font("Arial", 12));
        grid.add(newUserName, 2,2);
        
        TextField userNameTF = new TextField();
        grid.add(userNameTF,1,2);
        
        
        TextField newUserNameTF = new TextField();
        grid.add(newUserNameTF,3,2);
        
//        Label paWo = new Label("Password:");
//        paWo.setFont(new Font("Arial", 12));
//        grid.add(paWo, 0,3);
        
        
        Label newPaWo = new Label("Password:");
        newPaWo.setFont(new Font("Arial", 12));
        grid.add(newPaWo, 2,3);
        
//        PasswordField pwField = new PasswordField();
//        grid.add(pwField, 1,3);
        
        
        PasswordField newPwField = new PasswordField();
        grid.add(newPwField, 3,3);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,5);
        
        Button btnUp = new Button("Sign up");
        HBox hbBtnUp = new HBox(10);
        hbBtnUp.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnUp.getChildren().add(btnUp);
        grid.add(hbBtnUp,3,5);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent e){
            
                BackendLogic backnd = new BackendLogic();

                
            }
        
        
        });
        
        btnUp.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent e){
        
            BackendLogic backnd = new BackendLogic();
            
            backnd.bckndAddPlayer(newUserNameTF.getText(),newPwField.getText());
            
            
        
        }
        
        });
        
    }

    /**
     * @param args the command line arguments
     */
    
        
        
    public static void main(String[] args) {
        launch(args);
    }
    
}