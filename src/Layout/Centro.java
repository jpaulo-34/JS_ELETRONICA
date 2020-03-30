/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import Views.Form_Tecnico;

import javax.swing.JPanel;

/**
 *
 * @author 201816810
 */
public class Centro extends JPanel {
    public Centro(){
       
        add(new Form_Tecnico());
    }
}
