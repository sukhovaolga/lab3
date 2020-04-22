/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || o == null && this == null) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Location location = (Location) o;

        return this.yCoord == location.yCoord && this.xCoord == location.xCoord;
    }

    @Override
    public int hashCode() {
        int result = xCoord;
        result = 100 * result + yCoord;
        return result;
    }
}
