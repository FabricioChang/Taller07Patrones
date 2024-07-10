/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class OtherSocialMediaNotification{
    protected Report decoratedReport;

    public ReportDecorator(Report decoratedReport) {
        this.decoratedReport = decoratedReport;
    }

    @Override
    public void generate() {
        decoratedReport.generate();
    }
}

