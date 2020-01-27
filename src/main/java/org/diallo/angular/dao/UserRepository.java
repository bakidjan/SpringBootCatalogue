package org.diallo.angular.dao;

import org.diallo.angular.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
    public User findOneByEmail(String email);
    public User findOneById(Long ID);
}
