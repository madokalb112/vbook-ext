package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hd5 implements Iterator {
    public static final hd5 a;
    public static final /* synthetic */ hd5[] b;

    static {
        hd5 hd5Var = new hd5("INSTANCE", 0);
        a = hd5Var;
        b = new hd5[]{hd5Var};
    }

    public static hd5 valueOf(String str) {
        return (hd5) Enum.valueOf(hd5.class, str);
    }

    public static hd5[] values() {
        return (hd5[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        fx1.Q("no calls to next() since the last call to remove()", false);
    }
}
