package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gd5 extends reb {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gd5(o69 o69Var) {
        this();
        this.c = 1;
        this.e = o69Var;
        this.d = o69Var.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        fx1.R(this.a != 4);
        int iC = dx1.C(this.a);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.a = 4;
            int i = this.c;
            Object obj = null;
            Object obj2 = this.e;
            Iterator it = this.d;
            switch (i) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((h08) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.a = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((o69) obj2).b.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.a = 3;
                    break;
            }
            this.b = obj;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            mn5.m();
            return null;
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gd5(Iterator it, h08 h08Var) {
        this();
        this.c = 0;
        this.d = it;
        this.e = h08Var;
    }

    public gd5() {
        this.a = 2;
    }
}
