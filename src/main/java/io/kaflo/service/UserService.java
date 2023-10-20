package io.kaflo.service;

import io.kaflo.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
