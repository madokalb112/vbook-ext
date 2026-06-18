package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sn8 implements wn8 {
    public final String b;
    public final String c;
    public final ng d;
    public final long e;
    public final float f;
    public final c64 g;

    public sn8(String str, String str2, ng ngVar, long j, float f, c64 c64Var) {
        str2.getClass();
        this.b = str;
        this.c = str2;
        this.d = ngVar;
        this.e = j;
        this.f = f;
        this.g = c64Var;
    }

    @Override // defpackage.wn8
    public final void b(r43 r43Var, qha qhaVar, long j, yn8 yn8Var, float f, float f2) {
        ng ngVar = this.d;
        Bitmap bitmap = ngVar.a;
        r43Var.getClass();
        yn8Var.getClass();
        int i = pja.c;
        int i2 = (int) (j >> 32);
        if (i2 >= qhaVar.a.a.b.length()) {
            return;
        }
        kf8 kf8VarB = qhaVar.b(i2);
        float f3 = kf8VarB.b;
        float f4 = kf8VarB.d;
        float f5 = kf8VarB.a;
        float f6 = kf8VarB.c - f5;
        float f7 = f4 - f3;
        float fMin = Math.min(f6 / bitmap.getWidth(), f7 / bitmap.getHeight());
        int width = (int) (bitmap.getWidth() * fMin);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmap.getHeight() * fMin);
        int i3 = height >= 1 ? height : 1;
        r43.F0(r43Var, ngVar, 0L, (((long) ((int) dx1.b(f7, i3, 2.0f, f3))) & 4294967295L) | (((long) ((int) dx1.b(f6, width, 2.0f, f5))) << 32), (((long) i3) & 4294967295L) | (((long) width) << 32), 0.0f, (qc1) null, 1, 422);
    }

    @Override // defpackage.wn8
    public final kb4 c() {
        return new hy7(this, 8);
    }

    @Override // defpackage.wn8
    public final boolean d() {
        return false;
    }

    @Override // defpackage.wn8
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sn8) {
            return this.b.equals(((sn8) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
