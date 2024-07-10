/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class FontFeatures extends ReportDecorator {
    public FontFeatures(Report decoratedReport) {
        super(decoratedReport);
    }
    
    @Override
    public void generate() {
        decoratedReport.generate();
        changeFont();
    }

    private void changeFont() {
        System.out.println("Changing Font of Report");
    }
}



