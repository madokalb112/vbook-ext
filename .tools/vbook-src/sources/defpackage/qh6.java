package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qh6 {
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public qh6(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.d = str;
        this.a = i2;
        this.b = i3;
        this.c = Integer.MIN_VALUE;
        this.e = "";
    }

    public void a() {
        int i = this.c;
        this.c = i == Integer.MIN_VALUE ? this.a : i + this.b;
        this.e = ((String) this.d) + this.c;
    }

    public void b() {
        if (this.c != Integer.MIN_VALUE) {
            return;
        }
        gp.j("generateNewId() must be called before retrieving ids.");
    }

    public byte c() {
        int i = this.a;
        rh6 rh6Var = (rh6) this.e;
        em7 em7Var = rh6Var.e;
        if (i < em7Var.b) {
            ts0 ts0Var = (ts0) this.d;
            int length = ts0Var.a.length - ts0Var.b;
            byte b = 0;
            if (Math.max(0, length) == 0) {
                int i2 = this.a + 1;
                this.a = i2;
                if (i2 < em7Var.b) {
                    this.d = new ts0(rh6Var.e(i2), 0, false);
                }
            }
            ts0 ts0Var2 = (ts0) this.d;
            int i3 = ts0Var2.b;
            ts0Var2.b = i3 + 1;
            byte[] bArr = ts0Var2.a;
            if (i3 >= 0 && i3 < bArr.length) {
                b = bArr[i3];
            }
            this.b--;
            this.c++;
            return b;
        }
        return (byte) -1;
    }

    public void d(long j) {
        rh6 rh6Var = (rh6) this.e;
        ArrayList arrayList = rh6Var.l;
        if (j == 0) {
            return;
        }
        int iMin = Math.min(this.b, (int) j);
        ts0 ts0Var = (ts0) this.d;
        if (iMin < Math.max(0, ts0Var.a.length - ts0Var.b)) {
            ((ts0) this.d).b += iMin;
            this.b -= iMin;
            this.c += iMin;
            return;
        }
        int iAbs = Math.abs(gc1.G(arrayList, Integer.valueOf(this.c + iMin)) + 1);
        this.a = iAbs;
        this.d = new ts0(rh6Var.e(iAbs), 0, false);
        Integer num = (Integer) fc1.A0(this.a - 1, arrayList);
        int iIntValue = num != null ? num.intValue() : 0;
        ts0 ts0Var2 = (ts0) this.d;
        int i = this.c;
        ts0Var2.b += (i + iMin) - iIntValue;
        this.b -= iMin;
        this.c = i + iMin;
    }

    public qh6(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public qh6(rh6 rh6Var) {
        this.e = rh6Var;
        this.a = -1;
        this.d = new ts0(new byte[0], 0, false);
        this.b = ((Number) fc1.E0(rh6Var.l)).intValue();
    }
}
