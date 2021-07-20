package com.xiangji.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiangji.demo.domain.User;
import com.xiangji.demo.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationServiceTests {

    @Autowired
    private IUserService userService;

    @Test
    public void testSelectAll() {
        List<User> user = userService.list();
        user.forEach(System.out::println);
    }


    @Test
    public void testSelect() {
        System.out.println(("----- queryFirstByName method test ------"));
        User user = userService.queryFirstByName("Xiangji");
        System.out.println(user);
    }

    @Test
    public void testPage() {
        // 创建Page对象，参数分别对应当前页和每页显示记录数
        Page<User> page = new Page<>(1, 2);
        // 直接调用公共 Service 的page方法，参数分别对应page对象和wrapper条件
        userService.page(page, null);
        // page.getRecords() 当前查询出来的分页数据集合
        List<User> userList = page.getRecords();
        userList.forEach(System.out::println);
        System.out.println("获取总条数:" + page.getTotal());
        System.out.println("获取当前页码:" + page.getCurrent());
        System.out.println("获取总页码:" + page.getPages());
        System.out.println("获取每页显示的数据条数:" + page.getSize());
        System.out.println("是否有上一页:" + page.hasPrevious());
        System.out.println("是否有下一页:" + page.hasNext());
    }

    @Test
    public void testPageWrapper() {
        // 创建Page对象，参数分别对应当前页和每页显示记录数
        Page<User> page = new Page<>(1, 2);
        // 直接调用公共 Service 的page方法，参数分别对应page对象和wrapper条件
        userService.page(page, new QueryWrapper<User>()
                .between("age", 20, 30));
        // page.getRecords() 当前查询出来的分页数据集合
        List<User> userList = page.getRecords();
        userList.forEach(System.out::println);
    }

    @Test
    public void testRemove() {
        userService.removeById(7);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(6L);
        user.setAge(20);
        userService.updateById(user);
    }


}
