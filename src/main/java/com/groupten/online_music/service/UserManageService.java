package com.groupten.online_music.service;

import com.groupten.online_music.dao.impl.IUserDao;
import com.groupten.online_music.entity.User;
import com.groupten.online_music.service.impl.IUserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserManageService extends UserService implements IUserManageService {
    @Autowired
    IUserDao userDao;

    /**
     * 根据用户id删除用户
     *
     * @param user 用户
     * @return
     */
    @Transactional
    public boolean delete(User user) {
        userDao.delete(user);
        return true;
    }

    /**
     * 查找所有用户
     *
     * @return 返回所有用户
     */
    @Override
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    /**
     * 根据多个id一次查询多个用户
     *
     * @param ids 多个用户id
     * @return 返回用户数据集合
     */
    @Override
    public List<User> findAllByIds(List<Integer> ids) {
        return (List<User>) userDao.findAllById(ids);
    }

    /**
     * 分页查找用户
     *
     * @param pageable 分页条件
     * @return 返回一页用户数据
     */
    @Override
    public Page<User> findAll(Pageable pageable) {
        return userDao.findAll(pageable);
    }
}
