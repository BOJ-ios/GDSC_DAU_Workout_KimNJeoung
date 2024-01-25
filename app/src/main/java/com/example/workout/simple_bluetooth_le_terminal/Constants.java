package com.example.workout.simple_bluetooth_le_terminal;

class Constants {

    // values have to be globally unique
    static final String INTENT_ACTION_DISCONNECT = "com.example.workout" + ".Disconnect";
    static final String NOTIFICATION_CHANNEL = "com.example.workout" + ".Channel";
    static final String INTENT_CLASS_MAIN_ACTIVITY = "com.example.workout" + ".MainActivity";

    // values have to be unique within each app
    static final int NOTIFY_MANAGER_START_FOREGROUND_SERVICE = 1001;

    private Constants() {}
}
