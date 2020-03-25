package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Light;
import nl.stijngroenen.tradfri.device.LightProperties;

/**
 * The class that represents a light changed event that occurred to an IKEA TRÅDFRI light
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class LightChangeEvent extends LightEvent {

    /**
     * The old properties of the light (from before the event occurred)
     */
    private LightProperties oldProperties;

    /**
     * The new properties of the light (from after the event occurred)
     */
    private LightProperties newProperties;

    /**
     * Construct the LightChangeEvent class
     * @param light The light for which the event occurred
     * @param oldProperties The old properties of the light (from before the event occurred)
     * @param newProperties The new properties of the light (from after the event occurred)
     * @since 1.0.0
     */
    public LightChangeEvent(Light light, LightProperties oldProperties, LightProperties newProperties) {
        super(light);
        this.oldProperties = oldProperties;
        this.newProperties = newProperties;
    }

    /**
     * Get the old properties of the light (from before the event occurred)
     * @return The old properties of the light
     * @since 1.0.0
     */
    public LightProperties getOldProperties(){
        return oldProperties;
    }

    /**
     * Get the new properties of the light (from after the event occurred)
     * @return The new properties of the light
     * @since 1.0.0
     */
    public LightProperties getNewProperties(){
        return newProperties;
    }

}
