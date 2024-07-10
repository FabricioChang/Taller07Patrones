/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7;

/**
 *
 * @author CltControl
 */
public class EmailAdapter implements NotificationService {
    private EmailService emailService;

    public EmailAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}
