package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;



import java.math.BigDecimal;

public class WorldTestSuite {


    @Test
    public void getPeopleQuantityOfWorld (){
        Country china = new Country("China", new BigDecimal(1_386_000_000));
        Country japan = new Country("Japan", new BigDecimal(126_800_000));
        Country poland = new Country("Poland", new BigDecimal(37_980_000));
        Country germany = new Country("Germany", new BigDecimal(82_980_000));
        Country brazil = new Country("Brazil", new BigDecimal(208_000_000));
        Country argentina = new Country("Argentina", new BigDecimal(44_270_000));

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent southAmerica = new Continent("South America");

        asia.addCountry(china);
        asia.addCountry(japan);
        europe.addCountry(poland);
        europe.addCountry(germany);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(argentina);

        World world = new World();
        world.addContinents(asia);
        world.addContinents(europe);
        world.addContinents(southAmerica);

        BigDecimal actualWorldQuantity = world.getTotalWorldPopulation();

        BigDecimal expectedWorldQuantity = new BigDecimal(1886030000);

        Assert.assertEquals(expectedWorldQuantity, actualWorldQuantity);



    }

}