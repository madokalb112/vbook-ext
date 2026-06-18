package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class oh5 extends gx3 {
    public static ArrayList U0(zn7 zn7Var, boolean z) throws FileNotFoundException {
        File file = zn7Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (z) {
                if (!file.exists()) {
                    if2.f(zn7Var, "no such file: ");
                    return null;
                }
                so9.m(zn7Var, "failed to list ");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(zn7Var.e(str));
        }
        ic1.l0(arrayList);
        return arrayList;
    }

    @Override // defpackage.gx3
    public final zg5 A0(zn7 zn7Var) {
        return new zg5(false, new RandomAccessFile(zn7Var.toFile(), "r"));
    }

    @Override // defpackage.gx3
    public final zg5 F0(zn7 zn7Var) {
        zn7Var.getClass();
        return new zg5(true, new RandomAccessFile(zn7Var.toFile(), "rw"));
    }

    @Override // defpackage.gx3
    public final void N(zn7 zn7Var) {
        zn7Var.getClass();
        if (zn7Var.toFile().mkdir()) {
            return;
        }
        ow3 ow3VarX0 = x0(zn7Var);
        if (ow3VarX0 == null || !ow3VarX0.b) {
            so9.m(zn7Var, "failed to create directory: ");
        }
    }

    @Override // defpackage.gx3
    public final ag9 O0(zn7 zn7Var, boolean z) throws IOException {
        zn7Var.getClass();
        if (!z || !e0(zn7Var)) {
            return new ri7(new FileOutputStream(zn7Var.toFile(), false), new uua());
        }
        throw new IOException(zn7Var + " already exists.");
    }

    @Override // defpackage.gx3
    public final void R(zn7 zn7Var, boolean z) {
        zn7Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = zn7Var.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            so9.m(zn7Var, "failed to delete ");
        } else if (z) {
            if2.f(zn7Var, "no such file: ");
        }
    }

    @Override // defpackage.gx3
    public final il9 T0(zn7 zn7Var) {
        zn7Var.getClass();
        return tu1.k0(zn7Var.toFile());
    }

    @Override // defpackage.gx3
    public final List g0(zn7 zn7Var) throws FileNotFoundException {
        zn7Var.getClass();
        ArrayList arrayListU0 = U0(zn7Var, true);
        arrayListU0.getClass();
        return arrayListU0;
    }

    @Override // defpackage.gx3
    public final List j0(zn7 zn7Var) {
        zn7Var.getClass();
        return U0(zn7Var, false);
    }

    @Override // defpackage.gx3
    public final ag9 p(zn7 zn7Var) {
        zn7Var.getClass();
        return new ri7(new FileOutputStream(zn7Var.toFile(), true), new uua());
    }

    @Override // defpackage.gx3
    public void q(zn7 zn7Var, zn7 zn7Var2) {
        zn7Var.getClass();
        zn7Var2.getClass();
        if (zn7Var.toFile().renameTo(zn7Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + zn7Var + " to " + zn7Var2);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.gx3
    public ow3 x0(zn7 zn7Var) {
        zn7Var.getClass();
        File file = zn7Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new ow3(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }
}
