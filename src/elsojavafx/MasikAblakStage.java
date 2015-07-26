/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsojavafx;

import java.util.logging.Level;
import java.util.logging.Logger;
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
public class MasikAblakStage extends Stage{
    
    public MasikAblakStage(){
    
    GridPane layout = new GridPane();
    layout.setAlignment(Pos.CENTER);
    layout.setId("pane2");
    
    Scene scene = new Scene(layout, 200, 200);
    scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
    
    this.setScene(scene);
    this.setResizable(false);
    this.centerOnScreen();
    
    Text szoveg = new Text("Második stage");
    szoveg.setId("text");
    layout.add(szoveg, 0, 0);
    
    Button valto = new Button("Valts ablakot!");
    layout.add(valto, 0, 1);
    
    valto.setOnAction(new EventHandler<ActionEvent>(){

@Override
public void handle(ActionEvent e){

    FoablakStage fbl = new FoablakStage();
    fbl.show();
    try {
        finalize();
    } catch (Throwable ex) {
        Logger.getLogger(MasikAblakStage.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}


});
    
    
    }
    
    protected void finalize() throws Throwable{
    
        super.finalize();
    
    }
    
}
