package com.O2S.FinanceClient.Repositories;

import com.O2S.FinanceClient.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
        Optional<User> findByEmail(String username);
        }
