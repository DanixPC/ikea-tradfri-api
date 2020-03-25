package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Light;

/**
 * The class that represents a light event that occurred to an IKEA TRÅDFRI light
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class LightEvent extends DeviceEvent {

    /**
     * Construct the LightEvent class
     * @param light The light for which the event occurred
     * @since 1.0.0
     */
    public LightEvent(Light light) {
        super(light);
    }

    /**
     * Get the light for which the event occurred
     * @return The light for which the event occurred
     * @since 1.0.0
     */
    public Light getLight(){
        return (Light) getDevice();
    }

}
