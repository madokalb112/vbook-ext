package defpackage;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o90 {
    public static a52 a(v39 v39Var, q43 q43Var, iw0 iw0Var, ib4 ib4Var) {
        lc3 lc3Var = lc3.a;
        int i = 5;
        jt1 jt1Var = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new a52(new zw3(v39Var, new zs5(iw0Var, 16), ib4Var), gc1.Y(new et1(lc3Var, jt1Var, i)), q43Var, iw0Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new a52(new zw3(v39Var, new se3(18), ib4Var), gc1.Y(new et1(lc3Var, jt1Var, i)), q43Var, iw0Var);
        }
    }

    public static AutofillValue b(String str) {
        if (str.length() >= 5000) {
            str = (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? bw9.z0(4999, str) : bw9.z0(5000, str);
        }
        return AutofillValue.forText(str);
    }

    public static AutofillValue c(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static void e(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && lc5.Q(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            so9.m(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (parentFile.mkdirs() || parentFile.isDirectory()) {
                return;
            }
            so9.m(parentFile, "Failed to create directory: ");
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }

    public static void f(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void h(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void i(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void j(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static void k(ViewStructure viewStructure) {
        viewStructure.setInputType(Token.DEFAULT);
    }

    public static int l(Set set) {
        boolean zContains = set.contains(PosixFilePermission.OWNER_READ);
        boolean zContains2 = set.contains(PosixFilePermission.OWNER_WRITE);
        boolean zContains3 = set.contains(PosixFilePermission.OWNER_EXECUTE);
        int i = zContains ? 4 : 0;
        int i2 = zContains2 ? i | 2 : i & (-3);
        int i3 = zContains3 ? i2 | 1 : i2 & (-2);
        boolean zContains4 = set.contains(PosixFilePermission.GROUP_READ);
        boolean zContains5 = set.contains(PosixFilePermission.GROUP_WRITE);
        boolean zContains6 = set.contains(PosixFilePermission.GROUP_EXECUTE);
        int i4 = zContains4 ? 4 : 0;
        int i5 = zContains5 ? i4 | 2 : i4 & (-3);
        int i6 = zContains6 ? i5 | 1 : i5 & (-2);
        boolean zContains7 = set.contains(PosixFilePermission.OTHERS_READ);
        boolean zContains8 = set.contains(PosixFilePermission.OTHERS_WRITE);
        boolean zContains9 = set.contains(PosixFilePermission.OTHERS_EXECUTE);
        int i7 = zContains7 ? 4 : 0;
        int i8 = zContains8 ? i7 | 2 : i7 & (-3);
        return kc5.B(kc5.B(kc5.B(kc5.B(0, i3, 6, 3), i6, 3, 3), zContains9 ? i8 | 1 : i8 & (-2), 0, 3), 0, 9, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.qd0 r5, java.io.File r6, defpackage.inb r7, java.lang.String r8, defpackage.kt1 r9) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            boolean r0 = r9 instanceof kd0
            if (r0 == 0) goto L13
            r0 = r9
            kd0 r0 = (kd0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kd0 r0 = new kd0
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r4 = r0.d
            int r9 = r0.f
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L32
            if (r9 != r2) goto L2c
            java.lang.String r8 = r0.c
            inb r7 = r0.b
            qd0 r5 = r0.a
            defpackage.e11.e0(r4)     // Catch: java.nio.file.NoSuchFileException -> L5c
            goto L4b
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r1
        L32:
            defpackage.e11.e0(r4)
            wm r4 = new wm     // Catch: java.nio.file.NoSuchFileException -> L5c
            r4.<init>(r6, r7, r1, r2)     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.a = r5     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.b = r7     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.c = r8     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.f = r2     // Catch: java.nio.file.NoSuchFileException -> L5c
            java.lang.Object r4 = defpackage.pu1.n0(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L5c
            xx1 r6 = defpackage.xx1.a
            if (r4 != r6) goto L4b
            return r6
        L4b:
            java.io.RandomAccessFile r4 = (java.io.RandomAccessFile) r4     // Catch: java.nio.file.NoSuchFileException -> L5c
            nd0 r6 = new nd0     // Catch: java.nio.file.NoSuchFileException -> L5c
            r6.<init>(r4, r7, r5, r8)     // Catch: java.nio.file.NoSuchFileException -> L5c
            long r4 = r4.getFilePointer()     // Catch: java.nio.file.NoSuchFileException -> L5c
            yy r7 = new yy     // Catch: java.nio.file.NoSuchFileException -> L5c
            r7.<init>(r6, r4)     // Catch: java.nio.file.NoSuchFileException -> L5c
            return r7
        L5c:
            r4 = move-exception
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o90.d(qd0, java.io.File, inb, java.lang.String, kt1):java.lang.Object");
    }
}
