package com.orbital3dstudios.composite.koopa.family.example;

import java.util.HashSet;
import java.util.Set;

import com.orbital3dstudios.composite.koopa.family.msuhroomkingdom.LuigiComponent;
import com.orbital3dstudios.composite.koopa.family.msuhroomkingdom.MarioComponent;
import com.orbital3dstudios.composite.koopa.family.msuhroomkingdom.MushroomKingdom;
import com.orbital3dstudios.composite.koopa.family.msuhroomkingdom.MushroomSoldier;
import com.orbital3dstudios.composite.koopa.family.msuhroomkingdom.PrincessPeachComponent;

public class MushroomKingdomExamples
{
	public void constructSimpleTree()
	{
		// Create a basic components
		// Princess Peach has Mario and Luigi components. There can be several
		// components of the both type.
		// Mario component cannot have child components
		// Luigi has several mushroom soldiers as child components
		PrincessPeachComponent ppc = new PrincessPeachComponent();
		Set<MushroomKingdom> marioSet = new HashSet<MushroomKingdom>();
		marioSet.add(new MarioComponent());
		ppc.put(MarioComponent.class, marioSet);
		Set<MushroomKingdom> luigiSet = new HashSet<MushroomKingdom>();
		luigiSet.add(new LuigiComponent());
		ppc.put(LuigiComponent.class, luigiSet);

		// Mario cannot have child components, but Luigi can. The example below
		// is horrible and do not try this at home! Or in production code.
		LuigiComponent lc = (LuigiComponent) ppc.get(LuigiComponent.class).iterator().next();
		lc.add(new MushroomSoldier());
		lc.add(new MushroomSoldier());
		lc.add(new MushroomSoldier());
		lc.add(new MushroomSoldier());
	}

	public void cyclicOwnerShipDONOTDOTHIS()
	{
		// DO NOT do this although it is possible
		MushroomSoldier s = new MushroomSoldier();
		s.add(s);
		// Composite pattern allows this, but there probably is not use case for
		// this or maybe there is some.
	}
}
