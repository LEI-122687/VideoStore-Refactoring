package v9;

public class NewReleasePrice extends Price
{
    // Construtores para suportar blue-ray
    public NewReleasePrice()
    {
        super();
    }
    public NewReleasePrice(boolean blueray)
    {
        super(blueray);
    }

    public double getRentalAmount(int duration)
    {
        // Lógica V9
        double result = duration * 3;
        // Lógica VNew: Adiciona 1€ para blue-ray
        if (is_blueray())
            result += 1;
        return result;
    }

    public int getFrequentRentalPoints(int duration)
    {
        // Lógica V9
        int points = (duration > 1) ? 2 : 1;
        // Lógica VNew: Adiciona 1 ponto para blue-ray
        if (is_blueray())
            points++;
        return points;
    }
}