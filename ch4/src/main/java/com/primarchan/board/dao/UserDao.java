package com.primarchan.board.dao;

import com.primarchan.board.domain.*;
import com.primarchan.board.domain.User;

public interface UserDao {
    User selectUser(String id) throws Exception;
    int deleteUser(String id) throws Exception;
    int insertUser(User user) throws Exception;
    int updateUser(User user) throws Exception;
    int count() throws Exception;
    void deleteAll() throws Exception;
}

