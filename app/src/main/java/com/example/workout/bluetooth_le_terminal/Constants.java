package com.example.workout.bluetooth_le_terminal;

class Constants {

    // values have to be globally unique
    static final String INTENT_ACTION_DISCONNECT = "com.example.workout.bluetooth_le_terminal.Disconnect";
    static final String NOTIFICATION_CHANNEL = "com.example.workout.bluetooth_le_terminal.Channel";
    static final String INTENT_CLASS_BLUETOOTH_ACTIVITY = "com.example.workout.bluetooth_le_terminal.BluetoothActivity";

    // values have to be unique within each app
    static final int NOTIFY_MANAGER_START_FOREGROUND_SERVICE = 1001;

    private Constants() {}
}
