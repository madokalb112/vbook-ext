package okhttp3.internal.publicsuffix;

import defpackage.av0;
import defpackage.ie8;
import defpackage.il9;
import defpackage.lc5;
import defpackage.tu1;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public av0 c;
    public av0 d;
    public IOException e;

    public final av0 a() {
        av0 av0Var = this.c;
        if (av0Var != null) {
            return av0Var;
        }
        lc5.i0("bytes");
        throw null;
    }

    public abstract il9 b();

    public final void c() {
        try {
            ie8 ie8VarS = tu1.s(b());
            try {
                av0 av0VarZ = ie8VarS.z(ie8VarS.readInt());
                av0 av0VarZ2 = ie8VarS.z(ie8VarS.readInt());
                ie8VarS.close();
                synchronized (this) {
                    av0VarZ.getClass();
                    this.c = av0VarZ;
                    av0VarZ2.getClass();
                    this.d = av0VarZ2;
                }
            } finally {
            }
        } finally {
            this.b.countDown();
        }
    }
}
