package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ep5;
import defpackage.gx1;
import defpackage.if2;
import defpackage.jh0;
import defpackage.mi1;
import defpackage.mj1;
import defpackage.ndb;
import defpackage.ni1;
import defpackage.oa8;
import defpackage.ub0;
import defpackage.xm2;
import defpackage.zx5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final ep5 a = new ep5(new mj1(1));
    public static final ep5 b = new ep5(new mj1(2));
    public static final ep5 c = new ep5(new mj1(3));
    public static final ep5 d = new ep5(new mj1(4));

    public static xm2 a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new xm2(Executors.newFixedThreadPool(4, new o22("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        oa8 oa8Var = new oa8(ub0.class, ScheduledExecutorService.class);
        oa8[] oa8VarArr = {new oa8(ub0.class, ExecutorService.class), new oa8(ub0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oa8Var);
        for (oa8 oa8Var2 : oa8VarArr) {
            gx1.y(oa8Var2, "Null interface");
        }
        Collections.addAll(hashSet, oa8VarArr);
        ni1 ni1Var = new ni1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new if2(22), hashSet3);
        oa8 oa8Var3 = new oa8(jh0.class, ScheduledExecutorService.class);
        oa8[] oa8VarArr2 = {new oa8(jh0.class, ExecutorService.class), new oa8(jh0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(oa8Var3);
        for (oa8 oa8Var4 : oa8VarArr2) {
            gx1.y(oa8Var4, "Null interface");
        }
        Collections.addAll(hashSet4, oa8VarArr2);
        ni1 ni1Var2 = new ni1(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new if2(23), hashSet6);
        oa8 oa8Var5 = new oa8(zx5.class, ScheduledExecutorService.class);
        oa8[] oa8VarArr3 = {new oa8(zx5.class, ExecutorService.class), new oa8(zx5.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(oa8Var5);
        for (oa8 oa8Var6 : oa8VarArr3) {
            gx1.y(oa8Var6, "Null interface");
        }
        Collections.addAll(hashSet7, oa8VarArr3);
        ni1 ni1Var3 = new ni1(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new if2(24), hashSet9);
        mi1 mi1VarA = ni1.a(new oa8(ndb.class, Executor.class));
        mi1VarA.f = new if2(25);
        return Arrays.asList(ni1Var, ni1Var2, ni1Var3, mi1VarA.b());
    }
}
