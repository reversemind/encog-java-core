package org.encog.ml.prg.train;

import org.encog.ml.genetic.genome.Genome;
import org.encog.ml.genetic.genome.GenomeFactory;
import org.encog.ml.prg.EncogProgram;
import org.encog.ml.prg.EncogProgramContext;
import org.encog.ml.prg.EncogProgramVariables;
import org.encog.ml.prg.epl.EPLHolder;

public class PrgGenomeFactory implements GenomeFactory {

	private EncogProgramContext context;
	
	public PrgGenomeFactory(EncogProgramContext theContext) {
		this.context = theContext;
	}
	
	@Override
	public Genome factor() {
		EPLHolder newHolder = this.context.getHolderFactory().factor(1, this.context.getParams().getMaxIndividualSize());
		EncogProgram result = new EncogProgram(this.context, new EncogProgramVariables(), newHolder,0);
		return result;
	}
	
}
