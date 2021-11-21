package test_enums;

public enum Direction {
	EAST, WEST, NORTH, SOUTH;
	@Override
	public String toString()
	{
		return name().toLowerCase()+" @ "+ordinal();
	}
}
