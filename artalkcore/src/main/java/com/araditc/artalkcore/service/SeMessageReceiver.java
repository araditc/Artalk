package com.araditc.artalkcore.service;


import com.araditc.artalkcore.Artalk;
import com.araditc.artalkcore.model.Message;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Objects;

public class SeMessageReceiver extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getData().size() > 0) {
            Message message = new Message();
            message.CheckId = remoteMessage.getData().get("CheckId");
            message.Title = remoteMessage.getData().get("Title");
            message.Content = remoteMessage.getData().get("Content");
            message.Photo = remoteMessage.getData().get("Photo");
            message.Data = Objects.requireNonNull(remoteMessage.getData().get("Data"));
            Artalk.getInstance().setMessage(message);
        }
    }
}
