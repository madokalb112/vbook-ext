package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jz0 extends m2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz0 b;

    public /* synthetic */ jz0(mz0 mz0Var, int i) {
        this.a = i;
        this.b = mz0Var;
    }

    @Override // defpackage.m2
    public final int a() {
        int i = this.a;
        mz0 mz0Var = this.b;
        switch (i) {
        }
        return mz0Var.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.entries does not support add");
            default:
                ((String) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.keys does not support add");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (fw.w0(obj)) {
                    return super.contains((Map.Entry) obj);
                }
                return false;
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                return this.b.containsKey((String) obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        mz0 mz0Var = this.b;
        switch (i) {
            case 0:
                return new iz0(mz0Var, 0);
            default:
                return new iz0(mz0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (fw.w0(obj)) {
                    return super.remove((Map.Entry) obj);
                }
                return false;
            default:
                if (obj instanceof String) {
                    return this.b.remove((String) obj) != null;
                }
                return false;
        }
    }
}
