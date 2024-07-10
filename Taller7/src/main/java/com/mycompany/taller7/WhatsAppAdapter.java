/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class WhatsAppAdapter  extends Notifications {
    private WhatsAppNotification whatsAppService;

    public WhatsAppAdapter(WhatsAppNotification whatsAppService) {
        this.whatsAppService = whatsAppService;
    }

    public void showNotification() {
        whatsAppService.showWhatsAppMessage();
    }
}

