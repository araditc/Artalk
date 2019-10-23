package com.araditc.artalkcore;

import android.content.Context;

import com.araditc.artalkcore.interfase.IMessage;
import com.araditc.artalkcore.model.Message;
import com.google.firebase.FirebaseApp;

public class Artalk {

    private static Artalk instance;

    private static IMessage iMessage;

    public Artalk() {

    }

    public static Artalk getInstance() {
        if (instance == null) {
            instance = new Artalk();
        }
        return instance;
    }

    public static void Initialize(Context context) {
        FirebaseApp.initializeApp(context);
    }

    public static void destroyInstance() {
        instance = null;
    }

    public void setIMessage(IMessage IMessage) {
        iMessage = IMessage;
    }

    public void setMessage(Message message) {
        if (iMessage != null) {
            iMessage.MessageReceive(message);
        }
    }
}
