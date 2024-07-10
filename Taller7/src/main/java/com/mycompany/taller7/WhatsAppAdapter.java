/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class WhatsAppAdapter  implements NotificationService {
    private WhatsAppService whatsAppService;

    public WhatsAppAdapter(WhatsAppService whatsAppService) {
        this.whatsAppService = whatsAppService;
    }

    public void sendNotification(String message) {
        whatsAppService.sendWhatsAppMessage(message);
    }
}

