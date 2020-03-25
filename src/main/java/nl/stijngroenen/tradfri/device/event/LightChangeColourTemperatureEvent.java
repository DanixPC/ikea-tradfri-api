package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Light;
import nl.stijngroenen.tradfri.device.LightProperties;

/**
 * The class that represents a light colour temperature changed event that occurred to an IKEA TRÅDFRI light
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class LightChangeColourTemperatureEvent extends LightChangeEvent {

    /**
     * Construct the LightChangeColourTemperatureEvent class
     * @param light The light for which the event occurred
     * @param oldProperties The old properties of the light (from before the event occurred)
     * @param newProperties The new properties of the light (from after the event occurred)
     * @since 1.0.0
     */
    public LightChangeColourTemperatureEvent(Light light, LightProperties oldProperties, LightProperties newProperties) {
        super(light, oldProperties, newProperties);
    }

    /**
     * Get the old colour temperature of the light (from before the event occurred)
     * @return The old colour temperature of the light
     * @since 1.0.0
     */
    public int getOldColourTemperature(){
        return getOldProperties().getColourTemperature();
    }

    /**
     * Get the new colour temperature of the light (from after the event occurred)
     * @return The new colour temperature of the light
     * @since 1.0.0
     */
    public int getNewColourTemperature(){
        return getNewProperties().getColourTemperature();
    }

}
