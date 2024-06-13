package Automation;

class SmartHomeController {
    private AbstractSmartDevice[] devices;
    private int deviceCount;

    public SmartHomeController(int capacity) {
        devices = new AbstractSmartDevice[capacity];
        deviceCount = 0;
    }

    public void addDevice(AbstractSmartDevice device) {
        if (deviceCount < devices.length) {
            devices[deviceCount++] = device;
            System.out.println(device.getDeviceName() + " added to controller.");
        } else {
            System.out.println("Controller capacity full. Cannot add more devices.");
        }
    }

    public void turnAllOn() {
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOn();
        }
    }

    public void turnAllOff() {
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOff();
        }
    }
}
