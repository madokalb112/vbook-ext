package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ll8 extends gx3 {
    public static final zn7 f;
    public final ClassLoader c;
    public final gx3 d;
    public final d6a e;

    static {
        String str = zn7.b;
        f = xn7.b("/", false);
    }

    public ll8(ClassLoader classLoader) {
        oh5 oh5Var = gx3.a;
        oh5Var.getClass();
        this.c = classLoader;
        this.d = oh5Var;
        this.e = new d6a(new wn6(this, 21));
    }

    public static String U0(zn7 zn7Var) {
        zn7 zn7Var2 = f;
        zn7Var2.getClass();
        zn7Var.getClass();
        return e.b(zn7Var2, zn7Var, true).d(zn7Var2).a.s();
    }

    @Override // defpackage.gx3
    public final zg5 A0(zn7 zn7Var) throws FileNotFoundException {
        if (!p38.a(zn7Var)) {
            if2.f(zn7Var, "file not found: ");
            return null;
        }
        String strU0 = U0(zn7Var);
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            xl7 xl7Var = (xl7) it.next();
            try {
                return ((gx3) xl7Var.a).A0(((zn7) xl7Var.b).e(strU0));
            } catch (FileNotFoundException unused) {
            }
        }
        if2.f(zn7Var, "file not found: ");
        return null;
    }

    @Override // defpackage.gx3
    public final zg5 F0(zn7 zn7Var) throws IOException {
        zn7Var.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.gx3
    public final void N(zn7 zn7Var) throws IOException {
        zn7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gx3
    public final ag9 O0(zn7 zn7Var, boolean z) throws IOException {
        zn7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gx3
    public final void R(zn7 zn7Var, boolean z) throws IOException {
        zn7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gx3
    public final il9 T0(zn7 zn7Var) throws IOException {
        zn7Var.getClass();
        if (!p38.a(zn7Var)) {
            if2.f(zn7Var, "file not found: ");
            return null;
        }
        zn7 zn7Var2 = f;
        zn7Var2.getClass();
        URL resource = this.c.getResource(e.b(zn7Var2, zn7Var, false).d(zn7Var2).a.s());
        if (resource == null) {
            if2.f(zn7Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return tu1.l0(inputStream);
    }

    @Override // defpackage.gx3
    public final List g0(zn7 zn7Var) throws FileNotFoundException {
        zn7Var.getClass();
        String strU0 = U0(zn7Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (xl7 xl7Var : (List) this.e.getValue()) {
            gx3 gx3Var = (gx3) xl7Var.a;
            zn7 zn7Var2 = (zn7) xl7Var.b;
            try {
                List listG0 = gx3Var.g0(zn7Var2.e(strU0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG0) {
                    if (p38.a((zn7) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(gc1.M(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(p38.b((zn7) obj2, zn7Var2));
                }
                fc1.p0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return fc1.Z0(linkedHashSet);
        }
        if2.f(zn7Var, "file not found: ");
        return null;
    }

    @Override // defpackage.gx3
    public final List j0(zn7 zn7Var) {
        zn7Var.getClass();
        String strU0 = U0(zn7Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.e.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            xl7 xl7Var = (xl7) it.next();
            gx3 gx3Var = (gx3) xl7Var.a;
            zn7 zn7Var2 = (zn7) xl7Var.b;
            List listJ0 = gx3Var.j0(zn7Var2.e(strU0));
            if (listJ0 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listJ0) {
                    if (p38.a((zn7) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(gc1.M(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(p38.b((zn7) obj2, zn7Var2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                fc1.p0(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return fc1.Z0(linkedHashSet);
        }
        return null;
    }

    @Override // defpackage.gx3
    public final ag9 p(zn7 zn7Var) throws IOException {
        zn7Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gx3
    public final void q(zn7 zn7Var, zn7 zn7Var2) throws IOException {
        zn7Var.getClass();
        zn7Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.gx3
    public final ow3 x0(zn7 zn7Var) {
        zn7Var.getClass();
        if (!p38.a(zn7Var)) {
            return null;
        }
        String strU0 = U0(zn7Var);
        for (xl7 xl7Var : (List) this.e.getValue()) {
            ow3 ow3VarX0 = ((gx3) xl7Var.a).x0(((zn7) xl7Var.b).e(strU0));
            if (ow3VarX0 != null) {
                return ow3VarX0;
            }
        }
        return null;
    }
}
