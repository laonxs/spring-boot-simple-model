package cn.laonxs.mapper;

import cn.laonxs.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * User模块的Mapper
 *
 * @author ade
 * @version 1.0，2020-05-17 17:09:00
 */
@Mapper
public interface UserMapper {

    List<User> findUserList();

}
