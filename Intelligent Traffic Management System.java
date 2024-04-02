import java.util.*;

// Class representing a vehicle
class Vehicle {
    private String registrationNumber;
    private String vehicleType;

    public Vehicle(String registrationNumber, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    // Getters and setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}

// Class representing a traffic signal
class TrafficSignal {
    private String signalId;
    private String status;

    public TrafficSignal(String signalId) {
        this.signalId = signalId;
        this.status = "RED"; // Default status
    }

    // Getters and setters
    public String getSignalId() {
        return signalId;
    }

    public void setSignalId(String signalId) {
        this.signalId = signalId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// Class representing the traffic management system
class TrafficManagementSystem {
    private Map<String, TrafficSignal> trafficSignals;

    public TrafficManagementSystem() {
        this.trafficSignals = new HashMap<>();
    }

    // Method to add a new traffic signal
    public void addTrafficSignal(String signalId) {
        trafficSignals.put(signalId, new TrafficSignal(signalId));
    }

    // Method to update the status of a traffic signal
    public void updateTrafficSignalStatus(String signalId, String status) {
        TrafficSignal signal = trafficSignals.get(signalId);
        if (signal != null) {
            signal.setStatus(status);
        } else {
            System.out.println("Traffic signal with ID " + signalId + " does not exist.");
        }
    }

    // Method to get the status of a traffic signal
    public String getTrafficSignalStatus(String signalId) {
        TrafficSignal signal = trafficSignals.get(signalId);
        if (signal != null) {
            return signal.getStatus();
        } else {
            return "Traffic signal with ID " + signalId + " does not exist.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the traffic management system
        TrafficManagementSystem trafficManagementSystem = new TrafficManagementSystem();

        // Adding traffic signals
        trafficManagementSystem.addTrafficSignal("S1");
        trafficManagementSystem.addTrafficSignal("S2");

        // Updating status of traffic signals
        trafficManagementSystem.updateTrafficSignalStatus("S1", "GREEN");
        trafficManagementSystem.updateTrafficSignalStatus("S2", "RED");

        // Retrieving status of traffic signals
        System.out.println("Status of Signal S1: " + trafficManagementSystem.getTrafficSignalStatus("S1"));
        System.out.println("Status of Signal S2: " + trafficManagementSystem.getTrafficSignalStatus("S2"));
    }
}
