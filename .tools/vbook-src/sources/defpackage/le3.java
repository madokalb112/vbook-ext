package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class le3 extends q1 implements ke3, RandomAccess, Serializable {
    public final Enum[] a;

    public le3(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }

    @Override // defpackage.g0
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.g0, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) fw.p0(r3.ordinal(), this.a)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        k27.m(xv5.o("index: ", i, length, ", size: "));
        return null;
    }

    @Override // defpackage.q1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) fw.p0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.q1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) fw.p0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
