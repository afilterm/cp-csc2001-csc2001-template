import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addSix() {
        assertEquals(45, Main.addSix(39));
    }

    @Test
    void addSeventeen() { assertEquals(18, Main.addSeventeen(1)); }

    @Test
    void decryptorA() { assertEquals("miasma", Main.decryptorA("*miasma*"));}

    @Test
    void decryptorB() { assertEquals("mantelpiece",Main.decryptorB("eantelpiecm"));}

    @Test
    void decryptorC() { assertEquals("largesse", Main.decryptorC("argesselay"));}

    @Test
    void decryptorD() { assertEquals("antediluvian", Main.decryptorD("antediuvianl"));}

    @Test
    void decryptorLA() { assertEquals("whisker pole", Main.decryptorLA("elop rwhiske"));}

    @Test
    void decryptorLB() { assertEquals("“Jimmy,” he said pleadingly, “I hankers fer somethin’ tuh take my mind offen the cares an’ troubles of my exactin’ duties. I craves some hard likker, the kind that falls with a clatter an’ lands with a bang. I’m plumb meloncolic, that’s what. Don’t keep me in expense no longer.", Main.decryptorLB("“Jommy,” hi seod pliedongly, “I henkirs fir sumithon’ tah teki my mond uffin thi ceris en’ truablis uf my ixecton’ datois. I crevis sumi herd lokkir, thi kond thet fells woth e clettir en’ lends woth e beng. I’m plamb milunculoc, thet’s whet. Dun’t kiip mi on ixpinsi nu lungir."));}
}
