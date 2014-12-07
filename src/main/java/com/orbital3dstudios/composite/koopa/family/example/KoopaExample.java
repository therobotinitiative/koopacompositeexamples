package com.orbital3dstudios.composite.koopa.family.example;

import com.orbital3dstudios.composite.koopa.family.koopa.BowserComponent;
import com.orbital3dstudios.composite.koopa.family.koopa.CutiePieComponent;
import com.orbital3dstudios.composite.koopa.family.koopa.GoombaComponent;
import com.orbital3dstudios.composite.koopa.family.koopa.HammerBroComponent;
import com.orbital3dstudios.composite.koopa.family.koopa.Koopa;
import com.orbital3dstudios.composite.koopa.family.koopa.KoopaTroopa;

public class KoopaExample
{
	public void constructKoopaChainOfCommand()
	{
		// Bowser is the top most Koopa in the chain of command, he is the king
		// koopa.
		BowserComponent bowser = new BowserComponent();

		// Cutie Pie comes right next in the chain
		CutiePieComponent cp = new CutiePieComponent();
		bowser.add(cp);

		// Bowser is also responsible for Goombas
		for (int i = 0; i < 100; i++)
		{
			bowser.add((Koopa) new GoombaComponent());
		}

		// Cutie Pie is in command of Hammer Bro
		HammerBroComponent hb = new HammerBroComponent();
		cp.put(HammerBroComponent.class, hb);

		// HammerBro is in command of Troopas
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
		hb.add((Koopa) new KoopaTroopa());
	}
}
