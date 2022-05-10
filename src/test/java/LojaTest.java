import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    public void retonarProprietario()
    {
        Loja.getInstance().setProprietario("Jorge Lessa");
        assertEquals("Jorge Lessa", Loja.getInstance().getProprietario());
    }

    @Test
    public void retonarRamoAtuacao()
    {
        Loja.getInstance().setRamoAtuacao("Games");
        assertNotEquals(null, Loja.getInstance().getRamoAtuacao());
        assertEquals("Games", Loja.getInstance().getRamoAtuacao());
    }

}