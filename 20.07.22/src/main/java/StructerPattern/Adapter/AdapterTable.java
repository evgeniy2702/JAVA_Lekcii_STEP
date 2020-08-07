package StructerPattern.Adapter;

public class AdapterTable implements Table {

    PlasticTable plasticTable = new PlasticTable();

    public AdapterTable() {
    }

    public void material() {
        if (this.plasticTable != null) {
            this.plasticTable.plastic();
        }

    }

    public void amountLags() {
        this.plasticTable.lags();
    }

    public void color() {
        this.plasticTable.colorTable();
    }
}
