package com.pairlearning.expensetracker.repositories;

import com.pairlearning.expensetracker.domain.User;
import com.pairlearning.expensetracker.exceptions.EtAuthException;

public interface UserRepository {

    Integer createUser(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByUser(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);     //check if the email is already in use

    User findById(Integer userId);

}
