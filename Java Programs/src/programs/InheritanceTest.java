/**
 * 
 */
package programs;

/**
 * @author RizwanA
 *
 */
public interface InheritanceTest {
	
	
	public void reversString(String str);
	
	public default void add() {
		System.out.println("This is default add method in InheritanceTest Interface ");
	}
	
	public void Armstrong(int num);

	public void OccrenceOfChar(String str);
}
