package abstractFactory;

public class NakMuay {

    private Treino treino;
    private Equipamento equipamento;

    public NakMuay (FabricaAbstrata fabrica) {
        this.treino = fabrica.createTreino();
        this.equipamento = fabrica.createEquipamento();
    }

    public String iniciarTreino() {
        return this.treino.iniciar();
    }

    public String colocarEquipamento() {
        return this.equipamento.colocar();
    }
}
