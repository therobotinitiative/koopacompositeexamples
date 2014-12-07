package com.orbital3dstudios.composite.koopa.family.business;

/**
 * This demonstrates the patter example in DZone. The link, taken 7.12.2014:
 * http://java.dzone.com/articles/composite-design-pattern-java-0
 * 
 * @author Mikko Sirén
 * 
 */
public class BusinessExample
{
	public void whoTakesALeakOnWhoseSerials()
	{
		// General Manager own developer
		GeneralManager gm = new GeneralManager();
		gm.put(Developer.class, new Developer());
		// and manager has two developers
		Manager m = new Manager();
		m.add(new Developer());
		m.add(new Developer());
		gm.put(Manager.class, m);
		// As you can see here the management level owns others
		// and the developer level has no value although they do
		// the work the managers sell and enjoy.
	}
}
