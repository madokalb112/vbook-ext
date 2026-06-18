package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface SlotMap extends Iterable<Slot> {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    @FunctionalInterface
    public interface SlotComputer<S extends Slot> {
        S compute(Object obj, int i, Slot slot);
    }

    void add(Slot slot);

    <S extends Slot> S compute(Object obj, int i, SlotComputer<S> slotComputer);

    boolean isEmpty();

    Slot modify(Object obj, int i, int i2);

    Slot query(Object obj, int i);

    int size();
}
