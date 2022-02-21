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
public class TestjavaSwing {
   static AccountList accs=new AccountList();
   static profile fdulieu=new profile();
   static dangky fdangky=new dangky();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereG
       
       accs.accountlist.add(new User("boyqb2212","quyKMA2212"));
       accs.accountlist.add(new User("boyqb2212a","quyKMA2212b"));
       accs.accountlist.add(new User("boyqb2212c","quyKMA2212d"));
       accs.accountlist.add(new User("boyqb2212e","quyKMA2212f"));
       accs.accountlist.add(new User("boyqb2212g","quyKMA2212h"));
       accs.accountlist.add(new User("boyqb2212i","quyKMA2212k"));
       accs.accountlist.add(new User("boyqb2212l","quyKMA2212m"));
       
       
        
        giaodien n=new giaodien();
        n.setVisible(true);
    }
    
}
