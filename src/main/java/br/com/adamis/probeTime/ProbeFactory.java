package br.com.adamis.probeTime;

import java.util.Calendar;

public class ProbeFactory {

	/**
	 * return a new probe
	 *@author F5K5WQI
	 *@return Probe
	 */
	public static Probe probeStart() {		
		return new Probe(System.currentTimeMillis());
	}
	
	
	/**
	 * return date and Hour end probe
	 *@author F5K5WQI	 
	 *@param Probe
	 *@return Probe
	 */
	public static String getProbeEndString(Probe probe) {		
		return Utils.calcTime(true, probe.getStart());
	}
	
	
	public static Probe getProbeEnd(Probe probe) {		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MILLISECOND, Integer.valueOf(probe.getStart().toString()));		
		probe.setEnd(cal.getTime());		
		return probe;
	}
	
}
