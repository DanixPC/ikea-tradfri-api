package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Light;
import nl.stijngroenen.tradfri.device.LightProperties;

/**
 * The class that represents a light on / off state changed event that occurred to an IKEA TRÅDFRI light
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class LightChangeOnEvent extends LightChangeEvent {

    /**
     * Construct the LightChangeOnEvent class
     * @param light The light for which the event occurred
     * @param oldProperties The old properties of the light (from before the event occurred)
     * @param newProperties The new properties of the light (from after the event occurred)
     * @since 1.0.0
     */
    public LightChangeOnEvent(Light light, LightProperties oldProperties, LightProperties newProperties) {
        super(light, oldProperties, newProperties);
    }

    /**
     * Get the old on / off state of the light (from before the event occurred)
     * @return The old on / off state of the light (true for on, false for off)
     * @since 1.0.0
     */
    public boolean getOldOn(){
        return getOldProperties().getOn();
    }

    /**
     * Get the new on / off state of the light (from after the event occurred)
     * @return The new on / off state of the light (true for on, false for off)
     * @since 1.0.0
     */
    public boolean getNewOn(){
        return getNewProperties().getOn();
    }

}
