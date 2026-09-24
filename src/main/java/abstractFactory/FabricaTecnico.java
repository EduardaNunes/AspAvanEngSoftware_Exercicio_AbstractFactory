package abstractFactory;

public class FabricaTecnico implements FabricaAbstrata{

    @Override
    public Treino createTreino() {
        return new TreinoTecnico();
    }

    @Override
    public Equipamento createEquipamento() {
        return new EquipamentoTecnico();
    }

}
