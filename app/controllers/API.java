/**
 * 
 */
package controllers;

import java.util.List;

import models.Event;
import models.Speaker;
import play.mvc.Controller;

/**
 * A dedicated controller for all the API related stuff
 * 
 * @author chamerling
 *
 */
public class API extends Controller {

    public static void listEvents() {
    	List<Event> events = Event.allByDate();
    	if (request.format.equals("json")) {
    		renderJSON(events);
    	}
    	render(events);
    }
    
    public static void listMembers() {
    	List<Speaker> members = Speaker.getMembers();
    	if (request.format.equals("json")) {
    		renderJSON(members);
    	}
    	render(members);
    }
}