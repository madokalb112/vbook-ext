package defpackage;

import android.os.StatFs;
import j$.time.format.DateTimeFormatterBuilder;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wab implements ib4 {
    public final /* synthetic */ int a;

    public /* synthetic */ wab(int i) {
        this.a = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return dk9.x(Boolean.FALSE);
            case 1:
                return new xbb();
            case 2:
                return dk9.x("");
            case 3:
                return dk9.x(Boolean.FALSE);
            case 4:
                return dk9.x(Boolean.FALSE);
            case 5:
                return dk9.x(Boolean.FALSE);
            case 6:
                return dk9.x(Boolean.FALSE);
            case 7:
                return new wv(tv9.a, 0);
            case 8:
                return new wv(tv9.a, 0);
            case 9:
                return new qa7("com.reader.app.ui.screen.admin.UserListRoute", qhb.INSTANCE, new Annotation[0]);
            case 10:
                return dk9.x(Boolean.FALSE);
            case 11:
                return j39.g(7, null, 0L);
            case 12:
                pib pibVar = new pib(new nu(0, false));
                yn2.m(pibVar, new kb4[]{new t3b(16)}, new t3b(17));
                return new qib(pibVar.build());
            case 13:
                pib pibVar2 = new pib(new nu(0, false));
                yn2.m(pibVar2, new kb4[]{new t3b(18)}, new t3b(19));
                return new qib(pibVar2.build());
            case 14:
                nu nuVar = new nu(0, false);
                jj7 jj7Var = jj7.a;
                nuVar.c(new re9(new je0(new xib(jj7Var))));
                nuVar.c(new je0(new uib(jj7Var)));
                ArrayList arrayList = nuVar.a;
                arrayList.getClass();
                return new qib(new ax0(arrayList));
            case 15:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 16:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 17:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 18:
                oh5 oh5Var = gx3.a;
                zn7 zn7VarE = gx3.b.e("coil3_disk_cache");
                long jR = 10485760;
                try {
                    File file = zn7VarE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jR = wx1.R((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new ke8(jR, oh5Var, zn7VarE);
            case 19:
                mc8 mc8Var = mc8.e;
                String strS = mc8Var.s("TMPDIR");
                if (strS != null) {
                    return strS;
                }
                String strS2 = mc8Var.s("TEMP");
                if (strS2 != null) {
                    return strS2;
                }
                String strS3 = mc8Var.s("TMP");
                return strS3 == null ? "/tmp" : strS3;
            case 20:
                String str = zmb.a;
                str.getClass();
                return anb.b(str);
            case 21:
                return anb.a(new elb(14));
            case 22:
                return anb.a(new elb(13));
            case 23:
                String str2 = zmb.a;
                str2.getClass();
                return anb.b(str2);
            case 24:
                String str3 = zmb.a;
                str3.getClass();
                return anb.b(str3);
            case 25:
                return anb.a(new elb(12));
            case 26:
                return new vi().k();
            case 27:
                String str4 = zmb.a;
                str4.getClass();
                return anb.b(str4);
            case 28:
                return j39.g(7, null, 0L);
            default:
                throw new IllegalStateException("LocalVideoLoader not set");
        }
    }
}
