import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
	@Test
	public void cipherTest1() {
		CaesarCipher c = new CaesarCipher();
		c.notify("Why did the chicken cross the road?");
		Assert.assertEquals("Jul qvq gur puvpxra pebff gur ebnq", c.getText());
	}

	@Test
	public void cipherTestLength() {
		CaesarCipher c = new CaesarCipher();
		// String of length 143
		c.notify("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 140; i++)
			sb.append('a');

		Assert.assertEquals(sb.toString(), c.getText());
	}

	@Test
	public void cipherTestIgnoreSpecial() {
		CaesarCipher c = new CaesarCipher();
		// String of length 145 with spaces
		c.notify("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn%^#$#nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 140; i++)
			sb.append('a');

		Assert.assertEquals(sb.toString(), c.getText());
	}

	@Test
	public void elbonianTest1() {
		ElbonianCipher c = new ElbonianCipher();
		c.notify("This is a #@$% Message");
		Assert.assertEquals("U20L08L09L19-L09L19-L01--U13L05L19L19L01L07L05", c.getText());
	}

	@Test
	public void elbonianTestLength() {
		ElbonianCipher c = new ElbonianCipher();
		// String of length 143
		c.notify("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 140; i++)
			sb.append("L14");

		Assert.assertEquals(sb.toString(), c.getText());
	}
}
