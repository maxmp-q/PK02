package ha06.a3;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;



class FractionTest{
    private Fraction fraction;
    private Fraction old_fraction;

    @BeforeEach
    public void setUp(){
        fraction = new Fraction(10, 20);
        old_fraction = new Fraction(10, 20);
    }

    @Test
    void Kehrwert(){
        fraction.Kehrwert();
        Assertions.assertEquals(old_fraction.getZaehler(), fraction.getNenner());
        Assertions.assertEquals(old_fraction.getNenner(), fraction.getZaehler());
    }

    @Test
    void multipiler(){
        Fraction new_fraction = new Fraction(5, 5);
        fraction.multiplikation(new_fraction);

        Assertions.assertEquals(old_fraction.getZaehler()*new_fraction.getZaehler(), fraction.getNenner());

    }

    @AfterEach
    public void cleanUp(){

    }

}
