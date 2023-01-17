package com.example.demo.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.io.entity.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long> {

}
