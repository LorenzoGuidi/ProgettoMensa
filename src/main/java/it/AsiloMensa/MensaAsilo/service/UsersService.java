package it.AsiloMensa.MensaAsilo.service;


import it.AsiloMensa.MensaAsilo.model.UsersModel;
import it.AsiloMensa.MensaAsilo.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String password, String email){
        if (login == null && password == null) {
            return null;
        } else {

            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            return usersRepository.save(usersModel);
        }

    }

}
