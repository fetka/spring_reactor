package com.example.spring_reactor;

public interface NotificationService {

  void initiateNotification(NotificationData notificationData)
      throws InterruptedException;
}
