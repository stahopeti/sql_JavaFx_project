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
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Lajos
 */
public class ElsoJavaFX extends Application {
    
    Stage window;
    
    
    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Főmenü");
        window.show();
        
        GridPane layout = new GridPane();
        
        Scene scene = new Scene(layout,277,400);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        
        
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(30);
        layout.setVgap(30);
        layout.setPadding(new Insets(30,30,30,30));
        layout.setId("pane");
        
        window.setScene(scene);
        window.centerOnScreen();
        
        Text szoveg = new Text("Főmenü");
        szoveg.setId("text");
        layout.add(szoveg, 0, 0);   
        
        Button elsoOldal = new Button("Első Oldal");
        layout.add(elsoOldal, 0, 1);
        
        
        Button masodikOldal = new Button("Második Oldal");
        layout.add(masodikOldal, 0, 2);
        
        
        //BUTTONS
        //BUTTONS
        
        elsoOldal.setOnAction(new EventHandler<ActionEvent>(){
        
        @Override
        public void handle(ActionEvent e){
        
            FoablakStage asd = new FoablakStage();
            asd.show();
                 
        
        }
        
        
        
        });
        
        masodikOldal.setOnAction(new EventHandler<ActionEvent>(){
        
        @Override
        public void handle(ActionEvent e){
        
            MasikAblakStage asd = new MasikAblakStage();
            asd.show();
                 
        
        }
        
        
        
        });
        
        //BUTTONS
        //BUTTONS
        
        
    }

    /**
     * @param args the command line arguments
     */
    
        
        
//    public static void main(String[] args) {
//        launch(args);
//    }
    
}