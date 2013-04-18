package powercrystals.minefactoryreloaded.circuits;

import powercrystals.minefactoryreloaded.api.rednet.IRedNetLogicCircuit;

public class Inverter implements IRedNetLogicCircuit
{
	@Override
	public int getInputCount()
	{
		return 1;
	}

	@Override
	public int getOutputCount()
	{
		return 1;
	}

	@Override
	public int[] recalculateOutputValues(long worldTime, int[] inputValues)
	{
		if(inputValues[0] > 0)
		{
			return new int[] { 0 };
		}
		else
		{
			return new int[] { 15 };
		}
	}

	@Override
	public String getUnlocalizedName()
	{
		return "circuit.mfr.inverter";
	}

	@Override
	public String getInputPinLabel(int pin)
	{
		return "I" + pin;
	}

	@Override
	public String getOutputPinLabel(int pin)
	{
		return "O" + pin;
	}
}