package org.itachi.repository;

import org.itachi.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by itachi on 2017/9/11.
 * User: itachi
 * Date: 2017/9/11
 * Time: 09:10
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {
}

