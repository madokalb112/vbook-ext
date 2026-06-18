package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class LazyLoadSlot extends Slot {
    public LazyLoadSlot(Object obj, int i) {
        super(obj, i, 0);
    }

    @Override // org.mozilla.javascript.Slot
    public LazyLoadSlot copySlot() {
        LazyLoadSlot lazyLoadSlot = new LazyLoadSlot(this);
        lazyLoadSlot.value = this.value;
        lazyLoadSlot.next = null;
        lazyLoadSlot.orderedNext = null;
        return lazyLoadSlot;
    }

    @Override // org.mozilla.javascript.Slot
    public Object getValue(Scriptable scriptable) {
        Object obj = this.value;
        if (!(obj instanceof LazilyLoadedCtor)) {
            return obj;
        }
        LazilyLoadedCtor lazilyLoadedCtor = (LazilyLoadedCtor) obj;
        try {
            lazilyLoadedCtor.init();
            return lazilyLoadedCtor.getValue();
        } finally {
            this.value = lazilyLoadedCtor.getValue();
        }
    }

    public LazyLoadSlot(Slot slot) {
        super(slot);
    }
}
