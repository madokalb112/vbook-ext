package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ld0 extends o1a implements kb4 {
    public final /* synthetic */ RandomAccessFile a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(RandomAccessFile randomAccessFile, long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = randomAccessFile;
        this.b = j;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new ld0(this.a, this.b, this.c, this.d, this.e, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        return ((ld0) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws IOException {
        e11.e0(obj);
        long j = this.b;
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(j);
        return new Integer(randomAccessFile.read(this.c, this.d, this.e));
    }
}
