/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class FacebookAdapter  extends WhatsAppNotification {
    @Override
    public void notify(String message){
        System.out.println("Sending WhatsApp message: " + message);
    }
}
