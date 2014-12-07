package com.orbital3dstudios.composite.koopa.family.msuhroomkingdom;

import com.orbital3dstudios.composite.koopa.implementation.AbstractMultiMapComposite;

/**
 * Since the princess is a female we can make the assumption that she is
 * possibly subject to replication and can have several child component with
 * different types of components wihtin the mushroom kingdom family. This does
 * make the possibility of complications in the plot since the princess can have
 * several components with {@link MarioComponent}, but the
 * {@link MarioComponent} is actually a {@link MushroomKingdomLeaf} component.
 * But the restriction is on {@link MarioComponent} side it does not apply
 * restrictions to the {@link PrincessPeachComponent} side.
 * 
 * @author Mikko Sirén
 * 
 */
public class PrincessPeachComponent extends AbstractMultiMapComposite<MushroomKingdom> implements MushroomKingdom
{
	public void jump()
	{
		// Make the princess jump
	}
}
