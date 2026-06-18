package defpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f59 implements v39 {
    public final n59 a;

    public f59(n59 n59Var) {
        n59Var.getClass();
        this.a = n59Var;
    }

    @Override // defpackage.v39
    public final Object b() {
        return new e59(this.a.a(null), null, null);
    }

    @Override // defpackage.v39
    public final void d(Object obj, ge8 ge8Var) throws IOException {
        ((FileOutputStream) ge8Var.b).write(iw9.B(ue5.d.b(e59.Companion.serializer(), (e59) obj)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ey1 */
    @Override // defpackage.v39
    public final Object l(FileInputStream fileInputStream) throws ey1 {
        try {
            te5 te5Var = ue5.d;
            String strZ = iw9.z(p7c.d0(fileInputStream));
            te5Var.getClass();
            return (e59) te5Var.a(e59.Companion.serializer(), strZ);
        } catch (Exception e) {
            throw new ey1("Cannot parse session data", e);
        }
    }
}
