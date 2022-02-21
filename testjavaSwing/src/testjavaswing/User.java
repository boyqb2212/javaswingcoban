/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavaswing;

/**
 *
 * @author at160
 */
public class User {
    String uSer;
    String passWord;

    public User() {
    }

    public User(String uSer, String passWord) {
        this.uSer = uSer;
        this.passWord = passWord;
    }

    
    public String getuSer() {
        return uSer;
    }

    public void setuSer(String uSer) {
        this.uSer = uSer;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" + "uSer=" + uSer + ", passWord=" + passWord + '}';
    }
    
}
