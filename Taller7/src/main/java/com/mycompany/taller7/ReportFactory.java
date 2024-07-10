/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class ReportFactory {
    public ReportInterface createReport(String type) {
        switch (type) {
            case "PDF":
                return new PDFReport();
            case "Excel":
                return new ExcelReport();
            case "Word":
                return new WordReport();
            default:
                throw new IllegalArgumentException("Unknown report type");
        }
    }
}
