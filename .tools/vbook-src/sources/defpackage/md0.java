package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class md0 extends o1a implements kb4 {
    public final /* synthetic */ inb a;
    public final /* synthetic */ RandomAccessFile b;
    public final /* synthetic */ long c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(inb inbVar, RandomAccessFile randomAccessFile, long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = inbVar;
        this.b = randomAccessFile;
        this.c = j;
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new md0(this.a, this.b, this.c, this.d, this.e, this.f, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws IOException {
        md0 md0Var = (md0) create((jt1) obj);
        heb hebVar = heb.a;
        md0Var.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws IOException {
        e11.e0(obj);
        boolean z = this.a.e;
        RandomAccessFile randomAccessFile = this.b;
        if (!z) {
            randomAccessFile.seek(this.c);
        }
        randomAccessFile.write(this.d, this.e, this.f);
        return heb.a;
    }
}
