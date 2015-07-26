/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsojavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Lajos
 */

public final class FoablakStage extends Stage{

public Scene scene;
    
public FoablakStage(){

GridPane layout1 = new GridPane();
layout1.setAlignment(Pos.CENTER);
layout1.setHgap(10);
layout1.setVgap(10);
layout1.setPadding(new Insets(25,25,25,25));
layout1.setId("pane");
    System.out.println("layout.setId pipa");
        

Scene scenee = new Scene(layout1, 200,200);
    System.out.println("layout1 added to scene");
scenee.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
    System.out.println("scene.getstylesheets...");

    this.setScene(scenee);
    this.setResizable(false);
    this.centerOnScreen();
    
Text szoveg = new Text("ProbaStage");
szoveg.setId("text");
layout1.add(szoveg, 0, 0);
    System.out.println("szoveg hozzaadva");
    System.out.println("centeronscreen");

Button valto = new Button("Valts ablakot!");
layout1.add(valto, 0, 1);
    
valto.setOnAction(new EventHandler<ActionEvent>(){

@Override
public void handle(ActionEvent e){

    MasikAblakStage msk = new MasikAblakStage();
    msk.show();
    
    
}


});

this.show();



}



    
        
}
        

