package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dh1 implements ib4 {
    public final /* synthetic */ int a;

    public /* synthetic */ dh1(int i) {
        this.a = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int iA;
        switch (this.a) {
            case 0:
                return dk9.x(Boolean.FALSE);
            case 1:
                return heb.a;
            case 2:
                return new du8((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
            case 3:
                return new b3b(un9.c(0.0f, 0.0f));
            case 4:
                ur9 ur9Var = om1.a;
                return null;
            case 5:
                zl1.b("Unexpected call to default provider");
                throw new fi1();
            case 6:
                ur9 ur9Var2 = ev1.a;
                return Boolean.FALSE;
            case 7:
                return new qa7("com.reader.app.ui.screen.community.ConversationListRoute", jv1.INSTANCE, new Annotation[0]);
            case 8:
                return new qe();
            case 9:
                int[][] iArr = new int[2][];
                int i = 0;
                while (i < 2) {
                    int[] iArr2 = new int[13];
                    int i2 = 0;
                    for (int i3 = 0; i3 < 13; i3++) {
                        if (i3 == 0) {
                            iA = 0;
                        } else {
                            d6a d6aVar = qw1.a;
                            iA = qw1.a(i3, i != 0);
                        }
                        i2 += iA;
                        iArr2[i3] = i2;
                    }
                    iArr[i] = iArr2;
                    i++;
                }
                return iArr;
            case 10:
                return new qa7("com.reader.app.ui.screen.community.CreateGroupConversationRoute", n02.INSTANCE, new Annotation[0]);
            case 11:
                return j39.g(7, null, 0L);
            case 12:
                return p12.a(1023, null, null);
            case 13:
                return (o12) p12.a.getValue();
            case 14:
                String[] strArr = Build.SUPPORTED_ABIS;
                fv fvVar = fv.a;
                if (strArr == null) {
                    return fvVar;
                }
                for (String str : strArr) {
                    if (str != null) {
                        if (bw9.O(str, "arm64", false)) {
                            return fv.e;
                        }
                        if (bw9.O(str, "arm", false)) {
                            return fv.d;
                        }
                        if (bw9.O(str, "x86_64", false)) {
                            return fv.c;
                        }
                        if (bw9.O(str, "x86", false)) {
                            return fv.b;
                        }
                        if (bw9.O(str, "mips", false)) {
                            return fv.f;
                        }
                    }
                }
                System.out.println((Object) ("Undetected android architecture: " + fw.O0(strArr)));
                return fvVar;
            case 15:
                return new jy8("kotlinx.datetime.DateTimeUnit.DateBased", ug8.a(l72.class), new a91[]{ug8.a(n72.class), ug8.a(p72.class)}, new oi5[]{w72.a, bv6.a});
            case 16:
                return new jy8("kotlinx.datetime.DateTimeUnit", ug8.a(s72.class), new a91[]{ug8.a(n72.class), ug8.a(p72.class), ug8.a(r72.class)}, new oi5[]{w72.a, bv6.a, wta.a});
            case 17:
                m39[] m39VarArr = new m39[0];
                if (bw9.a0("kotlinx.datetime.DayBased")) {
                    gp.l("Blank serial names are prohibited");
                    return null;
                }
                b91 b91Var = new b91("kotlinx.datetime.DayBased");
                la5 la5Var = la5.a;
                b91Var.a("days", la5.b);
                return new p39("kotlinx.datetime.DayBased", qw9.c, b91Var.c.size(), fw.O0(m39VarArr), b91Var);
            case 18:
                return Float.valueOf(1.0f);
            case 19:
                return new bm2();
            case 20:
                return dk9.x(Boolean.FALSE);
            case 21:
                return j39.g(7, null, 0L);
            case 22:
                return dk9.x(Boolean.FALSE);
            case 23:
                return j39.g(7, null, 0L);
            case 24:
                return dk9.x(Boolean.FALSE);
            case 25:
                return dk9.x(Boolean.FALSE);
            case 26:
                return dk9.x(Boolean.FALSE);
            case 27:
                return dk9.x(Boolean.FALSE);
            case 28:
                return dk9.x(Boolean.FALSE);
            default:
                Context context = kl8.D;
                context.getClass();
                return new ph(context);
        }
    }
}
