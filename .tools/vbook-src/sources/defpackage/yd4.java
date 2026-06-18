package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class yd4 implements Iterator, fi5 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;

    public yd4(wz6 wz6Var) {
        this.a = 2;
        this.d = wz6Var;
        this.b = -1;
        this.c = ex1.Y(new vz6(wz6Var, this, null));
    }

    public void a() {
        Object objInvoke;
        int i = this.b;
        r04 r04Var = (r04) this.d;
        if (i == -2) {
            objInvoke = ((ib4) r04Var.b).invoke();
        } else {
            kb4 kb4Var = (kb4) r04Var.c;
            Object obj = this.c;
            obj.getClass();
            objInvoke = kb4Var.invoke(obj);
        }
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 1) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (this.b < ((Map) obj).size()) {
                }
                break;
            default:
                vx9 vx9Var = (vx9) obj;
                Iterator it = (Iterator) this.c;
                while (this.b < vx9Var.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                if (this.b < vx9Var.c && it.hasNext()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    mn5.m();
                    return null;
                }
                Object obj3 = this.c;
                obj3.getClass();
                this.b = -1;
                return obj3;
            case 1:
                return ((b39) this.c).next();
            case 2:
                return ((b39) this.c).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.c;
                    this.b++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.c = ((vy5) obj4).b;
                } else {
                    mn5.m();
                }
                return obj2;
            default:
                vx9 vx9Var = (vx9) obj;
                Iterator it = (Iterator) this.c;
                while (this.b < vx9Var.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i2 = this.b;
                if (i2 < vx9Var.c) {
                    this.b = i2 + 1;
                    return it.next();
                }
                mn5.m();
                return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.b;
                if (i2 != -1) {
                    ((nz6) obj).b.h(i2);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.b;
                if (i3 != -1) {
                    ((wz6) obj).b.m(i3);
                    this.b = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yd4(vx9 vx9Var) {
        this.a = 4;
        this.d = vx9Var;
        this.c = vx9Var.a.iterator();
    }

    public yd4(r04 r04Var) {
        this.a = 0;
        this.d = r04Var;
        this.b = -2;
    }

    public yd4(Object obj, Map map) {
        this.a = 3;
        this.c = obj;
        this.d = map;
    }

    public yd4(nz6 nz6Var) {
        this.a = 1;
        this.d = nz6Var;
        this.b = -1;
        this.c = ex1.Y(new mz6(nz6Var, this, null));
    }
}
