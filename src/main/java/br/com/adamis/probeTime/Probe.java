package br.com.adamis.probeTime;
import java.util.Date;

public class Probe {

	private Long start;
	private Date end;
	
	public Probe(Long start) {
		this.start = start;
	}

	public Date getEnd() throws Exception {
		if(end == null) {
			throw new Exception("Call ProbeFactory end method!");
		}
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Long getStart() {
		return start;
	}

	
}
