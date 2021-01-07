package com.example.redshift.service;

import com.example.redshift.domain.User;
import com.example.redshift.repository.UserRepository;
import org.graalvm.compiler.serviceprovider.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<String> listGloriasCompleteNames()
    {
        return listByFirstName("Gloria");
    }

    @Override
    public List<String> listByFirstName(String firstName) {
        List<String> result = new ArrayList<>();
        userRepository.findByFirstName(firstName).forEach(user -> result.add(user.getFirstName() + " " + user.getLastName()));
        return result;
    }
}
