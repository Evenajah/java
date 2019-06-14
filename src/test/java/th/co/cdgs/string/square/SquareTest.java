package th.co.cdgs.string.square;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import th.co.cdgs.string.square.Square;

public class SquareTest {
	
	private Square square = new Square();
	@Test
	public void print1Row() {
		//*
		assertEquals("*\n", square.print(1));
	}
	
	@Test
	public void print2Row() {
		//**
		//**
		assertEquals("**\n**\n", square.print(2));
	}
	
	@Test
	public void print3Row() {
		//***
		//***
		//***
		assertEquals("***\n***\n***\n", square.print(3));
	}
	
	@Test
	public void print4Row() {
		//****
		//****
		//****
		assertEquals("****\n****\n****\n****\n", square.print(4));
	}
	
	
	@Test
	public void print5Row() {
		//****
		//****
		//****
		assertEquals("*****\n*****\n*****\n*****\n*****\n", square.print(5));
	}

}