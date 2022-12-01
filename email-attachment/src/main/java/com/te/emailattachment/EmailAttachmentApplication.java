package com.te.emailattachment;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailAttachmentApplication {
	
	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailAttachmentApplication.class, args);
		
	}
		@EventListener(ApplicationReadyEvent.class)
		public void triggerEmail() throws MessagingException {
			emailSenderService.sendMailWithAttachment("patilhrushikesh525@gmail.com",
					                                  "This is body", 
					                                  "The email with attachment",
					                                  "C:\\Users\\manda\\OneDrive\\Documents\\ass1.txt");
		}
	

}
