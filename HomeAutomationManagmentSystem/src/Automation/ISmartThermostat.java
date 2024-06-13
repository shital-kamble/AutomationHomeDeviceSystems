package Automation;


interface ISmartThermostat {
    
	void turnOn();
    
	void turnOff();
    
	void setTemperature(double temperature);
    
	double getTemperature();
}