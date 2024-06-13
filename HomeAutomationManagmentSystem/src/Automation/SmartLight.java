package Automation;

class SmartLight extends AbstractSmartDevice implements ISmartLight {
    private int brightness;
    private String color;

    public SmartLight(String deviceId, String deviceName) {
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
    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println(deviceName + " brightness set to " + level);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println(deviceName + " color set to " + color);
    }
}

class SmartThermostat extends AbstractSmartDevice implements ISmartThermostat {
    private double temperature;

    public SmartThermostat(String deviceId, String deviceName) {
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
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println(deviceName + " temperature set to " + temperature);
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}

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
