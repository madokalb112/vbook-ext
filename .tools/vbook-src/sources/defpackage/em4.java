package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class em4 implements ListIterator, fi5 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public em4(hk9 hk9Var, int i) {
        this.a = 3;
        this.e = hk9Var;
        this.b = i - 1;
        this.c = -1;
        this.d = ah1.G(hk9Var);
    }

    public void a() {
        if (((AbstractList) ((yy5) this.e).e).modCount == this.d) {
            return;
        }
        gp.d();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                yy5 yy5Var = (yy5) obj2;
                int i2 = this.b;
                this.b = i2 + 1;
                yy5Var.add(i2, obj);
                this.c = -1;
                this.d = ((AbstractList) yy5Var).modCount;
                return;
            case 2:
                c();
                zy5 zy5Var = (zy5) obj2;
                int i3 = this.b;
                this.b = i3 + 1;
                zy5Var.add(i3, obj);
                this.c = -1;
                this.d = ((AbstractList) zy5Var).modCount;
                return;
            default:
                d();
                hk9 hk9Var = (hk9) obj2;
                hk9Var.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = ah1.G(hk9Var);
                return;
        }
    }

    public void c() {
        if (((AbstractList) ((zy5) this.e)).modCount == this.d) {
            return;
        }
        gp.d();
    }

    public void d() {
        if (ah1.G((hk9) this.e) == this.d) {
            return;
        }
        gp.d();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (this.b < this.d) {
                }
                break;
            case 1:
                if (this.b < ((yy5) obj).c) {
                }
                break;
            case 2:
                if (this.b < ((zy5) obj).b) {
                }
                break;
            default:
                if (this.b < ((hk9) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > this.c) {
                }
                break;
            case 1:
                if (this.b > 0) {
                }
                break;
            case 2:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                kz6 kz6Var = ((gm4) obj).a;
                int i2 = this.b;
                this.b = i2 + 1;
                Object objF = kz6Var.f(i2);
                objF.getClass();
                return (nu6) objF;
            case 1:
                a();
                int i3 = this.b;
                yy5 yy5Var = (yy5) obj;
                if (i3 >= yy5Var.c) {
                    mn5.m();
                    return null;
                }
                this.b = i3 + 1;
                this.c = i3;
                return yy5Var.a[yy5Var.b + i3];
            case 2:
                c();
                int i4 = this.b;
                zy5 zy5Var = (zy5) obj;
                if (i4 >= zy5Var.b) {
                    mn5.m();
                    return null;
                }
                this.b = i4 + 1;
                this.c = i4;
                return zy5Var.a[i4];
            default:
                d();
                int i5 = this.b + 1;
                this.c = i5;
                hk9 hk9Var = (hk9) obj;
                ah1.u(i5, hk9Var.size());
                Object obj2 = hk9Var.get(i5);
                this.b = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                kz6 kz6Var = ((gm4) obj).a;
                int i2 = this.b - 1;
                this.b = i2;
                Object objF = kz6Var.f(i2);
                objF.getClass();
                return (nu6) objF;
            case 1:
                a();
                int i3 = this.b;
                if (i3 <= 0) {
                    mn5.m();
                    return null;
                }
                int i4 = i3 - 1;
                this.b = i4;
                this.c = i4;
                yy5 yy5Var = (yy5) obj;
                return yy5Var.a[yy5Var.b + i4];
            case 2:
                c();
                int i5 = this.b;
                if (i5 <= 0) {
                    mn5.m();
                    return null;
                }
                int i6 = i5 - 1;
                this.b = i6;
                this.c = i6;
                return ((zy5) obj).a[i6];
            default:
                d();
                hk9 hk9Var = (hk9) obj;
                ah1.u(this.b, hk9Var.size());
                int i7 = this.b;
                this.c = i7;
                this.b--;
                return hk9Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                return (this.b - this.c) - 1;
            case 1:
                i = this.b;
                break;
            case 2:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                yy5 yy5Var = (yy5) obj;
                a();
                int i2 = this.c;
                if (i2 == -1) {
                    gp.j("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                yy5Var.c(i2);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) yy5Var).modCount;
                return;
            case 2:
                zy5 zy5Var = (zy5) obj;
                c();
                int i3 = this.c;
                if (i3 == -1) {
                    gp.j("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                zy5Var.c(i3);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) zy5Var).modCount;
                return;
            default:
                d();
                hk9 hk9Var = (hk9) obj;
                hk9Var.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = ah1.G(hk9Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.c;
                if (i2 != -1) {
                    ((yy5) obj2).set(i2, obj);
                    return;
                } else {
                    gp.j("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                c();
                int i3 = this.c;
                if (i3 != -1) {
                    ((zy5) obj2).set(i3, obj);
                    return;
                } else {
                    gp.j("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                hk9 hk9Var = (hk9) obj2;
                d();
                int i4 = this.c;
                if (i4 < 0) {
                    gp.j("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    hk9Var.set(i4, obj);
                    this.d = ah1.G(hk9Var);
                    return;
                }
        }
    }

    public em4(zy5 zy5Var, int i) {
        this.a = 2;
        this.e = zy5Var;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) zy5Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public em4(gm4 gm4Var, int i, int i2) {
        this(gm4Var, (i2 & 1) != 0 ? 0 : i, 0, gm4Var.a.b);
        this.a = 0;
    }

    public em4(gm4 gm4Var, int i, int i2, int i3) {
        this.a = 0;
        this.e = gm4Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public em4(yy5 yy5Var, int i) {
        this.a = 1;
        this.e = yy5Var;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) yy5Var).modCount;
    }
}
