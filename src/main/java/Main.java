import java.util.Iterator;

import br.com.adamis.probeTime.Probe;
import br.com.adamis.probeTime.ProbeFactory;

public class Main {

	public static void main(String[] args) {
		
		
		Probe probe = ProbeFactory.probeStart();
		
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			System.err.println(i+"-"+ProbeFactory.getProbeEnd(probe));
		}
		
		System.err.println("END> "+ProbeFactory.getProbeEnd(probe));
		
		
		
	}
	
}
