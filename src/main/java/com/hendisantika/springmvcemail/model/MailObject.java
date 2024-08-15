package com.hendisantika.springmvcemail.model;

import jakarta.mail.Multipart;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


public class MailObject {
    @Email
    @NotNull
    @Size(min = 1)
    private String to;
    private String subject;
    @Column(name = "text", length = 5000)
    private String text;
    private Multipart multipartFile;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date dateOfIssue;



    private LocalDateTime dateTime;

   @PrePersist

   private void init(){
      dateTime=LocalDateTime.now();
   }

    public Multipart getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(Multipart multipartFile) {
        this.multipartFile = multipartFile;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MailObject{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                ", multipartFile=" + multipartFile +
                ", dateOfIssue=" + dateOfIssue +
                '}';
    }
}
