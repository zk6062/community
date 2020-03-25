package zhoukang.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhoukang.community.mapper.UserDao;
import zhoukang.community.model.User;
import zhoukang.community.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao=null;
    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }
}
