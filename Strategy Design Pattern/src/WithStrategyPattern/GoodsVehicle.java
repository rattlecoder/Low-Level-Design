package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;
import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super (new NormalDriveStrategy());
    }

}
