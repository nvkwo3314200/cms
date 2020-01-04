package com.peak.cms.repo;


import com.peak.cms.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application.yml")
public class UserRepo {
    @Autowired
    UserRepository repository;

    @Test
    public void testCreate() {
        UserEntity userEntity = new UserEntity("张大哥", 1);
        repository.save(userEntity);
        System.out.println(userEntity); // 返回Id
        userEntity.setName("王五");
        repository.save(userEntity);
        System.out.println(repository.existsById(userEntity.getId()));
        System.out.println(repository.findById(userEntity.getId()));

    }

    @Test
    public void testQuery() {
        /*List<UserEntity> list = repository.findAllBySexEquals(1);
        list.forEach(item -> System.out.println(item));*/
        UserEntity query = new UserEntity("%大%", 1);
        List<UserEntity> list2 = repository.findAllByNameLikeAndSexEqualsOrderByIdDesc("%大%", 1);
        list2.forEach(item -> System.out.println(item));
    }

}
