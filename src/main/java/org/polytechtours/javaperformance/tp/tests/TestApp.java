package org.polytechtours.javaperformance.tp.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.Vector;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.polytechtours.javaperformance.tp.paintingants.CColonie;
import org.polytechtours.javaperformance.tp.paintingants.CFourmi;
import org.polytechtours.javaperformance.tp.paintingants.CPainting;
import org.polytechtours.javaperformance.tp.paintingants.PaintingAnts;

class TestApp {
	private static PaintingAnts pa = new PaintingAnts();
	private static CColonie col;
	private static Vector<CFourmi> mColonie = new Vector<CFourmi>();
	
	@BeforeAll
	static void prep() {
		col = new CColonie(mColonie, pa);
		
	}
	
	@Test
	void testPauseCol() {
		// fail("Not yet implemented");
		col.pleaseStop();
		assertEquals(false, col.getmContinue());
	}
	
	@Test
	void testModulo() {
		//public CFourmi(Color pCouleurDeposee, Color pCouleurSuivie, float pProbaTD, float pProbaG, float pProbaD,
		//	      float pProbaSuivre, CPainting pPainting, char pTypeDeplacement, float pInit_x, float pInit_y, int pInitDirection,
			//      int pTaille, float pSeuilLuminance, PaintingAnts pApplis) {
		CFourmi fourmi = new CFourmi(new Color(0), new Color(0), 0, 0, 0, 0, null, 'a', 0, 0, 0, 0, 0,null);
		assertEquals(1, fourmi.modulo(10, 3));
	}
	
	@Test
	void testPausePainting() {		
		boolean actu = pa.getPause();
		pa.pause();
		assertEquals(!actu, pa.getPause());		
	}

}
