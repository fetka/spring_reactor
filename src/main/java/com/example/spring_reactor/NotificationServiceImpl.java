package com.example.spring_reactor;

import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

  @Override
  public void initiateNotification(NotificationData notificationData)
      throws InterruptedException {

    System.out.println("Notification service started for "
        + "Notification ID: " + notificationData.getId());
    /* This line must be commented in when testing, and commented out when running the application. */
//    Thread.sleep(5000);

    System.out.println("Notification service ended for "
        + "Notification ID: " + notificationData.getId());
  }
}
