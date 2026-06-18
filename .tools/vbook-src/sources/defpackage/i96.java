package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i96 extends q1 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public i96(List list) {
        list.getClass();
        this.b = list;
    }

    @Override // defpackage.g0
    public final int a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((k96) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.g0, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                String strGroup = ((k96) obj).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(fc1.n0(i, this));
        }
    }

    @Override // defpackage.q1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.q1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new dn8(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.q1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.q1, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new dn8(this, 0);
            default:
                return super.listIterator();
        }
    }

    public i96(k96 k96Var) {
        this.b = k96Var;
    }

    @Override // defpackage.q1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new dn8(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
