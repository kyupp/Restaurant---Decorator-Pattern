package Sizes;

import Base.Size;
import Base.Subguey;
/**
 *
 * @author gabri
 */

public class Subguey30 implements Subguey {

    public Subguey30() {
    }

    @Override
    public String getName() {
        return "Subguey";
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Sándwich de 30 cm";
    }

    @Override
    public Size getSize() {
        return Size.LARGE30;
    }
}
