package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yc2 extends kc4 implements ec4 {
    public static final yc2 a = new yc2(8, uc2.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;IJJ)V", 0);

    @Override // defpackage.ec4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Number number) {
        String str = (String) obj2;
        Map map = (Map) obj3;
        int iIntValue = ((Number) obj6).intValue();
        long jLongValue = ((Number) obj7).longValue();
        long jLongValue2 = number.longValue();
        str.getClass();
        map.getClass();
        return new uc2((String) obj, str, map, (String) obj4, (String) obj5, iIntValue, jLongValue, jLongValue2);
    }
}
