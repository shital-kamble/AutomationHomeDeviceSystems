package Automation;

class SmartCamera extends AbstractSmartDevice implements ISmartCamera {
    private boolean isRecording;

    public SmartCamera(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println(deviceName + " is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(deviceName + " is turned off.");
    }

    @Override
    public void record() {
        isRecording = true;
        System.out.println(deviceName + " is recording.");
    }

    @Override
    public void stopRecording() {
        isRecording = false;
        System.out.println(deviceName + " stopped recording.");
    }
}
