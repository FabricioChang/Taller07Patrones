/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class TelegramAdapter  implements NotificationService {
    private TelegramService telegramService;

    public TelegramAdapter(TelegramService telegramService) {
        this.telegramService = telegramService;
    }

    public void sendNotification(String message) {
        telegramService.sendTelegramMessage(message);
    }
}

