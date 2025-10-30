package v7;

public class Movie {
    // 'Code' enum foi removido daqui

    private String _title;
    // '_priceCode' foi substituído por '_price'
    private Price _price;

    // Construtor modificado para usar 'Price.Code'
    public Movie(String title, Price.Code priceCode) {
        _title = title;
        // Instancia o objeto 'Price'
        _price = new Price(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    // Novo getter para o objeto 'Price'
    public Price getPrice()
    {
        return _price;
    }

    // 'getRentalAmount' foi removido (movido para 'Price')

    // 'getFrequentRentalPoints' foi removido (movido para 'Price')
}