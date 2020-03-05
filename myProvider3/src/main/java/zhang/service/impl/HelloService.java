package zhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import zhang.entity.User;
import zhang.mapper.UserMapper;
import zhang.service.IHelloService;

import java.util.List;


@Service
@CacheConfig(cacheNames="users")
public class HelloService implements IHelloService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {

        return userMapper.selectById() ;
    }
}
