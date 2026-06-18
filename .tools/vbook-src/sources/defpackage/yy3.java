package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yy3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy3 b;

    public /* synthetic */ yy3(zy3 zy3Var, int i) {
        this.a = i;
        this.b = zy3Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        r80 r80VarA;
        r80 r80VarH;
        int i = this.a;
        zy3 zy3Var = this.b;
        switch (i) {
            case 0:
                zy3Var.a();
                return;
            case 1:
                zy3Var.a();
                return;
            default:
                Object obj = zy3.m;
                synchronized (obj) {
                    try {
                        gy3 gy3Var = zy3Var.a;
                        gy3Var.a();
                        c85 c85VarP = c85.p(gy3Var.a);
                        try {
                            r80VarA = zy3Var.c.A();
                            if (c85VarP != null) {
                                c85VarP.C();
                            }
                        } catch (Throwable th) {
                            if (c85VarP != null) {
                                c85VarP.C();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i2 = r80VarA.b;
                    if (i2 == 5) {
                        r80VarH = zy3Var.h(r80VarA);
                    } else {
                        if (i2 == 3) {
                            r80VarH = zy3Var.h(r80VarA);
                        } else if (!zy3Var.d.a(r80VarA)) {
                            return;
                        } else {
                            r80VarH = zy3Var.b(r80VarA);
                        }
                    }
                    synchronized (obj) {
                        try {
                            gy3 gy3Var2 = zy3Var.a;
                            gy3Var2.a();
                            c85 c85VarP2 = c85.p(gy3Var2.a);
                            try {
                                zy3Var.c.v(r80VarH);
                                if (c85VarP2 != null) {
                                    c85VarP2.C();
                                }
                            } catch (Throwable th2) {
                                if (c85VarP2 != null) {
                                    c85VarP2.C();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (zy3Var) {
                        try {
                            if (zy3Var.k.size() != 0 && !TextUtils.equals(r80VarA.a, r80VarH.a)) {
                                Iterator it = zy3Var.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (r80VarH.b == 4) {
                        String str = r80VarH.a;
                        synchronized (zy3Var) {
                            zy3Var.j = str;
                        }
                    }
                    int i3 = r80VarH.b;
                    if (i3 == 5) {
                        zy3Var.i(new bz3());
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        zy3Var.i(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        zy3Var.j(r80VarH);
                        return;
                    }
                } catch (bz3 e) {
                    zy3Var.i(e);
                    return;
                }
        }
    }
}
