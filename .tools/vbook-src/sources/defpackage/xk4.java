package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xk4 implements tvb {
    public final /* synthetic */ yk4 a;

    public xk4(yk4 yk4Var) {
        this.a = yk4Var;
    }

    @Override // defpackage.tvb
    public final uc6 i(String str) {
        bi1 bi1Var;
        boolean z;
        yk4 yk4Var = this.a;
        synchronized (yk4Var.h) {
            try {
                yk4Var.c.add(str);
                jk4 jk4Var = yk4Var.g;
                if (jk4Var != null) {
                    ArrayList arrayList = jk4Var.a;
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((yg8) obj).e(str)) {
                                bi1Var = jk4Var.b;
                                break;
                            }
                        }
                    }
                    bi1Var = null;
                } else {
                    bi1Var = null;
                }
                List list = yk4Var.d;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((yg8) it.next()).e(str)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bi1Var != null) {
            bi1Var.Q(heb.a);
        }
        if (z) {
            return new uc6(new byte[0]);
        }
        return null;
    }

    @Override // defpackage.tvb
    public final void n(String str, ky4 ky4Var) {
        str.getClass();
    }

    @Override // defpackage.tvb
    public final void o(String str) {
        bi1 bi1Var;
        yk4 yk4Var = this.a;
        synchronized (yk4Var.h) {
            bi1Var = yk4Var.f;
        }
        if (bi1Var != null) {
            bi1Var.Q(heb.a);
        }
    }

    @Override // defpackage.tvb
    public final void j(int i) {
    }
}
