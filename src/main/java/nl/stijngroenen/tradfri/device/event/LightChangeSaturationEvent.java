package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Light;
import nl.stijngroenen.tradfri.device.LightProperties;

/**
 * The class that represents a light saturation changed event that occurred to an IKEA TRÅDFRI light
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class LightChangeSaturationEvent extends LightChangeEvent {

    /**
     * Construct the LightChangeSaturationEvent class
     * @param light The light for which the event occurred
     * @param oldProperties The old properties of the light (from before the event occurred)
     * @param newProperties The new properties of the light (from after the event occurred)
     * @since 1.0.0
     */
    public LightChangeSaturationEvent(Light light, LightProperties oldProperties, LightProperties newProperties) {
        super(light, oldProperties, newProperties);
    }

    /**
     * Get the old saturation of the light (from before the event occurred)
     * @return The old saturation of the light
     * @since 1.0.0
     */
    public int getOldSaturation(){
        return getOldProperties().getSaturation();
    }

    /**
     * Get the new saturation of the light (from after the event occurred)
     * @return The new saturation of the light
     * @since 1.0.0
     */
    public int getNewSaturation(){
        return getNewProperties().getSaturation();
    }

}
