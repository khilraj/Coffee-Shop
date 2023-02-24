package com.system.coffee_shop.repo;

import com.system.coffee_shop.entity.EmailCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmailCredRepo extends JpaRepository<EmailCredentials, Long> {

    @Query(value = "select * from email_credentials where active=true ORDER BY date desc limit 1", nativeQuery = true)
    EmailCredentials findOneByActive();
}
