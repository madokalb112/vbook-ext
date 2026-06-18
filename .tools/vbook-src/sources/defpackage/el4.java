package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class el4 extends n31 {
    public int b;
    public int c;
    public byte d;
    public byte e;
    public if9 f;
    public if9 g;

    @Override // defpackage.n31
    public final String a() {
        if9 if9Var;
        int i = this.b - this.c;
        if (i >= 5) {
            return "WINDOWS-1255";
        }
        if (i <= -5) {
            return "ISO-8859-8";
        }
        if9 if9Var2 = this.f;
        if (if9Var2 == null || (if9Var = this.g) == null) {
            return "WINDOWS-1255";
        }
        float fB = if9Var2.b() - if9Var.b();
        return fB > 0.01f ? "WINDOWS-1255" : (fB >= -0.01f && i >= 0) ? "WINDOWS-1255" : "ISO-8859-8";
    }

    @Override // defpackage.n31
    public final float b() {
        return 0.0f;
    }

    @Override // defpackage.n31
    public final m31 c(int i, byte[] bArr) {
        if9 if9Var = this.f;
        if9 if9Var2 = this.g;
        m31 m31Var = m31.a;
        m31 m31Var2 = m31.c;
        if (((if9Var == null || if9Var2 == null || if9Var.e != m31Var2 || if9Var2.e != m31Var2) ? m31Var : m31Var2) == m31Var2) {
            return m31Var2;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            byte b2 = this.e;
            if (b == 32) {
                if (b2 != 32) {
                    if (mc8.o(this.d)) {
                        this.b++;
                    } else {
                        int i3 = this.d & 255;
                        if (i3 == 235 || i3 == 238 || i3 == 240 || i3 == 244) {
                            this.c++;
                        }
                    }
                }
            } else if (b2 == 32 && mc8.o(this.d) && b != 32) {
                this.c++;
            }
            this.e = this.d;
            this.d = b;
        }
        return m31Var;
    }

    @Override // defpackage.n31
    public final void d() {
        this.b = 0;
        this.c = 0;
        this.d = (byte) 32;
        this.e = (byte) 32;
    }
}
