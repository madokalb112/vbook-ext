package defpackage;

import java.io.IOException;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nh5 implements py {
    public final int a;
    public final String b;
    public final int c;
    public final AsynchronousServerSocketChannel d;

    public nh5(int i, String str, int i2) throws IOException {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        AsynchronousServerSocketChannel asynchronousServerSocketChannelOpen = AsynchronousServerSocketChannel.open();
        asynchronousServerSocketChannelOpen.getClass();
        this.d = asynchronousServerSocketChannelOpen;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        heb hebVar = heb.a;
        try {
            this.d.close();
            return hebVar;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            if (th instanceof AsynchronousCloseException) {
                return hebVar;
            }
            th.printStackTrace();
            return hebVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.py
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lh5
            if (r0 == 0) goto L13
            r0 = r5
            lh5 r0 = (defpackage.lh5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lh5 r0 = new lh5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            nh5 r4 = r0.a
            defpackage.e11.e0(r5)     // Catch: java.util.concurrent.CancellationException -> L27
            goto L66
        L27:
            r5 = move-exception
            goto L6e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.e11.e0(r5)
            r0.a = r4     // Catch: java.util.concurrent.CancellationException -> L27
            r0.d = r2     // Catch: java.util.concurrent.CancellationException -> L27
            ay0 r5 = new ay0     // Catch: java.util.concurrent.CancellationException -> L27
            jt1 r0 = bx1.J(r0)     // Catch: java.util.concurrent.CancellationException -> L27
            r5.<init>(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L27
            r5.u()     // Catch: java.util.concurrent.CancellationException -> L27
            ng8 r0 = new ng8     // Catch: java.util.concurrent.CancellationException -> L27
            r0.<init>()     // Catch: java.util.concurrent.CancellationException -> L27
            jh5 r1 = new jh5     // Catch: java.util.concurrent.CancellationException -> L27
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.util.concurrent.CancellationException -> L27
            r5.w(r1)     // Catch: java.util.concurrent.CancellationException -> L27
            kh5 r1 = new kh5     // Catch: java.util.concurrent.CancellationException -> L27
            r1.<init>(r0, r5, r2)     // Catch: java.util.concurrent.CancellationException -> L27
            java.nio.channels.AsynchronousServerSocketChannel r0 = r4.d     // Catch: java.util.concurrent.CancellationException -> L27
            heb r2 = defpackage.heb.a     // Catch: java.util.concurrent.CancellationException -> L27
            r0.accept(r2, r1)     // Catch: java.util.concurrent.CancellationException -> L27
            java.lang.Object r5 = r5.s()     // Catch: java.util.concurrent.CancellationException -> L27
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L66
            return r0
        L66:
            java.nio.channels.AsynchronousSocketChannel r5 = (java.nio.channels.AsynchronousSocketChannel) r5     // Catch: java.util.concurrent.CancellationException -> L27
            ih5 r0 = new ih5     // Catch: java.util.concurrent.CancellationException -> L27
            r0.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L27
            return r0
        L6e:
            java.nio.channels.AsynchronousServerSocketChannel r4 = r4.d
            r4.close()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh5.d(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:22:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.jt1 r7) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.mh5
            if (r0 == 0) goto L13
            r0 = r7
            mh5 r0 = (defpackage.mh5) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            mh5 r0 = new mh5
            kt1 r7 = (defpackage.kt1) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            int r6 = r0.b
            nh5 r1 = r0.a
            defpackage.e11.e0(r7)
            r7 = r1
            goto L67
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.e11.e0(r7)
            java.nio.channels.AsynchronousServerSocketChannel r7 = r6.d
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress
            java.lang.String r3 = r6.b
            int r4 = r6.a
            r1.<init>(r3, r4)
            int r3 = r6.c
            r7.bind(r1, r3)
            r7 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L4a:
            r1 = 100
            if (r6 >= r1) goto L69
            java.nio.channels.AsynchronousServerSocketChannel r1 = r7.d
            boolean r1 = r1.isOpen()
            if (r1 != 0) goto L69
            r0.a = r7
            r0.b = r6
            r0.e = r2
            r3 = 50
            java.lang.Object r1 = defpackage.tw1.H(r3, r0)
            xx1 r3 = defpackage.xx1.a
            if (r1 != r3) goto L67
            return r3
        L67:
            int r6 = r6 + r2
            goto L4a
        L69:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh5.i(jt1):java.lang.Object");
    }
}
