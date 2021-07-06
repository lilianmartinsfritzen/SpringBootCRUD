package com.lilianmfritzen.activitycrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lilianmfritzen.activitycrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
