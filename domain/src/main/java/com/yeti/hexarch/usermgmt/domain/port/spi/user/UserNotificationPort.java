package com.yeti.hexarch.usermgmt.domain.port.spi.user;

import com.yeti.hexarch.usermgmt.domain.model.notification.NotificationDomainModel;

public interface UserNotificationPort {
    
    /*
     * Sends notification (email/sms) to the user
     */
    boolean send(NotificationDomainModel notificationDomainModel);

}
