package defpackage;

import androidx.glance.session.SessionWorker;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wm extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new wm((ym) obj2, obj, jt1Var, 0);
            case 1:
                return new wm((File) obj2, (inb) obj, jt1Var, 1);
            default:
                return new wm((ava) obj2, (SessionWorker) obj, jt1Var, 2);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws IOException {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
            case 0:
                ((wm) create(jt1Var)).invokeSuspend(hebVar);
                return hebVar;
            case 1:
                return ((wm) create(jt1Var)).invokeSuspend(hebVar);
            default:
                ((wm) create(jt1Var)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws IOException {
        String str;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ym ymVar = (ym) obj3;
                ym.a(ymVar);
                Object objC = ymVar.c(obj2);
                ymVar.c.b.setValue(objC);
                ymVar.e.setValue(objC);
                return hebVar;
            case 1:
                inb inbVar = (inb) obj2;
                e11.e0(obj);
                File file = (File) obj3;
                j46 j46Var = ah5.a;
                file.getClass();
                boolean z = file.exists() && ah5.a(file);
                if (z && inbVar == inb.CREATE_NEW) {
                    throw new IOException("File " + file + " already exists");
                }
                if (!z && !inbVar.c) {
                    throw new IOException("File " + file + " doesn't exist");
                }
                int iOrdinal = inbVar.ordinal();
                if (iOrdinal != 0) {
                    str = "rw";
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                        mn5.g();
                        return null;
                    }
                } else {
                    str = "r";
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
                if (inbVar.d) {
                    randomAccessFile.setLength(0L);
                }
                if (inbVar != inb.APPEND) {
                    return randomAccessFile;
                }
                randomAccessFile.seek(randomAccessFile.length());
                return randomAccessFile;
            default:
                e11.e0(obj);
                ((ava) obj3).b(((SessionWorker) obj2).i.c);
                return hebVar;
        }
    }
}
