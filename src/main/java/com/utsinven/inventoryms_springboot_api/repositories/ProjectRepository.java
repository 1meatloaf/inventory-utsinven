package com.utsinven.inventoryms_springboot_api.repositories;

import com.utsinven.inventoryms_springboot_api.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
