/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsojavafx;


import java.sql.*;

/**
 *
 * @author Lajos
 */
public class DBConnection {
    
    private Connection con;
    private Statement st;
    private ResultSet rt;
    
    public DBConnection(){
    try{
    
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/othello_db","root","");
    st = con.createStatement();
    
    }catch(Exception ex){
    
        System.out.println("Error: "+ ex);
    
    }
    
    
    }
    
    public void addPlayer(String name, String pw){
    try{
    
        String update = "INSERT INTO player_information(id,name,password) VALUES (8,'"+name+"','"+pw+"')";
        st.executeUpdate(update);
        
        String query = "select * from player_information";
        rt = st.executeQuery(query);
        System.out.println("Data:");
        while(rt.next()){
        
            System.out.println("név: " + rt.getString("name") + " jelszó: "+ rt.getString("password")
                    + "\nszületett: " + rt.getString("placeOfBirth") +  rt.getString("yearOfBirth") + "-ban/ben\n" );
        
        }
    }catch(Exception ex){
    
        System.out.println(ex);
    
    }
    
    }
    
    public void getPlayer(){
    try{
    
        String query = "select * from player_information";
        rt = st.executeQuery(query);
        System.out.println("Data:");
        while(rt.next()){
        
            System.out.println("név: " + rt.getString("name"));
        
        }
    }catch(Exception ex){
    
        System.out.println(ex);
    
    }
    
    }
    
    public String checkPlayerName(String name, String pw){
    String jelszo = null;
        
    try{
            
        String query = "SELECT password FROM othello_db WHERE name LIKE '"+ name +"' AND password LIKE '"+pw;
        rt = st.executeQuery(query);
        jelszo = rt.getString("password");
    
    }catch(Exception ex){
        
        System.out.println(ex);
        
    }
    
    return jelszo;
    
    }
}
