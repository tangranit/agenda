package br.com.csintegra.logics;

import java.text.ParseException;
import java.util.Calendar;
import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class DataCalendario {


	private Calendar mes;

	/**
	 * @return the mes
	 */
	public Calendar getMes() {
		return mes;
	}

	/**
	 * @param mes
	 *            the mes to set
	 */
	public void setMes(Calendar mes) {
		this.mes = mes;
	}

	
	
	
	
	/**
	 * @return the days
	 * @throws ParseException 
	 */
	public HashMap<Integer, Integer> getDays() throws ParseException {
		return getDaysInMonth();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataCalendario other = (DataCalendario) obj;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		return true;
	}

	public HashMap<Integer, Integer> getDaysInMonth() throws ParseException {
		HashMap<Integer, Integer> d = new HashMap<>();
		int inicio=1;
		int ultimo =mes.getActualMaximum(Calendar.DATE);
		
		Calendar c = Calendar.getInstance();
		c.set(mes.get(Calendar.YEAR),mes.get(Calendar.MONTH),mes.get(Calendar.DATE));
		while(inicio <=ultimo){
			c.add(Calendar.DATE, +1);
			d.put(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.DAY_OF_WEEK));
			inicio+=1;
		}
		return d;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		try {
			return "DataCalendario [dias=" + getDays() + "]";
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	

}
