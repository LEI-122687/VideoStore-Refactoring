package v9;

public class BestPrice extends Price
{
    // Construtores para suportar blue-ray
    public BestPrice()
    {
        super();
    }
    public BestPrice(boolean blueray)
    {
        super(blueray);
    }

    @Override
    public double getRentalAmount(int duration)
    {
        // Lógica VNew: 1€ por dia
        double result = duration * 1;
        // Lógica VNew: Adiciona 1€ para blue-ray
        if (is_blueray())
            result += 1;
        return result;
    }

    @Override
    public int getFrequentRentalPoints(int duration)
    {
        // Lógica VNew: 0 pontos
        int points = 0;
        // Lógica VNew: Adiciona 1 ponto para blue-ray (mesmo para Best Price)
        if (is_blueray())
            points++;
        return points;
    }
}