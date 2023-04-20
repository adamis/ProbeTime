package br.com.adamis.probeTime;

public class Utils {

	public static String calcTime( boolean mili , Long miliStart){

	    miliStart = System.currentTimeMillis() - miliStart;

	    long hours = miliStart / 1000 / 60 / 60;
	    miliStart -= hours * 1000 * 60 * 60;

	    long minutes = miliStart / 1000 / 60;
	    miliStart -= minutes * 1000 * 60;

	    long seconds = miliStart / 1000;
	    miliStart -= seconds * 1000;

	    StringBuffer time = new StringBuffer();
	    if( hours > 0 ) {
	      time.append( hours + ":" );
	    } else {
	      time.append( "00:" );
	    }

	    if( hours > 0 && minutes < 10 ) {
	      time.append( "0" );
	    }

	    if(minutes > 0 ) {
	      time.append( minutes + ":" );
	    }else {
	      time.append( "00:" );
	    }

	    if( seconds < 10 ) {
	      time.append( "0" );
	    }

	    if( seconds > 0 ) {
	      time.append( seconds );
	    }else {
	      time.append( "0" );
	    }

	    if( mili )
	    {
	      time.append( "." );
	      if( miliStart < 100 )
	        time.append( "0" );
	      if( miliStart < 10 )
	        time.append( "0" );
	      time.append( miliStart );
	    }

	    return time.toString();
	  }
	
}
