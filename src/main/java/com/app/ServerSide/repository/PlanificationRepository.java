package com.app.ServerSide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ServerSide.modal.entities.Planification;

@Repository
public interface PlanificationRepository extends JpaRepository<Planification, Long>{

}
