package okhttp3.internal.ws;

import defpackage.av0;
import defpackage.lr0;
import defpackage.vq0;
import defpackage.xq0;
import java.io.Closeable;
import java.util.Random;
import okhttp3.internal._UtilCommonKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class WebSocketWriter implements Closeable {
    public final lr0 a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final xq0 f;
    public final xq0 s;
    public boolean t;
    public MessageDeflater u;
    public final byte[] v;
    public final vq0 w;

    public WebSocketWriter(lr0 lr0Var, Random random, boolean z, boolean z2, long j) {
        lr0Var.getClass();
        this.a = lr0Var;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = new xq0();
        this.s = lr0Var.b();
        this.v = new byte[4];
        this.w = new vq0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageDeflater messageDeflater = this.u;
        if (messageDeflater != null) {
            _UtilCommonKt.b(messageDeflater);
        }
        _UtilCommonKt.b(this.a);
    }

    public final void p(int i, av0 av0Var) {
        if (this.t) {
            sy3.m("closed");
            return;
        }
        int iD = av0Var.d();
        if (iD > 125) {
            gp.l("Payload size must be less than or equal to 125");
            return;
        }
        int i2 = i | Token.CASE;
        xq0 xq0Var = this.s;
        xq0Var.O0(i2);
        xq0Var.O0(iD | Token.CASE);
        byte[] bArr = this.v;
        bArr.getClass();
        this.b.nextBytes(bArr);
        xq0Var.write(bArr, 0, bArr.length);
        if (iD > 0) {
            long j = xq0Var.b;
            xq0Var.F0(av0Var);
            vq0 vq0Var = this.w;
            vq0Var.getClass();
            xq0Var.a0(vq0Var);
            vq0Var.q(j);
            WebSocketProtocol.b(vq0Var, bArr);
            vq0Var.close();
        }
        this.a.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r22, defpackage.av0 r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketWriter.q(int, av0):void");
    }
}
