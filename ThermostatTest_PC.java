package Thermostat;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThermostatTest_PC {

	@Test//Predicate 1 Row 6 Evaluated as True
	void pcTruetestp1() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		t.setCurrentTemp(60);
		t.setdTemp(70);
		t.setThresholdDiff(5);
		t.setOverride(false);
		t.setOverTemp(75);
		t.setTimeSinceLastRun(10);
		t.setMinLag(11);
		boolean result = t.turnHeaterOn();
		assertTrue(result);
	}
	@Test//Predicate 1 Row 11 Evaluated as False
	void pcFalsetestp1() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setCurrentTemp(70);
		t.setdTemp(60);
		t.setThresholdDiff(5);
		t.setOverride(true);
		t.setOverTemp(60);
		t.setTimeSinceLastRun(11);
		t.setMinLag(10);
		assertFalse(result);
	}
	@Test//Predicate 2 Row 1 Evaluated as True
	void pcTruetestp2() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setOverride(true);
		assertTrue(t.getOverride());
	}
	@Test//Predicate 2 Row 2 Evaluated as False
	void pcFalsetestp2() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setOverride(false);
		assertFalse(t.getOverride());
	}


	
	
	

}
