package abstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NakMuayTest    {

    @Test
    void deveIniciarTreinoTecnico(){
        FabricaAbstrata fabrica = new FabricaTecnico();
        NakMuay nakMuay = new NakMuay(fabrica);
        assertEquals("Treinar: boxe sombra, rounds saco de pancada e sequências na manopla", nakMuay.iniciarTreino());
    }

    @Test
    void deveIniciarTreinoSparring(){
        FabricaAbstrata fabrica = new FabricaSparring();
        NakMuay nakMuay = new NakMuay(fabrica);
        assertEquals("Treinar: 2min de luta completa", nakMuay.iniciarTreino());
    }

    @Test
    void deveColocarEquipamentoTecnico(){
        FabricaAbstrata fabrica = new FabricaTecnico();
        NakMuay nakMuay = new NakMuay(fabrica);
        assertEquals("Equipado: Bandagem de 3 metros, luva 12oz e caneleira", nakMuay.colocarEquipamento());
    }

    @Test
    void deveColocarEquipamentoSparring(){
        FabricaAbstrata fabrica = new FabricaSparring();
        NakMuay nakMuay = new NakMuay(fabrica);
        assertEquals("Equipado: Bandagem de 5 metros, luva 16oz, caneleira e protetor bocal", nakMuay.colocarEquipamento());
    }

}