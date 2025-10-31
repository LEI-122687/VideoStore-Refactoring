package v9;

public class ChildrensPrice extends Price
{
    // Construtores para suportar blue-ray
    public ChildrensPrice()
    {
        super();
    }
    public ChildrensPrice(boolean blueray)
    {
        super(blueray);
    }

    public double getRentalAmount(int duration)
    {
        // Lógica V9
        double result = 1.5 + (duration > 3 ? (duration - 3) * 1.5 : 0);
        // Lógica VNew: Adiciona 1€ para blue-ray
        if (is_blueray())
            result += 1;
        return result;
    }

    public int getFrequentRentalPoints(int duration)
    {
        // Lógica V9
        int points = 1;
        // Lógica VNew: Adiciona 1 ponto para blue-ray
        if (is_blueray())
            points++;
        return points;
    }
}