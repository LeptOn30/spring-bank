package com.dgw.backend.notification.services;

import com.dgw.backend.auth_users.entity.User;
import com.dgw.backend.notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}
