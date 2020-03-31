
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class frameutama extends JFrame {
    public frameutama(){
        this.setSize(200,200);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void tampil(){
        this.setVisible(true);
    }
    
    public void tampil(String name){
        this.setTitle(name);
        this.setVisible(true);
    }
    
}
