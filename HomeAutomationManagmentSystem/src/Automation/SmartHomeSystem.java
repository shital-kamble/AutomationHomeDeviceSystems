package Automation;

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController(10);

        SmartLight livingRoomLight = new SmartLight("1", "Living Room Light");
        SmartThermostat mainThermostat = new SmartThermostat("2", "Main Thermostat");
        SmartCamera securityCamera = new SmartCamera("3", "Security Camera");

        controller.addDevice(livingRoomLight);
        controller.addDevice(mainThermostat);
        controller.addDevice(securityCamera);

        controller.turnAllOn();
        livingRoomLight.setBrightness(75);
        livingRoomLight.setColor("Warm White");
        mainThermostat.setTemperature(22.5);
        securityCamera.record();

        controller.turnAllOff();
    }
}
