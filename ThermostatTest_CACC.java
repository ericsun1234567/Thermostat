package Thermostat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThermostatTest_CACC {

	@Test//Predicate 1 Row 5 Evaluated as True
	void ccacTruetestp1() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		t.setCurrentTemp(60);
		t.setdTemp(70);
		t.setThresholdDiff(5);
		t.setOverride(false);
		t.setOverTemp(75);
		t.setTimeSinceLastRun(11);
		t.setMinLag(10);
		boolean result = t.turnHeaterOn();
		assertTrue(result);
	}
	@Test//Predicate 1 Row 13 Evaluated as False
	void ccacFalsetestp1() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setCurrentTemp(60);
		t.setdTemp(70);
		t.setThresholdDiff(5);
		t.setOverride(false);
		t.setOverTemp(60);
		t.setTimeSinceLastRun(11);
		t.setMinLag(10);
		assertFalse(result);
	}
	@Test//Predicate 2 Row 1 Evaluated as True
	void ccacTruetestp2() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setOverride(true);
		assertTrue(t.getOverride());
	}
	@Test//Predicate 2 Row 2 Evaluated as False
	void ccacFalsetestp2() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setOverride(false);
		assertFalse(t.getOverride());
	}

}
