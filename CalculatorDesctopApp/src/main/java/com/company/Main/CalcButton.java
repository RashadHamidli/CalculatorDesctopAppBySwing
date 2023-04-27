/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.Main;

import javax.swing.JButton;

public class CalcButton {

    JButton jButton;
    String name;
    int type;
    String display;
    int pref;
    //static final String[] typeTab = {"number", "unaryOp", "binaryOp", "varConst", "cmnd", "pm", "decPoint"};

    public CalcButton() {
    }

    public CalcButton(JButton jButton, String name, int type, String display, int pref) {
        this.name = name;
        this.type = type;
        this.display = display;
        this.jButton = jButton;
        this.pref = pref;
    }

    boolean isNumber() {
        return type == 0;
    }

    boolean isUnaryOp() {
        return type == 1;
    }

    boolean isBinaryOp() {
        return type == 2;
    }

    boolean isVarConst() {
        return type == 3;
    }

    boolean isCmnd() {
        return type == 4;
    }

    boolean isPM() {
        return type == 5;
    }

    boolean isDecPoint() {
        return type == 6;
    }
    
    boolean isDelete(){
        return name.equals("delete");
    }
}
