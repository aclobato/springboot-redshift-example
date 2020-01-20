package com.example.redshift.repository;


import com.example.redshift.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    Iterable<User> findByFirstName(String firstName);
}
