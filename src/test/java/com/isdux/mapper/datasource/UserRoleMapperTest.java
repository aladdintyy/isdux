package com.isdux.mapper.datasource;

import com.isdux.model.datasource.UserRole;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRoleMapperTest {

	@Autowired(required=false)
	private UserRoleMapper userRoleMapper;

	@Test
	public void testInsert() throws Exception {
		userRoleMapper.insert(new UserRole("1", "名字1", "描述内容1", "1", 1));
		userRoleMapper.insert(new UserRole("2", "名字2", "描述内容2", "1", 1));
		userRoleMapper.insert(new UserRole("3", "名字3", "描述内容2", "1", 1));

		Assert.assertEquals(3, userRoleMapper.countByExample(null));
	}
//
//	@Test
//	public void testQuery() throws Exception {
//		List<User> users = UserRoleMapper.getAll();
//		if(users==null || users.size()==0){
//			System.out.println("is null");
//		}else{
//			System.out.println(users.size());
//		}
//	}
//
//
//	@Test
//	public void testUpdate() throws Exception {
//		User user = UserRoleMapper.getOne(6l);
//		System.out.println(user.toString());
//		user.setNickName("neo");
//		UserRoleMapper.update(user);
//		Assert.assertTrue(("neo".equals(userMapper.getOne(6l).getNickName())));
//	}

}