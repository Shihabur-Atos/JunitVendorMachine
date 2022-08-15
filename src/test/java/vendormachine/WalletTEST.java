package vendormachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.

	Wallet wallet = new Wallet();
	Wallet testWallet;
	Wallet test2Wallet;

	@BeforeEach
	public void setUp() {
		wallet.setCredit(20.55f);
		wallet.addCredit(5.45f);
		wallet.setBrand("Halifax Premium");
		testWallet = new Wallet(25.55f);
		test2Wallet = new Wallet("Barclays",25.55f);
	}

	@Test
	public void testGetCredit() {
		assertEquals(0f,wallet.getCredit(0));
		assertEquals(10f,testWallet.getCredit(10));
		assertEquals(5f,test2Wallet.getCredit(5));
		assertEquals(0f,wallet.getCredit(27));
	}

	@Test
	public void testGetAllCredit() {
		assertEquals(26.0f,wallet.getAllCredit());
		assertEquals(25.55f,testWallet.getAllCredit());
		assertEquals(25.55f,test2Wallet.getAllCredit());
	}

	@Test
	public void testGetBrand() {
		assertEquals("Generic",testWallet.getBrand());
		assertEquals("Barclays",test2Wallet.getBrand());
		assertEquals("Halifax Premium",wallet.getBrand());
	}

}

