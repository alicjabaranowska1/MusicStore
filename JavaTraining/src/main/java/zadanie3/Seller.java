package zadanie3;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@AllArgsConstructor
@Getter
public class Seller {
    private String name;
    private String surname;

//long dlatego ze funkcja count
//dla kazdego albumu pobieram typ i porownuje z enumem type

    public long calculateNumberOfAlbumsByType(List<Album> albums, Type type){
        return albums.stream()
                .filter(album -> album.getType().equals(type))
                .count();
    }
//poprawic
    public double calculateAvarageOfAlbumByCurrency(List<Album> albums, Currency currency) {
        double sumsOfAlbumsPrices = 0;
        long albumsSize = albums.size();

        if (albumsSize > 0) {
            for (Album album : albums) {
                Price price = album.getPrice();
                if (currency.equals(Currency.PLN)) {
                    sumsOfAlbumsPrices += price.getPlnPrice().doubleValue();
                } else if (currency.equals(Currency.USD)) {
                    sumsOfAlbumsPrices += price.getUsdPrice().doubleValue();
                }
            }
            return Math.round((sumsOfAlbumsPrices / albumsSize) * 100.0) / 100.0;
        } else {
            return 0;
        }
    }

    public long countNumberOfAlbumsBetweenYears(List<Album> albums, long startYearRange, long endYearRange) {
        long count = 0;

//        for (Album album : albums) {
//            long publicationYear = album.getPublicationYear();
//            if (publicationYear >= startYearRange && publicationYear <= endYearRange) {
//                count++;
//            }
//        }

        count = albums.stream()
                .filter(album -> album.getPublicationYear() >= startYearRange && album.getPublicationYear() <= endYearRange)
                .count();

        return count;
    }
}
