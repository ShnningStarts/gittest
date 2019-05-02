package dao;

import java.util.List;

public interface userDao {
    public user findUserById(Long id) throws Exception;
    public List<user> findUserByName(String name) throws Exception;
    public void insterUser(user U) throws Exception;


}
