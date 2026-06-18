package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class da2 extends kc4 implements cc4 {
    public static final da2 a = new da2(6, z92.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;JJ)V", 0);

    @Override // defpackage.cc4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Map map = (Map) obj4;
        long jLongValue = ((Number) obj5).longValue();
        long jLongValue2 = ((Number) obj6).longValue();
        str.getClass();
        str2.getClass();
        map.getClass();
        return new z92(str, str2, iIntValue, map, jLongValue, jLongValue2);
    }
}
