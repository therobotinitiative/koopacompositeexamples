package com.orbital3dstudios.composite.koopa.family.msuhroomkingdom;

import com.orbital3dstudios.composite.koopa.component.CompositeComponent;

/**
 * Interface for the base type of all components within the Mushroom Kingdom
 * family. This interface is a type of {@link CompositeComponent} and also
 * provides common operation for sub-classes.
 * 
 * @author Mikko Sir�n
 * 
 */
public interface MushroomKingdom extends CompositeComponent
{
	/**
	 * Make the Mushroom Kingdom family member jump.
	 */
	void jump();
}
