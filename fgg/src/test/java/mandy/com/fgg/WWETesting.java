package mandy.com.fgg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jfree.chart.util.CloneUtils;
import org.jfree.data.general.Series;
import org.jfree.data.xy.MatrixSeries;
import org.junit.Test;
import org.mockito.Mockito;

public class WWETesting {

	
	@Test
	public void Block1_Get() {
		
		WWEWomenDivision W = new WWEWomenDivision();
		String Champion = W.CheckChampion();
		
		assertEquals("Becky Lynch", Champion);
		
	}
	
	
}
