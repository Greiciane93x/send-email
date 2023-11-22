package com.msemail.email.repositories;

import com.msemail.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
