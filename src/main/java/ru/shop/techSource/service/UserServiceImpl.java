package ru.shop.techSource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.shop.techSource.entity.Role;
import ru.shop.techSource.entity.User;
import ru.shop.techSource.repository.RoleDao;
import ru.shop.techSource.repository.UserDao;

import java.util.HashSet;
import java.util.Set;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    public RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
