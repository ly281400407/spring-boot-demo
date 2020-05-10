package com.ly.spring;

import com.ly.spring.entity.User;
import com.ly.spring.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aa", "a123456", 0));
        userMapper.insert(new User("bb", "b123456", 1));
        userMapper.insert(new User("cc", "b123456", 1));

        Assert.assertEquals(3, userMapper.getAll().size());
    }

}
