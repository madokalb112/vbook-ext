package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rcb {
    public static final ngb k = ql9.p("http://localhost");
    public String a;
    public boolean b;
    public int c;
    public tcb d;
    public String e;
    public String f;
    public String g;
    public List h;
    public qm7 i;
    public pq7 j;

    public rcb() {
        pm7.b.getClass();
        oc3 oc3Var = om7.b;
        oc3Var.getClass();
        this.a = "";
        this.b = false;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        Set set = lb1.a;
        Charset charset = q31.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        charsetEncoderNewEncoder.getClass();
        int length = "".length();
        wq0 wq0Var = new wq0();
        fx1.Y(charsetEncoderNewEncoder, wq0Var, "", 0, length);
        lb1.f(wq0Var, new kb1(0, sb));
        this.g = sb.toString();
        lc3 lc3Var = lc3.a;
        this.h = new ArrayList(gc1.M(lc3Var, 10));
        qm7 qm7Var = new qm7(5);
        for (String str : oc3Var.names()) {
            List<String> listF = oc3Var.f(str);
            listF = listF == null ? lc3Var : listF;
            String strE = lb1.e(str, false);
            ArrayList arrayList = new ArrayList(gc1.M(listF, 10));
            for (String str2 : listF) {
                str2.getClass();
                arrayList.add(lb1.e(str2, true));
            }
            qm7Var.g(strE, arrayList);
        }
        this.i = qm7Var;
        this.j = new pq7(qm7Var);
    }

    public final void a() {
        if (this.a.length() <= 0 && !d().a.equals("file")) {
            ngb ngbVar = k;
            this.a = ngbVar.a;
            if (this.d == null) {
                this.d = ngbVar.s;
            }
            if (this.c == 0) {
                e(ngbVar.b);
            }
        }
    }

    public final ngb b() {
        a();
        tcb tcbVar = this.d;
        String str = this.a;
        int i = this.c;
        List list = this.h;
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lb1.c((String) it.next()));
        }
        pm7 pm7VarE = pg9.e((qm7) this.j.a);
        String strD = lb1.d(0, this.g, 0, 15);
        String str2 = this.e;
        String strC = str2 != null ? lb1.c(str2) : null;
        String str3 = this.f;
        return new ngb(tcbVar, str, i, arrayList, pm7VarE, strD, strC, str3 != null ? lb1.c(str3) : null, c());
    }

    public final String c() {
        a();
        StringBuilder sb = new StringBuilder(256);
        zk9.i(this, sb);
        return sb.toString();
    }

    public final tcb d() {
        tcb tcbVar = this.d;
        if (tcbVar != null) {
            return tcbVar;
        }
        tcb tcbVar2 = tcb.c;
        return tcb.c;
    }

    public final void e(int i) {
        if (i < 0 || i >= 65536) {
            gp.k(dx1.f(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.c = i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        zk9.i(this, sb);
        return sb.toString();
    }
}
