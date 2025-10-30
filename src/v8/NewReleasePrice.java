package v8;

public class NewReleasePrice extends Price
{
    @Override
    public double getRentalAmount(int duration)
    {
        return duration * 3;
    }

    @Override
    public int getFrequentRentalPoints(int duration)
    {
        // Lógica de pontos para NEW_RELEASE
        return (duration > 1) ? 2 : 1;
    }
}