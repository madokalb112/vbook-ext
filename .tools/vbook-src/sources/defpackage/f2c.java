package defpackage;

import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class f2c implements kb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ f2c(int i) {
        this.a = i;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws Exception {
        cr8 cr8VarP0;
        boolean z;
        int i;
        int i2;
        Integer numValueOf;
        switch (this.a) {
            case 0:
                wq8 wq8Var = (wq8) obj;
                wq8Var.getClass();
                cr8VarP0 = wq8Var.P0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i3 = cr8VarP0.J0() ? (int) cr8VarP0.getLong(0) : 0;
                    cr8VarP0.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 1:
                wq8 wq8Var2 = (wq8) obj;
                wq8Var2.getClass();
                cr8VarP0 = wq8Var2.P0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (cr8VarP0.J0()) {
                        z = ((int) cr8VarP0.getLong(0)) != 0;
                    } else {
                        z = false;
                    }
                    cr8VarP0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 2:
                wq8 wq8Var3 = (wq8) obj;
                wq8Var3.getClass();
                cr8VarP0 = wq8Var3.P0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    cr8VarP0.n(1, 200L);
                    int iG0 = wx1.g0(cr8VarP0, "id");
                    int iG02 = wx1.g0(cr8VarP0, "state");
                    int iG03 = wx1.g0(cr8VarP0, "worker_class_name");
                    int iG04 = wx1.g0(cr8VarP0, "input_merger_class_name");
                    int iG05 = wx1.g0(cr8VarP0, "input");
                    int iG06 = wx1.g0(cr8VarP0, "output");
                    int iG07 = wx1.g0(cr8VarP0, "initial_delay");
                    int iG08 = wx1.g0(cr8VarP0, "interval_duration");
                    int iG09 = wx1.g0(cr8VarP0, "flex_duration");
                    int iG010 = wx1.g0(cr8VarP0, "run_attempt_count");
                    int iG011 = wx1.g0(cr8VarP0, "backoff_policy");
                    int iG012 = wx1.g0(cr8VarP0, "backoff_delay_duration");
                    int iG013 = wx1.g0(cr8VarP0, "last_enqueue_time");
                    int iG014 = wx1.g0(cr8VarP0, "minimum_retention_duration");
                    int iG015 = wx1.g0(cr8VarP0, "schedule_requested_at");
                    int iG016 = wx1.g0(cr8VarP0, "run_in_foreground");
                    int iG017 = wx1.g0(cr8VarP0, "out_of_quota_policy");
                    int iG018 = wx1.g0(cr8VarP0, "period_count");
                    int iG019 = wx1.g0(cr8VarP0, "generation");
                    int iG020 = wx1.g0(cr8VarP0, "next_schedule_time_override");
                    int iG021 = wx1.g0(cr8VarP0, "next_schedule_time_override_generation");
                    int iG022 = wx1.g0(cr8VarP0, "stop_reason");
                    int iG023 = wx1.g0(cr8VarP0, "trace_tag");
                    int iG024 = wx1.g0(cr8VarP0, "backoff_on_system_interruptions");
                    int iG025 = wx1.g0(cr8VarP0, "required_network_type");
                    int iG026 = wx1.g0(cr8VarP0, "required_network_request");
                    int iG027 = wx1.g0(cr8VarP0, "requires_charging");
                    int iG028 = wx1.g0(cr8VarP0, "requires_device_idle");
                    int iG029 = wx1.g0(cr8VarP0, "requires_battery_not_low");
                    int iG030 = wx1.g0(cr8VarP0, "requires_storage_not_low");
                    int iG031 = wx1.g0(cr8VarP0, "trigger_content_update_delay");
                    int iG032 = wx1.g0(cr8VarP0, "trigger_max_content_delay");
                    int iG033 = wx1.g0(cr8VarP0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cr8VarP0.J0()) {
                        String strM0 = cr8VarP0.m0(iG0);
                        int i4 = iG0;
                        int i5 = iG014;
                        p1c p1cVarO = tl9.o((int) cr8VarP0.getLong(iG02));
                        String strM02 = cr8VarP0.m0(iG03);
                        String strM03 = cr8VarP0.m0(iG04);
                        byte[] blob = cr8VarP0.getBlob(iG05);
                        n32 n32Var = n32.b;
                        n32 n32VarT = cx1.T(blob);
                        n32 n32VarT2 = cx1.T(cr8VarP0.getBlob(iG06));
                        long j = cr8VarP0.getLong(iG07);
                        long j2 = cr8VarP0.getLong(iG08);
                        long j3 = cr8VarP0.getLong(iG09);
                        int i6 = (int) cr8VarP0.getLong(iG010);
                        hc0 hc0VarL = tl9.l((int) cr8VarP0.getLong(iG011));
                        long j4 = cr8VarP0.getLong(iG012);
                        long j5 = cr8VarP0.getLong(iG013);
                        long j6 = cr8VarP0.getLong(i5);
                        int i7 = iG015;
                        long j7 = cr8VarP0.getLong(i7);
                        int i8 = iG02;
                        int i9 = iG016;
                        int i10 = iG03;
                        boolean z2 = ((int) cr8VarP0.getLong(i9)) != 0;
                        int i11 = iG017;
                        rh7 rh7VarN = tl9.n((int) cr8VarP0.getLong(i11));
                        int i12 = iG018;
                        int i13 = (int) cr8VarP0.getLong(i12);
                        int i14 = iG019;
                        int i15 = (int) cr8VarP0.getLong(i14);
                        int i16 = iG020;
                        long j8 = cr8VarP0.getLong(i16);
                        int i17 = iG021;
                        int i18 = (int) cr8VarP0.getLong(i17);
                        int i19 = iG022;
                        int i20 = (int) cr8VarP0.getLong(i19);
                        int i21 = iG023;
                        Boolean boolValueOf = null;
                        String strM04 = cr8VarP0.isNull(i21) ? null : cr8VarP0.m0(i21);
                        int i22 = iG024;
                        if (cr8VarP0.isNull(i22)) {
                            i = i18;
                            i2 = i19;
                            numValueOf = null;
                        } else {
                            i = i18;
                            i2 = i19;
                            numValueOf = Integer.valueOf((int) cr8VarP0.getLong(i22));
                        }
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        iG024 = i22;
                        int i23 = iG025;
                        Boolean bool = boolValueOf;
                        w57 w57VarM = tl9.m((int) cr8VarP0.getLong(i23));
                        int i24 = iG026;
                        p57 p57VarR = tl9.r(cr8VarP0.getBlob(i24));
                        iG025 = i23;
                        int i25 = iG027;
                        boolean z3 = ((int) cr8VarP0.getLong(i25)) != 0;
                        iG027 = i25;
                        int i26 = iG028;
                        boolean z4 = ((int) cr8VarP0.getLong(i26)) != 0;
                        iG028 = i26;
                        int i27 = iG029;
                        boolean z5 = ((int) cr8VarP0.getLong(i27)) != 0;
                        iG029 = i27;
                        int i28 = iG030;
                        int i29 = iG031;
                        int i30 = iG032;
                        iG031 = i29;
                        int i31 = iG033;
                        iG033 = i31;
                        arrayList.add(new d2c(strM0, p1cVarO, strM02, strM03, n32VarT, n32VarT2, j, j2, j3, new tp1(p57VarR, w57VarM, z3, z4, z5, ((int) cr8VarP0.getLong(i28)) != 0, cr8VarP0.getLong(i29), cr8VarP0.getLong(i30), tl9.i(cr8VarP0.getBlob(i31))), i6, hc0VarL, j4, j5, j6, j7, z2, rh7VarN, i13, i15, j8, i, i20, strM04, bool));
                        iG032 = i30;
                        iG030 = i28;
                        iG0 = i4;
                        iG014 = i5;
                        iG02 = i8;
                        iG015 = i7;
                        iG018 = i12;
                        iG019 = i14;
                        iG020 = i16;
                        iG021 = i17;
                        iG022 = i2;
                        iG023 = i21;
                        iG026 = i24;
                        iG03 = i10;
                        iG016 = i9;
                        iG017 = i11;
                        break;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 3:
                wq8 wq8Var4 = (wq8) obj;
                wq8Var4.getClass();
                cr8VarP0 = wq8Var4.P0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    cr8VarP0.J0();
                    int iX = qx1.x(wq8Var4);
                    cr8VarP0.close();
                    return Integer.valueOf(iX);
                } finally {
                }
            case 4:
                ewb ewbVar = (ewb) obj;
                ewbVar.getClass();
                ewbVar.c = Long.MAX_VALUE;
                return heb.a;
            case 5:
                c93 c93Var = (c93) obj;
                c93Var.getClass();
                String nodeName = ((Node) ((gi8) c93Var).a).getNodeName();
                nodeName.getClass();
                return Boolean.valueOf(nodeName.equals("item"));
            default:
                ((r4c) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
