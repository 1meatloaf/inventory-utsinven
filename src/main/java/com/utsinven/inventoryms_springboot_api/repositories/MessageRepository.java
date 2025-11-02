package com.utsinven.inventoryms_springboot_api.repositories;

import com.utsinven.inventoryms_springboot_api.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
