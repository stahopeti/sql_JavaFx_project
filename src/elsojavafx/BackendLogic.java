/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsojavafx;

/**
 *
 * @author Lajos
 */
public class BackendLogic {
    
    
    public void bejelentkezo(String nev, String jelszo){
    
        System.out.println("Név: " + nev +"\nJelszó: " + jelszo);
    
    }
    
    public void bckndGetPlayers(){
    
        DBConnection connect = new DBConnection();
        connect.getPlayer();
    
    
    }
   
    public void bckndAddPlayer(String name, String pw){
    
        DBConnection connect = new DBConnection();
        connect.addPlayer(name, pw);
    
    }
    
    public boolean signInNameCheck(String name){
    
    DBConnection connection = new DBConnection();
    
    
    return false;
    }
}
