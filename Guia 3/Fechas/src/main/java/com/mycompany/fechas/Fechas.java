/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fechas;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Fechas {
    
    public static void main(String[] args) {
        int dd = 0, mm = 0, aa = 0;
        Fecha F = new Fecha();
        do {
            dd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Dia: "));
            mm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Mes: "));
            do {
                aa = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Año desde 1963: "));
            } while (aa < 1963);
            try {
                F.comprobar(dd, mm, aa);
            } catch (ExceptoFecha e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                dd = mm = aa = 0;
            }
        } while (dd == 0 && mm == 0 && aa == 0);
        System.exit(0);
    }
    
}
