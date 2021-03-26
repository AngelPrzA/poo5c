/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaJSON;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Friends {
    //Variables de clase 
    ArrayList<Friend> friends;
    
    //Constrcutor vacio
    public Friends(){
        this.friends = new ArrayList<Friend>();
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }
    
}
