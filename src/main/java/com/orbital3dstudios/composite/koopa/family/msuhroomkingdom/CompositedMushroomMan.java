package com.orbital3dstudios.composite.koopa.family.msuhroomkingdom;

import java.util.Set;

import com.orbital3dstudios.composite.koopa.SetComponent;
import com.orbital3dstudios.composite.koopa.implementation.CompositionSetComponent;

/**
 * This is an example class that shows how to use the helper class if you cannot
 * extend the abstract component implementation class. Sometimes it is not
 * possible use the abstract implementation of the composite component because
 * Java does not support multi inheritance. Sometimes you just have to write
 * more code than other times, but it you find this a problem then maybe you are
 * using wrong language or should go back to the basics of programming.
 * 
 * @author Mikko Sirén
 * 
 */
public class CompositedMushroomMan extends AbstractMushroomFiller implements SetComponent<MushroomKingdom>, MushroomKingdom
{
	private final SetComponent<MushroomKingdom> compositionObject = new CompositionSetComponent<MushroomKingdom>();

	public void add(MushroomKingdom component)
	{
		compositionObject.add(component);
	}

	public boolean remove(MushroomKingdom component)
	{
		return compositionObject.remove(component);
	}

	public void remove(int index)
	{
		compositionObject.remove(index);
	}

	public MushroomKingdom get(int index)
	{
		return compositionObject.get(index);
	}

	public boolean contains(MushroomKingdom component)
	{
		return compositionObject.contains(component);
	}

	public int size()
	{
		return compositionObject.size();
	}

	public boolean isEmpty()
	{
		return compositionObject.isEmpty();
	}

	public void removeAll()
	{
		compositionObject.removeAll();
	}

	public void jump()
	{
		// Make mushroom man jump
	}

	public Set<MushroomKingdom> getComponents()
	{
		return compositionObject.getComponents();
	}

}
