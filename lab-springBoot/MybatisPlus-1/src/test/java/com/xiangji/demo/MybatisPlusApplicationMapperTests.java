package com.xiangji.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.xiangji.demo.domain.User;
import com.xiangji.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationMapperTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testAdd() {
        System.out.println(("----- add method test ------"));
        User user = new User();
        user.setName("Xiangji");
        user.setAge(18);
        user.setEmail("test6@baomidou.com");
        int i = userMapper.insert(user);
        // i 返回的是插入的条数
        // user.getId() 可以直接获取到插入后的ID值
        System.out.println("return the number added：" + i);
        System.out.println("return the primary key ID：" + user.getId());
    }

    @Test
    public void testOptimisticLock() {
        // A、B管理员读取数据
        User A = userMapper.selectById(6L);
        User B = userMapper.selectById(6L);
        // B管理员先修改
        B.setAge(15);
        int result = userMapper.updateById(B);
        if (result == 1) {
            System.out.println("B管理员修改成功!");
        } else {
            System.out.println("B管理员修改失败!");
        }
        // A管理员后修改
        A.setAge(25);
        int result2 = userMapper.updateById(A);
        if (result2 == 1) {
            System.out.println("A管理员修改成功!");
        } else {
            System.out.println("A管理员修改失败!");
        }
        // 最后查询
        System.out.println(userMapper.selectById(6L));
    }

    @Test
    public void testQueryWrapper() {
        // 查询名字中包含'j'，年龄大于等于18岁及小于等于20岁
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>()
                .like(User::getName, "j")
                .ge(User::getAge, 18)
                .le(User::getAge, 20);
        List<User> list = userMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

    @Test
    public void testUpdateWrapper() {
        // 查询名字中包含'j'，年龄大于等于18岁及小于等于20岁
        UpdateWrapper<User> wrapper = new UpdateWrapper<User>()
                .set("email", "testUpdateWrapper@baomidou.com")
                .like("name", "j")
                .ge("age", 18)
                .le("age", 20);
        userMapper.update(null, wrapper);
    }
}
