//1/ The code that violates the principle.

interface TransportVehicle
{
    void fly();
    void moveOnWater();
    void runOnTheGround();
}

class Plane implements TransportVehicle
{
    public void fly()
    {
         //Fly
    }
    public void moveOnWater()
    {
        throw new NotSupportedException();
    }
    public void runOnTheGround()
    {
         // Run on the Ground
    }
}

//2/ The code to fix that violation.

interface RoadVehicles
{
    void runOnTheGround();
}

interface AirwayVehicles
{
    void fly();
}

interface WaterwayVehicles
{
    void moveOnWater();
}

class SeaPlane implements AirwayVehicles, WaterwayVehicles
{
    public void fly()
    {
         //Fly
    }
    public void moveOnWater()
    {
        // Move On Water
    }
}