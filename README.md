 ### Traffic Management System

This project presents a basic implementation of a Traffic Management System in Java. The system includes functionalities to manage traffic signals and their statuses.

### Features:

- **TrafficSignal Class:** Represents a traffic signal with properties like signal ID and status.
- **Vehicle Class:** Represents a vehicle with properties like registration number and vehicle type.
- **TrafficManagementSystem Class:** Manages traffic signals and provides methods to add signals, update their statuses, and retrieve statuses.

### Usage:

1. **Adding Traffic Signals:** Use the `addTrafficSignal` method of the `TrafficManagementSystem` class to add new traffic signals.
    
    ```java
    trafficManagementSystem.addTrafficSignal("S1");
    trafficManagementSystem.addTrafficSignal("S2");
    
    ```
    
2. **Updating Traffic Signal Status:** Use the `updateTrafficSignalStatus` method of the `TrafficManagementSystem` class to update the status of a traffic signal.
    
    ```java
    trafficManagementSystem.updateTrafficSignalStatus("S1", "GREEN");
    trafficManagementSystem.updateTrafficSignalStatus("S2", "RED");
    
    ```
    
3. **Retrieving Traffic Signal Status:** Use the `getTrafficSignalStatus` method of the `TrafficManagementSystem` class to retrieve the status of a traffic signal.
    
    ```java
    String statusS1 = trafficManagementSystem.getTrafficSignalStatus("S1");
    String statusS2 = trafficManagementSystem.getTrafficSignalStatus("S2");
    
    ```
    

### Further Enhancements:

- Implement vehicle management functionalities.
- Develop traffic flow optimization algorithms.
- Create a graphical user interface (GUI) for visualization.
- Integrate real-time data from traffic sensors.
- Implement remote control of traffic signals.
