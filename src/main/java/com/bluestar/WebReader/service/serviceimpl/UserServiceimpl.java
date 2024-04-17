package com.bluestar.WebReader.service.serviceimpl;

import com.bluestar.WebReader.domain.User;
import com.bluestar.WebReader.repository.UserDao;
import com.bluestar.WebReader.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User loginService(String uname, String password) {
        // 如果账号密码都对则返回登录的用户对象，若有一个错误则返回null
        User user = userDao.findByUnameAndPassword(uname,password);
        if(user!=null){
            //清空密码不做返回
            user.setPassword("");
        }
        return user;
    }

    @Override
    public User registService(User user) {
        if(userDao.findByUname(user.getUname())!=null){
            return null;
        }else{
            User newUser = userDao.save(user);
            if(newUser != null){
                newUser.setPassword("");
            }
            return newUser;
        }
    }
}
