package defpackage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class od0 extends o1a implements kb4 {
    public final /* synthetic */ File a;
    public final /* synthetic */ ymb b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(File file, ymb ymbVar, String str, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = file;
        this.b = ymbVar;
        this.c = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new od0(this.a, this.b, this.c, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        return ((od0) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        e11.e0(obj);
        j46 j46Var = ah5.a;
        File file = this.a;
        boolean zExists = file.exists();
        String str = this.c;
        ymb ymbVar = this.b;
        if (!zExists || !ah5.a(file)) {
            return ymb.j(ymbVar, str);
        }
        double dLastModified = file.lastModified();
        boolean zIsDirectory = file.isDirectory();
        long length = file.length();
        try {
            Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(file.toPath(), new LinkOption[0]);
            posixFilePermissions.getClass();
            pm8Var = new Integer(o90.l(posixFilePermissions));
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (pm8Var instanceof pm8) {
            pm8Var = null;
        }
        Integer num = (Integer) pm8Var;
        return ymb.i(ymbVar, str, zIsDirectory, length, 0L, num != null ? num.intValue() : 511, dLastModified, dLastModified, dLastModified, 14552);
    }
}
