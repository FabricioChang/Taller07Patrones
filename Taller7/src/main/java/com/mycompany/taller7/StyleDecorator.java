/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class StyleDecorator extends ReportDecorator {
    public StyleDecorator(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generate() {
        decoratedReport.generate();
        addStyle();
    }

    private void addStyle() {
        System.out.println("Adding Style to Report");
    }
}

