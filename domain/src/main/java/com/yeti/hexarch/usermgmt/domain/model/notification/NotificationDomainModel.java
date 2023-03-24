package com.yeti.hexarch.usermgmt.domain.model.notification;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationDomainModel {
    
    private String notificationId;
    private String notificationType;
    private String notificationFrom;
    private String notificationTo;
    private String subject;
    private String message;

}
