package defpackage;

import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zp4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ zp4(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return t1c.O(Integer.valueOf(((yp4) obj).a), Integer.valueOf(((yp4) obj2).a));
            case 1:
                return t1c.O(Integer.valueOf(((yp4) obj).a), Integer.valueOf(((yp4) obj2).a));
            case 2:
                return t1c.O(Double.valueOf(((ak4) obj2).c), Double.valueOf(((ak4) obj).c));
            case 3:
                Charset charset = (Charset) obj;
                charset.getClass();
                String strName = charset.name();
                strName.getClass();
                Charset charset2 = (Charset) obj2;
                charset2.getClass();
                String strName2 = charset2.name();
                strName2.getClass();
                return t1c.O(strName, strName2);
            case 4:
                return t1c.O((Float) ((xl7) obj2).b, (Float) ((xl7) obj).b);
            case 5:
                return t1c.O((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 6:
                return t1c.O((String) ((xl7) obj).a, (String) ((xl7) obj2).a);
            case 7:
                return t1c.O(Long.valueOf(((x77) obj2).e), Long.valueOf(((x77) obj).e));
            case 8:
                return t1c.O((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 9:
                return t1c.O(Integer.valueOf(((jn7) obj2).a), Integer.valueOf(((jn7) obj).a));
            case 10:
                return t1c.O(Long.valueOf(((fv1) obj2).k), Long.valueOf(((fv1) obj).k));
            case 11:
                return t1c.O(((da8) obj).c, ((da8) obj2).c);
            case 12:
                ((fl5) obj2).getClass();
                ((fl5) obj).getClass();
                return t1c.O(1, 1);
            case 13:
                ((cf4) obj2).getClass();
                ((cf4) obj).getClass();
                return t1c.O(0, 0);
            case 14:
                return t1c.O(Long.valueOf(((ck8) obj2).h), Long.valueOf(((ck8) obj).h));
            case 15:
                return t1c.O(Integer.valueOf(((tn2) obj).a), Integer.valueOf(((tn2) obj2).a));
            case 16:
                return t1c.O(Integer.valueOf(((tn2) obj2).a), Integer.valueOf(((tn2) obj).a));
            case 17:
                return t1c.O((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 18:
                return t1c.O((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 19:
                return t1c.O(Float.valueOf(((k99) obj2).b), Float.valueOf(((k99) obj).b));
            case 20:
                y99 y99Var = (y99) obj;
                y99 y99Var2 = (y99) obj2;
                return t1c.O(Float.valueOf((y99Var.b.h() == 0.0f && y99Var.w == null) ? -1.0f : y99Var.b.h()), Float.valueOf((y99Var2.b.h() == 0.0f && y99Var2.w == null) ? -1.0f : y99Var2.b.h()));
            case 21:
                return t1c.O(Long.valueOf(((zv5) obj).G), Long.valueOf(((zv5) obj2).G));
            case 22:
                return t1c.O(Long.valueOf(((zv5) obj).H), Long.valueOf(((zv5) obj2).H));
            case 23:
                return t1c.O(Long.valueOf(((zv5) obj).I), Long.valueOf(((zv5) obj2).I));
            case 24:
                return t1c.O(Long.valueOf(((zv5) obj).I), Long.valueOf(((zv5) obj2).I));
            case 25:
                return t1c.O(Long.valueOf(((zv5) obj).I), Long.valueOf(((zv5) obj2).I));
            case 26:
                return t1c.O(Long.valueOf(((zv5) obj).I), Long.valueOf(((zv5) obj2).I));
            case 27:
                return t1c.O(Long.valueOf(((zv5) obj2).G), Long.valueOf(((zv5) obj).G));
            case 28:
                return t1c.O(Long.valueOf(((zv5) obj2).H), Long.valueOf(((zv5) obj).H));
            default:
                return t1c.O(Long.valueOf(((zv5) obj2).I), Long.valueOf(((zv5) obj).I));
        }
    }
}
