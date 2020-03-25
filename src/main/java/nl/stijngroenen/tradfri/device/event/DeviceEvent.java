package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Device;

/**
 * The class that represents a device event that occurred to an IKEA TRÅDFRI device
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class DeviceEvent {

    /**
     * The device for which the event occurred
     */
    private Device device;

    /**
     * Construct the DeviceEvent class
     * @param device The device for which the event occurred
     * @since 1.0.0
     */
    public DeviceEvent(Device device) {
        this.device = device;
    }

    /**
     * Get the device for which the event occurred
     * @return The device for which the event occurred
     * @since 1.0.0
     */
    public Device getDevice(){
        return this.device;
    }

}
