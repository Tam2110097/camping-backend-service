package vn.tamnguyen.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.tamnguyen.service.EmailService;

import java.io.IOException;

@RestController
@RequestMapping("/email")
@Tag(name = "Email Controller")
@RequiredArgsConstructor
@Slf4j(topic = "EMAIL-CONTROLLER")
public class EmailController {

    private final EmailService emailService;

    @Operation(summary = "Send email", description = "API send a plain-text email to a recipient")
    @GetMapping("/send-email")
    public void send(@RequestParam String to, @RequestParam String subject, @RequestParam String content) {
        log.info("Sending email to {}", to);
        emailService.send(to, subject, content);
        log.info("Email sent");
    }

    @Operation(summary = "Verify email", description = "API send an account verification email using a SendGrid dynamic template")
    @GetMapping("/verify-email")
    public void emailVerification(@RequestParam String to, @RequestParam String name) throws IOException {
        log.info("Verifying email to {}", to);
        emailService.emailVerification(to, name);
        log.info("Verifying sent");
    }
}
