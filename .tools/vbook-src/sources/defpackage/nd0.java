package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nd0 extends zy {
    public final /* synthetic */ RandomAccessFile a;
    public final /* synthetic */ inb b;
    public final /* synthetic */ ymb c;
    public final /* synthetic */ String d;

    public nd0(RandomAccessFile randomAccessFile, inb inbVar, ymb ymbVar, String str) {
        this.a = randomAccessFile;
        this.b = inbVar;
        this.c = ymbVar;
        this.d = str;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) throws IOException {
        this.a.close();
        return heb.a;
    }

    @Override // defpackage.zy, defpackage.fx
    public final Object e(kt1 kt1Var) {
        return pu1.n0(new xm(this.a, null, 1), kt1Var);
    }

    @Override // defpackage.zy
    public final Object i(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        return pu1.n0(new ld0(this.a, j, bArr, i, i2, null), (kt1) jt1Var);
    }

    @Override // defpackage.zy
    public final Object j(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        Object objN0 = pu1.n0(new md0(this.b, this.a, j, bArr, i, i2, null), (kt1) jt1Var);
        return objN0 == xx1.a ? objN0 : heb.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('(');
        return xv5.s(sb, this.d, ')');
    }
}
