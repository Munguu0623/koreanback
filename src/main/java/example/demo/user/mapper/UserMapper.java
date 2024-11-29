package example.demo.user.mapper;  
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import example.demo.user.vo.UserVo;

@Mapper
public interface UserMapper {
    List<UserVo> findAll();
    UserVo findById(int id);
    void insertUser(UserVo user);
    void updateUser(UserVo user);
    void deleteUser(int id);
}
