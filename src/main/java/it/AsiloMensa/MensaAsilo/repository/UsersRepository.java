package it.AsiloMensa.MensaAsilo.repository;

import it.AsiloMensa.MensaAsilo.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel,Integer> {

    @Override
    Optional<UsersModel> findByLoginAndPassword(String login, String password);


}
