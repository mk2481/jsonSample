
package com.example.kouta.jsonsample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Json {

    private int resultsReturned;
    private List<Event> events = new ArrayList<Event>();
    private int resultsStart;
    private int resultsAvailable;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The resultsReturned
     */
    public int getResultsReturned() {
        return resultsReturned;
    }

    /**
     * 
     * @param resultsReturned
     *     The results_returned
     */
    public void setResultsReturned(int resultsReturned) {
        this.resultsReturned = resultsReturned;
    }

    /**
     * 
     * @return
     *     The events
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    /**
     * 
     * @return
     *     The resultsStart
     */
    public int getResultsStart() {
        return resultsStart;
    }

    /**
     * 
     * @param resultsStart
     *     The results_start
     */
    public void setResultsStart(int resultsStart) {
        this.resultsStart = resultsStart;
    }

    /**
     * 
     * @return
     *     The resultsAvailable
     */
    public int getResultsAvailable() {
        return resultsAvailable;
    }

    /**
     * 
     * @param resultsAvailable
     *     The results_available
     */
    public void setResultsAvailable(int resultsAvailable) {
        this.resultsAvailable = resultsAvailable;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
