package example.demo.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import example.demo.user.mapper.UserMapper;
import example.demo.user.vo.UserVo;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserVo> getAllUsers() {
        return userMapper.findAll();
    }

    public UserVo getUserById(int id) {
        return userMapper.findById(id);
    }

    public void insert(UserVo user) {
        userMapper.insertUser(user); // user-г өгөгдөл багтаасан        
    }

    public void updateUser(UserVo user) {
        userMapper.updateUser(user);
    }   

    public void deleteUser(int id) {
        System.out.println("service id: " + id);
        userMapper.deleteUser(id);
    }   

}
