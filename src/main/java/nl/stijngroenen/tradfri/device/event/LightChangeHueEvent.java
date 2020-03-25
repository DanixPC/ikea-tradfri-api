package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Light;
import nl.stijngroenen.tradfri.device.LightProperties;

/**
 * The class that represents a light hue changed event that occurred to an IKEA TRÅDFRI light
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class LightChangeHueEvent extends LightChangeEvent {

    /**
     * Construct the LightChangeHueEvent class
     * @param light The light for which the event occurred
     * @param oldProperties The old properties of the light (from before the event occurred)
     * @param newProperties The new properties of the light (from after the event occurred)
     * @since 1.0.0
     */
    public LightChangeHueEvent(Light light, LightProperties oldProperties, LightProperties newProperties) {
        super(light, oldProperties, newProperties);
    }

    /**
     * Get the old hue of the light (from before the event occurred)
     * @return The old hue of the light
     * @since 1.0.0
     */
    public int getOldHue(){
        return getOldProperties().getHue();
    }

    /**
     * Get the new hue of the light (from after the event occurred)
     * @return The new hue of the light
     * @since 1.0.0
     */
    public int getNewHue(){
        return getNewProperties().getHue();
    }

}
