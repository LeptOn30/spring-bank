package com.dgw.backend.auth_users.services;

import com.dgw.backend.auth_users.dtos.UpdatePasswordRequest;
import com.dgw.backend.auth_users.dtos.UserDTO;
import com.dgw.backend.auth_users.entity.User;
import com.dgw.backend.res.Response;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;


public interface UserService {

    User getCurrentLoggedInUser();

    Response<UserDTO> getMyProfile();

    Response<Page<UserDTO>> getAllUsers(int page, int size);

    Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest);

    Response<?> uploadProfilePicture(MultipartFile file);

    Response<?> uploadProfilePictureToS3(MultipartFile file);

}
