package v8;

// 1. A classe é agora abstrata
public abstract class Price
{
    // 2. O 'Code' enum foi removido
    // 3. O campo '_code' foi removido

    // 4. O construtor foi removido

    // 5. O método 'getCode' foi removido

    // 6. 'getRentalAmount' é agora abstrato
    public abstract double getRentalAmount(int duration);

    // 7. 'getFrequentRentalPoints' é agora abstrato
    public abstract int getFrequentRentalPoints(int duration);
}