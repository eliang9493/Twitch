package com.laioffer.jupiter.service;

import com.laioffer.jupiter.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public String verifyLogin(String userId, String password) throws IOException {
        return loginDao.verifyLogin(userId, password);
    }
}
