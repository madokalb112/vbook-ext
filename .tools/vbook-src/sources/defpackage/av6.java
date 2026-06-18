package defpackage;

import android.os.Build;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class av6 implements ib4 {
    public final /* synthetic */ int a;

    public /* synthetic */ av6(int i) {
        this.a = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        Object obj = null;
        int i = 12;
        int i2 = 0;
        switch (this.a) {
            case 0:
                m39[] m39VarArr = new m39[0];
                if (bw9.a0("kotlinx.datetime.MonthBased")) {
                    gp.l("Blank serial names are prohibited");
                    return null;
                }
                b91 b91Var = new b91("kotlinx.datetime.MonthBased");
                la5 la5Var = la5.a;
                b91Var.a("months", la5.b);
                return new p39("kotlinx.datetime.MonthBased", qw9.c, b91Var.c.size(), fw.O0(m39VarArr), b91Var);
            case 1:
                float f = n37.a;
                return ki2.a;
            case 2:
                float f2 = d47.a;
                return li2.a;
            case 3:
                return xw0.a;
            case 4:
                return ydb.a;
            case 5:
                return new qa7("com.reader.app.ui.screen.notification.NotificationRoute", p87.INSTANCE, new Annotation[0]);
            case 6:
                return new OkHttpClient(new OkHttpClient.Builder());
            case 7:
                return new vi7();
            case 8:
                return Boolean.TRUE;
            case 9:
                return h22.b;
            case 10:
                tt7 tt7Var = tt7.b;
                Map map = (Map) tt7.c.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(y86.O(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    String upperCase = ((String) entry.getKey()).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    linkedHashMap.put(upperCase, entry.getValue());
                }
                return linkedHashMap;
            case 11:
                aj2 aj2Var = rw2.a;
                return nh2.c;
            case 12:
                int i3 = a08.a;
                return Boolean.FALSE;
            case 13:
                return dk9.x(Boolean.FALSE);
            case 14:
                return new qa7("com.reader.app.ui.screen.community.PublicConversationListRoute", b68.INSTANCE, new Annotation[0]);
            case 15:
                return new g78(new ym(Float.valueOf(0.0f), ah1.t0, obj, i));
            case 16:
                return new qa7("com.reader.app.ui.screen.reader.ReaderNERSkipListRoute", yc8.INSTANCE, new Annotation[0]);
            case 17:
                return pu1.w("reader_settings");
            case 18:
                return new qa7("com.reader.app.ui.screen.reader.ReaderQtGeneralNameRoute", dd8.INSTANCE, new Annotation[0]);
            case 19:
                return new qa7("com.reader.app.ui.screen.reader.ReaderQtGeneralVPRoute", ed8.INSTANCE, new Annotation[0]);
            case 20:
                return dk9.x(Boolean.FALSE);
            case 21:
                return new qa7("com.reader.app.ui.screen.reader.ReaderTextTrashRoute", ae8.INSTANCE, new Annotation[0]);
            case 22:
                List listR0 = fc1.R0(new zp4(i), (List) x49.a.getValue());
                ArrayList arrayList = new ArrayList();
                int size = listR0.size();
                while (i2 < size) {
                    ((fl5) listR0.get(i2)).getClass();
                    arrayList.add(new xl7(new e57(new ua5(20)), ug8.a(dgb.class)));
                    i2++;
                }
                return arrayList;
            case 23:
                List listR02 = fc1.R0(new zp4(13), (List) x49.b.getValue());
                ArrayList arrayList2 = new ArrayList();
                int size2 = listR02.size();
                while (i2 < size2) {
                    ((cf4) listR02.get(i2)).getClass();
                    arrayList2.add(Build.VERSION.SDK_INT >= 28 ? new rn() : new af4());
                    i2++;
                }
                return arrayList2;
            case 24:
                return jl8.a;
            case 25:
                ur9 ur9Var = tl8.a;
                return lf2.a;
            case 26:
                return qu1.X("font/square.ttf");
            case 27:
                return new fo8();
            case 28:
                return new no8();
            default:
                return Boolean.valueOf(e7a.a("ro.mi.os.version.name"));
        }
    }
}
