/**
 * 
 */
package com.dao;

import java.util.List;
import com.entities.Users;

/**
 * @author user
 *
 */
public interface UserDao {
	public List<Users> listOfUsers();
	public boolean delete(Users users);
	public boolean saveOrUpdate(Users users);

}
