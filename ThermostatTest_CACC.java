package Thermostat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThermostatTest_CACC {

	@Test
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
	@Test
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
	@Test
	void ccacTruetestp2() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setOverride(true);
		assertTrue(t.getOverride());
	}
	@Test
	void ccacFalsetestp2() {
		ProgrammedSettings p = new ProgrammedSettings();
		Thermostat t= new Thermostat();
		boolean result = t.turnHeaterOn();
		t.setOverride(false);
		assertFalse(t.getOverride());
	}

}
