package okhttp3.internal.connection;

import defpackage.ag9;
import defpackage.he8;
import defpackage.ie8;
import defpackage.il9;
import defpackage.lr0;
import defpackage.mr0;
import defpackage.pk9;
import defpackage.tu1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class BufferedSocketKt$asBufferedSocket$1 implements BufferedSocket {
    public final pk9 a;
    public final ie8 b;
    public final he8 c;

    public BufferedSocketKt$asBufferedSocket$1(pk9 pk9Var) {
        this.a = pk9Var;
        this.b = tu1.s(pk9Var.c());
        this.c = tu1.r(pk9Var.b());
    }

    @Override // okhttp3.internal.connection.BufferedSocket, defpackage.pk9
    public final lr0 b() {
        return this.c;
    }

    @Override // okhttp3.internal.connection.BufferedSocket, defpackage.pk9
    public final mr0 c() {
        return this.b;
    }

    @Override // defpackage.pk9
    public final void cancel() {
        this.a.cancel();
    }

    @Override // defpackage.pk9
    public final ag9 b() {
        return this.c;
    }

    @Override // defpackage.pk9
    public final il9 c() {
        return this.b;
    }
}
