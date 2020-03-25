package nl.stijngroenen.tradfri.device.event;

import nl.stijngroenen.tradfri.device.Plug;
import nl.stijngroenen.tradfri.device.PlugProperties;

/**
 * The class that represents a change event that occurred to an IKEA TRÅDFRI plug
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class PlugChangeEvent extends PlugEvent {

    /**
     * The old properties of the plug (from before the event occurred)
     */
    private PlugProperties oldProperties;

    /**
     * The new properties of the plug (from after the event occurred)
     */
    private PlugProperties newProperties;

    /**
     * Construct the PlugChangeEvent class
     * @param plug The plug for which the event occurred
     * @param oldProperties The old properties of the plug (from before the event occurred)
     * @param newProperties The new properties of the plug (from after the event occurred)
     * @since 1.0.0
     */
    public PlugChangeEvent(Plug plug, PlugProperties oldProperties, PlugProperties newProperties) {
        super(plug);
        this.oldProperties = oldProperties;
        this.newProperties = newProperties;
    }

    /**
     * Get the old properties of the plug (from before the event occurred)
     * @return The old properties of the plug
     * @since 1.0.0
     */
    public PlugProperties getOldProperties(){
        return oldProperties;
    }

    /**
     * Get the new properties of the plug (from after the event occurred)
     * @return The new properties of the plug
     * @since 1.0.0
     */
    public PlugProperties getNewProperties(){
        return newProperties;
    }

}
