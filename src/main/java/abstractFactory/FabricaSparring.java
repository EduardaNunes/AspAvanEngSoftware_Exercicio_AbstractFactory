package abstractFactory;

public class FabricaSparring implements FabricaAbstrata{

    @Override
    public Treino createTreino() {
        return new TreinoSparring();
    }

    @Override
    public Equipamento createEquipamento() {
        return new EquipamentoSparring();
    }

}
