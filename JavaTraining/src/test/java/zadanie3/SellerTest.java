package zadanie3;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SellerTest {

    @Test
    public void checkIfNumberOfSameTypeAlbumsIsCalculatedCorrectly(){
        //given
        Seller seller = new Seller("Ala", "Baranowska");

        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Rychu", "Peja"));
        artists.add(new Artist("Taco", "Hemingway"));

        List<Album> albums = new ArrayList<>();
        Album album1 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(49.99), BigDecimal.valueOf(9.99)),
                        Type.HIP_HOP, 2005);
        Album album2 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(59.99), BigDecimal.valueOf(10.99)),
                        Type.RAP, 2000);

        Album album3 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(69.99), BigDecimal.valueOf(19.99)),
                        Type.HIP_HOP, 2019);

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        //when
        long count = seller.calculateNumberOfAlbumsByType(albums, Type.HIP_HOP);

        //then
        assertEquals(2,count);
    }

    @Test
    public void checkIfAvarageOfAlbumsIsCalculatedCorrectly(){
        //given
        Seller seller = new Seller("Ala", "Baranowska");

        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Rychu", "Peja"));
        artists.add(new Artist("Taco", "Hemingway"));

        List<Album> albums = new ArrayList<>();
        Album album1 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(49.99), BigDecimal.valueOf(9.99)),
                        Type.HIP_HOP, 2005);
        Album album2 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(59.99), BigDecimal.valueOf(10.99)),
                        Type.RAP, 2000);

        Album album3 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(69.99), BigDecimal.valueOf(19.99)),
                        Type.HIP_HOP, 2019);

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        MusicStore musicStore = new MusicStore();
        musicStore.addAlbum(album1);
        musicStore.addAlbum(album2);
        musicStore.removeAlbum(album1);

        //when
        double pricePLN = seller.calculateAvarageOfAlbumByCurrency(albums,Currency.PLN);
        double priceUSD = seller.calculateAvarageOfAlbumByCurrency(albums,Currency.USD);

        //then
        assertEquals(59.99,pricePLN);
        assertEquals(13.66,priceUSD);

    }

    @Test
    public void checkIfNumberOfAlbumsReleasedBetweenYearsIsCalculatedCorrectly(){
        //given
        Seller seller = new Seller("Ala", "Baranowska");

        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Rychu", "Peja"));
        artists.add(new Artist("Taco", "Hemingway"));

        List<Album> albums = new ArrayList<>();
        Album album1 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(49.99), BigDecimal.valueOf(9.99)),
                        Type.HIP_HOP, 2005);
        Album album2 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(59.99), BigDecimal.valueOf(10.99)),
                        Type.RAP, 2000);

        Album album3 = new Album
                (artists,
                        new Price(BigDecimal.valueOf(69.99), BigDecimal.valueOf(19.99)),
                        Type.HIP_HOP, 2019);

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        MusicStore musicStore = new MusicStore();
        musicStore.addAlbum(album1);
        musicStore.addAlbum(album2);
        musicStore.removeAlbum(album1);

        //when
        long count = seller.countNumberOfAlbumsBetweenYears(albums,2000,2020);

        //then
        assertEquals(3,count);
    }



}