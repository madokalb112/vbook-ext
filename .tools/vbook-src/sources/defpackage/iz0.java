package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iz0 implements Iterator, fi5 {
    public final /* synthetic */ int a;
    public int b;
    public String c;
    public final /* synthetic */ mz0 d;

    public iz0(mz0 mz0Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = mz0Var;
                while (true) {
                    int i2 = this.b;
                    mz0 mz0Var2 = this.d;
                    if (i2 < mz0Var2.e) {
                        int i3 = mz0Var2.d[i2];
                        if (i3 < 0 || mz0Var2.a[i3] == null) {
                            this.b = i2 + 1;
                        }
                    }
                    break;
                }
                break;
            case 2:
                this.d = mz0Var;
                while (true) {
                    int i4 = this.b;
                    mz0 mz0Var3 = this.d;
                    if (i4 < mz0Var3.e) {
                        int i5 = mz0Var3.d[i4];
                        if (i5 < 0 || mz0Var3.a[i5] == null) {
                            this.b = i4 + 1;
                        }
                    }
                    break;
                }
                break;
            default:
                this.d = mz0Var;
                while (true) {
                    int i6 = this.b;
                    mz0 mz0Var4 = this.d;
                    if (i6 < mz0Var4.e) {
                        int i7 = mz0Var4.d[i6];
                        if (i7 < 0 || mz0Var4.a[i7] == null) {
                            this.b = i6 + 1;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        mz0 mz0Var = this.d;
        switch (i) {
            case 0:
                if (this.b < mz0Var.e) {
                }
                break;
            case 1:
                if (this.b < mz0Var.e) {
                }
                break;
            default:
                if (this.b < mz0Var.e) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        Object obj = null;
        mz0 mz0Var = this.d;
        switch (i4) {
            case 0:
                if (!hasNext()) {
                    mn5.m();
                    return null;
                }
                int i5 = mz0Var.d[this.b];
                String str = mz0Var.a[i5];
                str.getClass();
                this.c = str;
                Object obj2 = mz0Var.b[i5];
                obj2.getClass();
                kz0 kz0Var = new kz0(mz0Var, str, obj2);
                this.b++;
                while (true) {
                    int i6 = this.b;
                    if (i6 < mz0Var.e && ((i = mz0Var.d[i6]) < 0 || mz0Var.a[i] == null)) {
                        this.b = i6 + 1;
                    }
                }
                return kz0Var;
            case 1:
                if (!hasNext()) {
                    mn5.m();
                    return null;
                }
                String str2 = mz0Var.a[mz0Var.d[this.b]];
                str2.getClass();
                this.c = str2;
                this.b++;
                while (true) {
                    int i7 = this.b;
                    if (i7 < mz0Var.e && ((i2 = mz0Var.d[i7]) < 0 || mz0Var.a[i2] == null)) {
                        this.b = i7 + 1;
                    }
                }
                String str3 = this.c;
                str3.getClass();
                return str3;
            default:
                if (hasNext()) {
                    int i8 = mz0Var.d[this.b];
                    String str4 = mz0Var.a[i8];
                    str4.getClass();
                    this.c = str4;
                    obj = mz0Var.b[i8];
                    obj.getClass();
                    this.b++;
                    while (true) {
                        int i9 = this.b;
                        if (i9 < mz0Var.e && ((i3 = mz0Var.d[i9]) < 0 || mz0Var.a[i3] == null)) {
                            this.b = i9 + 1;
                        }
                    }
                } else {
                    mn5.m();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        mz0 mz0Var = this.d;
        switch (i) {
            case 0:
                String str = this.c;
                if (str == null) {
                    gp.j("next() must be called before remove()");
                } else {
                    mz0Var.remove(str);
                    this.c = null;
                }
                break;
            case 1:
                String str2 = this.c;
                if (str2 == null) {
                    gp.j("next() must be called before remove()");
                } else {
                    mz0Var.remove(str2);
                    this.c = null;
                }
                break;
            default:
                String str3 = this.c;
                if (str3 == null) {
                    gp.j("next() must be called before remove()");
                } else {
                    mz0Var.remove(str3);
                    this.c = null;
                }
                break;
        }
    }
}
