package it.AsiloMensa.MensaAsilo.repository;

import it.AsiloMensa.MensaAsilo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User,Integer> {


    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
        Optional<User> findByUsername(String username);

        Boolean existsByUsername(String username);

        Boolean existsByEmail(String email);

    }

}
