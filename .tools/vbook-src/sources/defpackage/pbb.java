package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pbb {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final s16 b;
    public volatile int c = 0;

    public pbb(s16 s16Var, int i) {
        this.b = s16Var;
        this.a = i;
    }

    public final int a(int i) {
        pg6 pg6VarB = b();
        int iA = pg6VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) pg6VarB.d;
        int i2 = iA + pg6VarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final pg6 b() {
        ThreadLocal threadLocal = d;
        pg6 pg6Var = (pg6) threadLocal.get();
        if (pg6Var == null) {
            pg6Var = new pg6();
            threadLocal.set(pg6Var);
        }
        qg6 qg6Var = (qg6) this.b.b;
        int iA = qg6Var.a(6);
        if (iA != 0) {
            int i = iA + qg6Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) qg6Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) qg6Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) qg6Var.d;
            pg6Var.d = byteBuffer;
            if (byteBuffer != null) {
                pg6Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                pg6Var.b = i4;
                pg6Var.c = ((ByteBuffer) pg6Var.d).getShort(i4);
                return pg6Var;
            }
            pg6Var.a = 0;
            pg6Var.b = 0;
            pg6Var.c = 0;
        }
        return pg6Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        pg6 pg6VarB = b();
        int iA = pg6VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) pg6VarB.d).getInt(iA + pg6VarB.a) : 0));
        sb.append(", codepoints:");
        pg6 pg6VarB2 = b();
        int iA2 = pg6VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + pg6VarB2.a;
            i = ((ByteBuffer) pg6VarB2.d).getInt(((ByteBuffer) pg6VarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
