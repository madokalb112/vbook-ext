package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xt7 implements oi5 {
    public static final xt7 a = new xt7();
    public static final o28 b = fx1.m("io.github.vinceglb.filekit.PlatformFile", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        wt7 wt7Var = (wt7) obj;
        wt7Var.getClass();
        md2Var.Y(vo1.X(wt7Var));
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        String strS = yd2Var.s();
        strS.getClass();
        if (!iw9.K(strS, "content://", true) && !iw9.K(strS, "file://", true)) {
            return new wt7(new dg(new File(strS)));
        }
        Uri uri = Uri.parse(strS);
        uri.getClass();
        return vo1.A(uri);
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
