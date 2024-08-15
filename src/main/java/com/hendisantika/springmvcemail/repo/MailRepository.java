package com.hendisantika.springmvcemail.repo;

import com.hendisantika.springmvcemail.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Long> {

}
