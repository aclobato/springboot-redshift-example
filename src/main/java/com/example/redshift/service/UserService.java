package com.example.redshift.service;

import java.util.List;

public interface UserService {
    public List<String> listGloriasCompleteNames();

    public List<String> listByFirstName(String firstName);
}
