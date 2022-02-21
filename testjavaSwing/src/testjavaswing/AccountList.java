/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavaswing;

import java.util.ArrayList;

/**
 *
 * @author at160
 */
public class AccountList {
    ArrayList<User> accountlist=new ArrayList<>();

    public AccountList() {
    }
    
    public boolean contains(String name ,String passw){
        for(User x:this.accountlist){
            if(x.getuSer().equalsIgnoreCase(name)&&x.passWord.equalsIgnoreCase(passw)){
                return true;
            }
        }
        return false;
    }
    public boolean check(String name){
        for(User x:this.accountlist){
            if(x.getuSer().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public void add(String User,String Pass){
        this.accountlist.add(new User(User,Pass));
    }
}
