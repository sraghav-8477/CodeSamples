/**
 * 
 */
package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entities.Users;
import com.services.UserServices;

/**
 * @author user
 *
 */
@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	UserDao userDao;
	
	public List<Users> listOfUsers() {
		
		return userDao.listOfUsers();
	}

	public boolean delete(Users users) {
		
		return userDao.delete(users);
	}

	public boolean saveOrUpdate(Users users) {
		
		return userDao.saveOrUpdate(users);
	}

}
