/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitysoftware;

import UI.*;
import java.util.ArrayList;

/**
 *
 * @author 018639476
 */
public class UniversitySoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBmaker dbMaker = new DBmaker();
        dbMaker.makeDatabase();
        // TODO code application logic here
        StartWin startWin = new StartWin();
        startWin.setVisible(true);

    }
    
}
