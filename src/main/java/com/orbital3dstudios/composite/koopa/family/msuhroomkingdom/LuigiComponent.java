package com.orbital3dstudios.composite.koopa.family.msuhroomkingdom;

import com.orbital3dstudios.composite.koopa.implementation.AbstractSetComponent;

/**
 * Example of LuigiComponent that can have child components from the mushroom
 * kingdom family. After long and careful study I have come to the conclusion
 * that there is a slight possibility that after the incident between Luigi and
 * Cutie Pie something might happen and Luigi might be subject to have set of
 * child components, but only within the Mushroom Kingdom family.
 * 
 * @author Mikko Sirén
 * 
 */
public class LuigiComponent extends AbstractSetComponent<MushroomKingdom> implements MushroomKingdom
{
	public void jump()
	{
		// Make Luigi jump
	}
}
