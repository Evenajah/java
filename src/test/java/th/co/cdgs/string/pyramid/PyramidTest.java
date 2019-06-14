package th.co.cdgs.string.pyramid;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import th.co.cdgs.string.pyramid.Pyramid;

public class PyramidTest {
	
	private Pyramid pyramid = new Pyramid();
	@Test
	public void print1Row() {
		assertEquals("*\n", pyramid.print(1));
	}
	
	@Test
	public void print2Row() {
		// * 
		//***
		assertEquals("#*#\n***\n", pyramid.print(2));
	}
	
	
	@Test
	public void print3Row() {
		//  *   
		// *** 
		//*****
		assertEquals("##*##\n#***#\n*****\n", pyramid.print(3));
	}
	
	
	@Test
	public void print4Row() {
		//   *   
		//  ***   
		// ***** 
		//*******
		assertEquals("###*###\n##***##\n#*****#\n*******\n", pyramid.print(4));
	}
	
	
	@Test
	public void print5Row() {
		//   *   
		//  ***   
		// ***** 
		//*******
		assertEquals("####*####\n###***###\n##*****##\n#*******#\n*********\n", pyramid.print(5));
	}
	
	@Test
	public void print6Row() {
		//   *   
		//  ***   
		// ***** 
		//*******
		assertEquals("#####*#####\n####***####\n###*****###\n##*******##\n#*********#\n***********\n", pyramid.print(6));
	}


}