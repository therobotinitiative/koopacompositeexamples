package com.orbital3dstudios.composite.koopa.family.msuhroomkingdom;

/**
 * Mario can be added as child component to any composite component that takes
 * {@link MushroomKingdom} components. Mario component by it self is a leaf so
 * it cannot have any child components. Based on long and extensive study the
 * possibility that Mario component could have child components is nearly
 * impossible. I am not implying anything I have based my conclusion on the
 * available evidence.
 * 
 * @author Mikko Sirén
 * 
 */
public class MarioComponent implements MushroomKingdomLeaf
{
	public void jump()
	{
		// Make Mario jump
	}
}
