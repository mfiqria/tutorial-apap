package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.model.UserModel;

public interface UserService {
    UserModel addUser(UserModel user);
    UserModel getUserByUsername(String username);
    UserModel changePassword(UserModel user, String password);
    public String encrypt(String password);
}
