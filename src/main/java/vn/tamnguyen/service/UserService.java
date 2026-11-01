package vn.tamnguyen.service;

import vn.tamnguyen.controller.request.UserCreationRequest;
import vn.tamnguyen.controller.request.UserPasswordRequest;
import vn.tamnguyen.controller.request.UserUpdateRequest;
import vn.tamnguyen.controller.response.UserPageResponse;
import vn.tamnguyen.controller.response.UserResponse;

import java.util.List;

public interface UserService {

    UserPageResponse findAll(String keyword, String sort, int pageNo, int pageSize);

    UserResponse findById(Long userId);

    UserResponse findByName(String username);

    UserResponse findByEmail(String email);

    long save(UserCreationRequest req);

    void update(UserUpdateRequest req);

    void changePassword(UserPasswordRequest req);

    void delete(Long id);
}
