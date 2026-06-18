package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ux3 implements Iterator, fi5 {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ a39 e;

    public ux3(r04 r04Var) {
        this.a = 1;
        this.e = r04Var;
        this.b = ((Iterable) ((jc1) r04Var.b).b).iterator();
    }

    public void a() {
        Object next;
        vx3 vx3Var = (vx3) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) vx3Var.c.invoke(next)).booleanValue() != vx3Var.b);
        this.d = next;
        this.c = 1;
    }

    public boolean c() {
        Iterator it;
        r04 r04Var = (r04) this.e;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            it = (Iterator) h39.a.invoke(((xl4) r04Var.c).invoke(it3.next()));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            default:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    mn5.m();
                } else {
                    Object obj = this.d;
                    this.d = null;
                    this.c = -1;
                }
                break;
            default:
                int i = this.c;
                if (i == 2) {
                    mn5.m();
                } else if (i == 0 && !c()) {
                    mn5.m();
                } else {
                    this.c = 0;
                    Iterator it = (Iterator) this.d;
                    it.getClass();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ux3(vx3 vx3Var) {
        this.a = 0;
        this.e = vx3Var;
        this.b = vx3Var.a.iterator();
        this.c = -1;
    }
}
