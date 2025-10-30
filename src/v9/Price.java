package v9;

public abstract class Price
{
    // 1. Adicionado campo para o estado Blue-Ray
    protected boolean _blueray;

    // 2. Construtor modificado para aceitar o estado blue-ray
    public Price(boolean blueray)
    {
        _blueray = blueray;
    }

    // 3. Construtor 'default' para filmes não-blueray
    public Price()
    {
        _blueray = false;
    }

    // 4. Getter para o estado blue-ray
    public boolean is_blueray()
    {
        return _blueray;
    }

    public abstract double getRentalAmount(int duration);

    public abstract int getFrequentRentalPoints(int duration);
}