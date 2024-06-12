package com.siseko.ecommerce.repository;

import com.siseko.ecommerce.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
