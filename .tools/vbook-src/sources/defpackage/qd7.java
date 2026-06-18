package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qd7 extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rd7 c;
    public final /* synthetic */ yn7 d;
    public final /* synthetic */ lm8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd7(rd7 rd7Var, yn7 yn7Var, lm8 lm8Var, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = rd7Var;
        this.d = yn7Var;
        this.e = lm8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new qd7(this.c, this.d, this.e, jt1Var, 0);
            case 1:
                return new qd7(this.c, this.d, this.e, jt1Var, 1);
            case 2:
                return new qd7(this.c, this.d, this.e, jt1Var, 2);
            case 3:
                return new qd7(this.c, this.d, this.e, jt1Var, 3);
            case 4:
                return new qd7(this.c, this.d, this.e, jt1Var, 4);
            case 5:
                return new qd7(this.c, this.d, this.e, jt1Var, 5);
            case 6:
                return new qd7(this.c, this.d, this.e, jt1Var, 6);
            case 7:
                return new qd7(this.c, this.d, this.e, jt1Var, 7);
            default:
                return new qd7(this.c, this.d, this.e, jt1Var, 8);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((qd7) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        se8 se8Var;
        mf5 mf5Var;
        String strG;
        int i = this.a;
        final int i2 = 0;
        final lm8 lm8Var = this.e;
        final rd7 rd7Var = this.c;
        yn7 yn7Var = this.d;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        final int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    hx3.a.getClass();
                    if (yn7Var.a.exists()) {
                        ym9.l(rd7Var.a.x, new fb3(17, lm8Var, rd7Var, yn7Var));
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 1:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    uf5 uf5Var = rd7Var.b;
                    yn7 yn7VarQ = cx1.q(yn7Var, "setting.json");
                    lr3 lr3Var = hx3.a;
                    lr3Var.getClass();
                    if (yn7VarQ.a.exists()) {
                        se8Var = new se8(lr3Var.y(yn7VarQ));
                        try {
                            fg5 fg5VarK = i12.K(uf5Var.c(rj9.E(se8Var)));
                            if (fg5VarK != null && (mf5Var = (mf5) fg5VarK.get("tag.list")) != null && (strG = i12.G(mf5Var)) != null && strG.length() > 0) {
                                ym9.l(rd7Var.a.e, new fb3(lm8Var, rd7Var, (List) uf5Var.a(new wv(ad7.Companion.serializer(), 0), strG)));
                            }
                            lc5.U(se8Var, null);
                            break;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 2:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    yn7 yn7VarQ2 = cx1.q(yn7Var, "bookmarks.json");
                    yn7 yn7VarQ3 = cx1.q(yn7Var, "notes.json");
                    hx3.a.getClass();
                    if (yn7VarQ2.a.exists() || yn7VarQ3.a.exists()) {
                        rd7 rd7Var2 = this.c;
                        ym9.l(rd7Var2.a.c, new um(this.e, rd7Var2, yn7VarQ2, yn7VarQ3, 23));
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 3:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    yn7 yn7VarQ4 = cx1.q(yn7Var, "downloads.json");
                    lr3 lr3Var2 = hx3.a;
                    lr3Var2.getClass();
                    if (yn7VarQ4.a.exists()) {
                        se8Var = new se8(lr3Var2.y(yn7VarQ4));
                        try {
                            uf5 uf5Var2 = rd7Var.b;
                            uf5Var2.getClass();
                            final a39 a39VarW = fx1.W(uf5Var2, se8Var, gd7.Companion.serializer());
                            ym9.l(rd7Var.a.u, new kb4() { // from class: nd7
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj2) {
                                    int i8 = i3;
                                    int i9 = 0;
                                    heb hebVar2 = heb.a;
                                    Set setX0 = sc3.a;
                                    lm8 lm8Var2 = lm8.a;
                                    a39<gd7> a39Var = a39VarW;
                                    rd7 rd7Var3 = rd7Var;
                                    lm8 lm8Var3 = lm8Var;
                                    lm8 lm8Var4 = lm8.c;
                                    switch (i8) {
                                        case 0:
                                            m62 m62Var = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var.A.L("general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC = m62Var.A.Q("general").c();
                                                ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                                                Iterator it = listC.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(rd7.b((ob2) it.next()));
                                                }
                                                setX0 = fc1.X0(arrayList);
                                            }
                                            Iterator it2 = a39Var.iterator();
                                            while (it2.hasNext()) {
                                                ob2 ob2VarM = sw1.M((ud7) it2.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.b(ob2VarM))) {
                                                    m62Var.A.U(ob2VarM);
                                                }
                                            }
                                            break;
                                        case 1:
                                            m62 m62Var2 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                b92 b92Var = m62Var2.u;
                                                ((qj) ((yf1) b92Var).a).q(387880673, "DELETE FROM DbDownload", (kb4) null);
                                                b92Var.w(387880673, new q92(21));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC2 = m62Var2.u.U().c();
                                                ArrayList arrayList2 = new ArrayList(gc1.M(listC2, 10));
                                                Iterator it3 = listC2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(((ha2) it3.next()).b);
                                                }
                                                setX0 = fc1.X0(arrayList2);
                                            }
                                            for (gd7 gd7Var : a39Var) {
                                                gd7Var.getClass();
                                                String str = gd7Var.a;
                                                String str2 = gd7Var.b;
                                                String str3 = gd7Var.c;
                                                int i10 = gd7Var.f;
                                                ha2 ha2Var = new ha2(str, str, str2, str3, "", 0, i10, gd7Var.e, i10, 0, 4, gd7Var.h);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(str)) {
                                                    m62Var2.u.j0(ha2Var);
                                                }
                                            }
                                            break;
                                        case 2:
                                            m62 m62Var3 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var3.K.J("");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                b92 b92Var2 = m62Var3.K;
                                                b92Var2.getClass();
                                                ed2 ed2Var = ed2.a;
                                                List listC3 = new cd2(b92Var2, "", new bd2(b92Var2, 4)).c();
                                                ArrayList arrayList3 = new ArrayList(gc1.M(listC3, 10));
                                                Iterator it4 = listC3.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add(rd7.d((ad2) it4.next()));
                                                }
                                                setX0 = fc1.X0(arrayList3);
                                            }
                                            Iterator it5 = a39Var.iterator();
                                            while (it5.hasNext()) {
                                                je7 je7Var = (je7) it5.next();
                                                je7Var.getClass();
                                                String strP = wm9.p();
                                                String str4 = je7Var.a;
                                                boolean z = je7Var.b;
                                                qa1 qa1Var = r95.a;
                                                ad2 ad2Var = new ad2(0, qa1Var.k().c(), qa1Var.k().c(), strP, "", str4, z);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.d(ad2Var))) {
                                                    m62Var3.K.o0(ad2Var);
                                                }
                                            }
                                            break;
                                        case 3:
                                            m62 m62Var4 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                n92 n92Var = m62Var4.z;
                                                ((qj) ((yf1) n92Var).a).q(-112717427, "DELETE FROM DbExtensionSource", (kb4) null);
                                                n92Var.w(-112717427, new sa2(25));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC4 = m62Var4.z.P().c();
                                                ArrayList arrayList4 = new ArrayList(gc1.M(listC4, 10));
                                                Iterator it6 = listC4.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(((mb2) it6.next()).a);
                                                }
                                                setX0 = fc1.X0(arrayList4);
                                            }
                                            Iterator it7 = a39Var.iterator();
                                            while (it7.hasNext()) {
                                                md7 md7Var = (md7) it7.next();
                                                if (md7Var.b.length() > 0) {
                                                    String strValueOf = String.valueOf(md7Var.a);
                                                    mb2 mb2Var = new mb2(strValueOf, md7Var.b, md7Var.d, md7Var.c, r95.a.k().c());
                                                    if (lm8Var3 != lm8Var4 || !setX0.contains(strValueOf)) {
                                                        m62Var4.z.T(mb2Var);
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            m62 m62Var5 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var5.F.Q(1, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC5 = m62Var5.F.V("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : listC5) {
                                                    if (((dc2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(gc1.M(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i9 < size) {
                                                    Object obj4 = arrayList5.get(i9);
                                                    i9++;
                                                    arrayList6.add(rd7.c((dc2) obj4));
                                                }
                                                setX0 = fc1.X0(arrayList6);
                                            }
                                            Iterator it8 = a39Var.iterator();
                                            while (it8.hasNext()) {
                                                dc2 dc2VarO = ex1.O((de7) it8.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarO))) {
                                                    m62Var5.F.m0(dc2VarO);
                                                }
                                            }
                                            break;
                                        default:
                                            m62 m62Var6 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var6.F.Q(0, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC6 = m62Var6.F.V("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : listC6) {
                                                    if (((dc2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(gc1.M(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i9 < size2) {
                                                    Object obj6 = arrayList7.get(i9);
                                                    i9++;
                                                    arrayList8.add(rd7.c((dc2) obj6));
                                                }
                                                setX0 = fc1.X0(arrayList8);
                                            }
                                            Iterator it9 = a39Var.iterator();
                                            while (it9.hasNext()) {
                                                dc2 dc2VarP = ex1.P((ge7) it9.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarP))) {
                                                    m62Var6.F.m0(dc2VarP);
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar2;
                                }
                            });
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i7 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 4:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    yn7 yn7VarQ5 = cx1.q(yn7Var, "names.json");
                    lr3 lr3Var3 = hx3.a;
                    lr3Var3.getClass();
                    if (yn7VarQ5.a.exists()) {
                        se8Var = new se8(lr3Var3.y(yn7VarQ5));
                        try {
                            uf5 uf5Var3 = rd7Var.b;
                            uf5Var3.getClass();
                            final a39 a39VarW2 = fx1.W(uf5Var3, se8Var, ud7.Companion.serializer());
                            ym9.l(rd7Var.a.A, new kb4() { // from class: nd7
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj2) {
                                    int i82 = i2;
                                    int i9 = 0;
                                    heb hebVar2 = heb.a;
                                    Set setX0 = sc3.a;
                                    lm8 lm8Var2 = lm8.a;
                                    a39<gd7> a39Var = a39VarW2;
                                    rd7 rd7Var3 = rd7Var;
                                    lm8 lm8Var3 = lm8Var;
                                    lm8 lm8Var4 = lm8.c;
                                    switch (i82) {
                                        case 0:
                                            m62 m62Var = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var.A.L("general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC = m62Var.A.Q("general").c();
                                                ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                                                Iterator it = listC.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(rd7.b((ob2) it.next()));
                                                }
                                                setX0 = fc1.X0(arrayList);
                                            }
                                            Iterator it2 = a39Var.iterator();
                                            while (it2.hasNext()) {
                                                ob2 ob2VarM = sw1.M((ud7) it2.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.b(ob2VarM))) {
                                                    m62Var.A.U(ob2VarM);
                                                }
                                            }
                                            break;
                                        case 1:
                                            m62 m62Var2 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                b92 b92Var = m62Var2.u;
                                                ((qj) ((yf1) b92Var).a).q(387880673, "DELETE FROM DbDownload", (kb4) null);
                                                b92Var.w(387880673, new q92(21));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC2 = m62Var2.u.U().c();
                                                ArrayList arrayList2 = new ArrayList(gc1.M(listC2, 10));
                                                Iterator it3 = listC2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(((ha2) it3.next()).b);
                                                }
                                                setX0 = fc1.X0(arrayList2);
                                            }
                                            for (gd7 gd7Var : a39Var) {
                                                gd7Var.getClass();
                                                String str = gd7Var.a;
                                                String str2 = gd7Var.b;
                                                String str3 = gd7Var.c;
                                                int i10 = gd7Var.f;
                                                ha2 ha2Var = new ha2(str, str, str2, str3, "", 0, i10, gd7Var.e, i10, 0, 4, gd7Var.h);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(str)) {
                                                    m62Var2.u.j0(ha2Var);
                                                }
                                            }
                                            break;
                                        case 2:
                                            m62 m62Var3 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var3.K.J("");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                b92 b92Var2 = m62Var3.K;
                                                b92Var2.getClass();
                                                ed2 ed2Var = ed2.a;
                                                List listC3 = new cd2(b92Var2, "", new bd2(b92Var2, 4)).c();
                                                ArrayList arrayList3 = new ArrayList(gc1.M(listC3, 10));
                                                Iterator it4 = listC3.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add(rd7.d((ad2) it4.next()));
                                                }
                                                setX0 = fc1.X0(arrayList3);
                                            }
                                            Iterator it5 = a39Var.iterator();
                                            while (it5.hasNext()) {
                                                je7 je7Var = (je7) it5.next();
                                                je7Var.getClass();
                                                String strP = wm9.p();
                                                String str4 = je7Var.a;
                                                boolean z = je7Var.b;
                                                qa1 qa1Var = r95.a;
                                                ad2 ad2Var = new ad2(0, qa1Var.k().c(), qa1Var.k().c(), strP, "", str4, z);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.d(ad2Var))) {
                                                    m62Var3.K.o0(ad2Var);
                                                }
                                            }
                                            break;
                                        case 3:
                                            m62 m62Var4 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                n92 n92Var = m62Var4.z;
                                                ((qj) ((yf1) n92Var).a).q(-112717427, "DELETE FROM DbExtensionSource", (kb4) null);
                                                n92Var.w(-112717427, new sa2(25));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC4 = m62Var4.z.P().c();
                                                ArrayList arrayList4 = new ArrayList(gc1.M(listC4, 10));
                                                Iterator it6 = listC4.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(((mb2) it6.next()).a);
                                                }
                                                setX0 = fc1.X0(arrayList4);
                                            }
                                            Iterator it7 = a39Var.iterator();
                                            while (it7.hasNext()) {
                                                md7 md7Var = (md7) it7.next();
                                                if (md7Var.b.length() > 0) {
                                                    String strValueOf = String.valueOf(md7Var.a);
                                                    mb2 mb2Var = new mb2(strValueOf, md7Var.b, md7Var.d, md7Var.c, r95.a.k().c());
                                                    if (lm8Var3 != lm8Var4 || !setX0.contains(strValueOf)) {
                                                        m62Var4.z.T(mb2Var);
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            m62 m62Var5 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var5.F.Q(1, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC5 = m62Var5.F.V("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : listC5) {
                                                    if (((dc2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(gc1.M(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i9 < size) {
                                                    Object obj4 = arrayList5.get(i9);
                                                    i9++;
                                                    arrayList6.add(rd7.c((dc2) obj4));
                                                }
                                                setX0 = fc1.X0(arrayList6);
                                            }
                                            Iterator it8 = a39Var.iterator();
                                            while (it8.hasNext()) {
                                                dc2 dc2VarO = ex1.O((de7) it8.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarO))) {
                                                    m62Var5.F.m0(dc2VarO);
                                                }
                                            }
                                            break;
                                        default:
                                            m62 m62Var6 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var6.F.Q(0, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC6 = m62Var6.F.V("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : listC6) {
                                                    if (((dc2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(gc1.M(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i9 < size2) {
                                                    Object obj6 = arrayList7.get(i9);
                                                    i9++;
                                                    arrayList8.add(rd7.c((dc2) obj6));
                                                }
                                                setX0 = fc1.X0(arrayList8);
                                            }
                                            Iterator it9 = a39Var.iterator();
                                            while (it9.hasNext()) {
                                                dc2 dc2VarP = ex1.P((ge7) it9.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarP))) {
                                                    m62Var6.F.m0(dc2VarP);
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar2;
                                }
                            });
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 5:
                int i9 = this.b;
                if (i9 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    yn7 yn7VarQ6 = cx1.q(yn7Var, "chinese_names.json");
                    lr3 lr3Var4 = hx3.a;
                    lr3Var4.getClass();
                    if (yn7VarQ6.a.exists()) {
                        se8Var = new se8(lr3Var4.y(yn7VarQ6));
                        try {
                            uf5 uf5Var4 = rd7Var.b;
                            uf5Var4.getClass();
                            final a39 a39VarW3 = fx1.W(uf5Var4, se8Var, de7.Companion.serializer());
                            final int i10 = 4;
                            ym9.l(rd7Var.a.F, new kb4() { // from class: nd7
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj2) {
                                    int i82 = i10;
                                    int i92 = 0;
                                    heb hebVar2 = heb.a;
                                    Set setX0 = sc3.a;
                                    lm8 lm8Var2 = lm8.a;
                                    a39<gd7> a39Var = a39VarW3;
                                    rd7 rd7Var3 = rd7Var;
                                    lm8 lm8Var3 = lm8Var;
                                    lm8 lm8Var4 = lm8.c;
                                    switch (i82) {
                                        case 0:
                                            m62 m62Var = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var.A.L("general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC = m62Var.A.Q("general").c();
                                                ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                                                Iterator it = listC.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(rd7.b((ob2) it.next()));
                                                }
                                                setX0 = fc1.X0(arrayList);
                                            }
                                            Iterator it2 = a39Var.iterator();
                                            while (it2.hasNext()) {
                                                ob2 ob2VarM = sw1.M((ud7) it2.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.b(ob2VarM))) {
                                                    m62Var.A.U(ob2VarM);
                                                }
                                            }
                                            break;
                                        case 1:
                                            m62 m62Var2 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                b92 b92Var = m62Var2.u;
                                                ((qj) ((yf1) b92Var).a).q(387880673, "DELETE FROM DbDownload", (kb4) null);
                                                b92Var.w(387880673, new q92(21));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC2 = m62Var2.u.U().c();
                                                ArrayList arrayList2 = new ArrayList(gc1.M(listC2, 10));
                                                Iterator it3 = listC2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(((ha2) it3.next()).b);
                                                }
                                                setX0 = fc1.X0(arrayList2);
                                            }
                                            for (gd7 gd7Var : a39Var) {
                                                gd7Var.getClass();
                                                String str = gd7Var.a;
                                                String str2 = gd7Var.b;
                                                String str3 = gd7Var.c;
                                                int i102 = gd7Var.f;
                                                ha2 ha2Var = new ha2(str, str, str2, str3, "", 0, i102, gd7Var.e, i102, 0, 4, gd7Var.h);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(str)) {
                                                    m62Var2.u.j0(ha2Var);
                                                }
                                            }
                                            break;
                                        case 2:
                                            m62 m62Var3 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var3.K.J("");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                b92 b92Var2 = m62Var3.K;
                                                b92Var2.getClass();
                                                ed2 ed2Var = ed2.a;
                                                List listC3 = new cd2(b92Var2, "", new bd2(b92Var2, 4)).c();
                                                ArrayList arrayList3 = new ArrayList(gc1.M(listC3, 10));
                                                Iterator it4 = listC3.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add(rd7.d((ad2) it4.next()));
                                                }
                                                setX0 = fc1.X0(arrayList3);
                                            }
                                            Iterator it5 = a39Var.iterator();
                                            while (it5.hasNext()) {
                                                je7 je7Var = (je7) it5.next();
                                                je7Var.getClass();
                                                String strP = wm9.p();
                                                String str4 = je7Var.a;
                                                boolean z = je7Var.b;
                                                qa1 qa1Var = r95.a;
                                                ad2 ad2Var = new ad2(0, qa1Var.k().c(), qa1Var.k().c(), strP, "", str4, z);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.d(ad2Var))) {
                                                    m62Var3.K.o0(ad2Var);
                                                }
                                            }
                                            break;
                                        case 3:
                                            m62 m62Var4 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                n92 n92Var = m62Var4.z;
                                                ((qj) ((yf1) n92Var).a).q(-112717427, "DELETE FROM DbExtensionSource", (kb4) null);
                                                n92Var.w(-112717427, new sa2(25));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC4 = m62Var4.z.P().c();
                                                ArrayList arrayList4 = new ArrayList(gc1.M(listC4, 10));
                                                Iterator it6 = listC4.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(((mb2) it6.next()).a);
                                                }
                                                setX0 = fc1.X0(arrayList4);
                                            }
                                            Iterator it7 = a39Var.iterator();
                                            while (it7.hasNext()) {
                                                md7 md7Var = (md7) it7.next();
                                                if (md7Var.b.length() > 0) {
                                                    String strValueOf = String.valueOf(md7Var.a);
                                                    mb2 mb2Var = new mb2(strValueOf, md7Var.b, md7Var.d, md7Var.c, r95.a.k().c());
                                                    if (lm8Var3 != lm8Var4 || !setX0.contains(strValueOf)) {
                                                        m62Var4.z.T(mb2Var);
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            m62 m62Var5 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var5.F.Q(1, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC5 = m62Var5.F.V("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : listC5) {
                                                    if (((dc2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(gc1.M(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i92 < size) {
                                                    Object obj4 = arrayList5.get(i92);
                                                    i92++;
                                                    arrayList6.add(rd7.c((dc2) obj4));
                                                }
                                                setX0 = fc1.X0(arrayList6);
                                            }
                                            Iterator it8 = a39Var.iterator();
                                            while (it8.hasNext()) {
                                                dc2 dc2VarO = ex1.O((de7) it8.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarO))) {
                                                    m62Var5.F.m0(dc2VarO);
                                                }
                                            }
                                            break;
                                        default:
                                            m62 m62Var6 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var6.F.Q(0, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC6 = m62Var6.F.V("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : listC6) {
                                                    if (((dc2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(gc1.M(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i92 < size2) {
                                                    Object obj6 = arrayList7.get(i92);
                                                    i92++;
                                                    arrayList8.add(rd7.c((dc2) obj6));
                                                }
                                                setX0 = fc1.X0(arrayList8);
                                            }
                                            Iterator it9 = a39Var.iterator();
                                            while (it9.hasNext()) {
                                                dc2 dc2VarP = ex1.P((ge7) it9.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarP))) {
                                                    m62Var6.F.m0(dc2VarP);
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar2;
                                }
                            });
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i9 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 6:
                int i11 = this.b;
                if (i11 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    yn7 yn7VarQ7 = cx1.q(yn7Var, "chinese_vietphrases.json");
                    lr3 lr3Var5 = hx3.a;
                    lr3Var5.getClass();
                    if (yn7VarQ7.a.exists()) {
                        se8Var = new se8(lr3Var5.y(yn7VarQ7));
                        try {
                            uf5 uf5Var5 = rd7Var.b;
                            uf5Var5.getClass();
                            final a39 a39VarW4 = fx1.W(uf5Var5, se8Var, ge7.Companion.serializer());
                            final int i12 = 5;
                            ym9.l(rd7Var.a.F, new kb4() { // from class: nd7
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj2) {
                                    int i82 = i12;
                                    int i92 = 0;
                                    heb hebVar2 = heb.a;
                                    Set setX0 = sc3.a;
                                    lm8 lm8Var2 = lm8.a;
                                    a39<gd7> a39Var = a39VarW4;
                                    rd7 rd7Var3 = rd7Var;
                                    lm8 lm8Var3 = lm8Var;
                                    lm8 lm8Var4 = lm8.c;
                                    switch (i82) {
                                        case 0:
                                            m62 m62Var = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var.A.L("general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC = m62Var.A.Q("general").c();
                                                ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                                                Iterator it = listC.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(rd7.b((ob2) it.next()));
                                                }
                                                setX0 = fc1.X0(arrayList);
                                            }
                                            Iterator it2 = a39Var.iterator();
                                            while (it2.hasNext()) {
                                                ob2 ob2VarM = sw1.M((ud7) it2.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.b(ob2VarM))) {
                                                    m62Var.A.U(ob2VarM);
                                                }
                                            }
                                            break;
                                        case 1:
                                            m62 m62Var2 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                b92 b92Var = m62Var2.u;
                                                ((qj) ((yf1) b92Var).a).q(387880673, "DELETE FROM DbDownload", (kb4) null);
                                                b92Var.w(387880673, new q92(21));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC2 = m62Var2.u.U().c();
                                                ArrayList arrayList2 = new ArrayList(gc1.M(listC2, 10));
                                                Iterator it3 = listC2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(((ha2) it3.next()).b);
                                                }
                                                setX0 = fc1.X0(arrayList2);
                                            }
                                            for (gd7 gd7Var : a39Var) {
                                                gd7Var.getClass();
                                                String str = gd7Var.a;
                                                String str2 = gd7Var.b;
                                                String str3 = gd7Var.c;
                                                int i102 = gd7Var.f;
                                                ha2 ha2Var = new ha2(str, str, str2, str3, "", 0, i102, gd7Var.e, i102, 0, 4, gd7Var.h);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(str)) {
                                                    m62Var2.u.j0(ha2Var);
                                                }
                                            }
                                            break;
                                        case 2:
                                            m62 m62Var3 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var3.K.J("");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                b92 b92Var2 = m62Var3.K;
                                                b92Var2.getClass();
                                                ed2 ed2Var = ed2.a;
                                                List listC3 = new cd2(b92Var2, "", new bd2(b92Var2, 4)).c();
                                                ArrayList arrayList3 = new ArrayList(gc1.M(listC3, 10));
                                                Iterator it4 = listC3.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add(rd7.d((ad2) it4.next()));
                                                }
                                                setX0 = fc1.X0(arrayList3);
                                            }
                                            Iterator it5 = a39Var.iterator();
                                            while (it5.hasNext()) {
                                                je7 je7Var = (je7) it5.next();
                                                je7Var.getClass();
                                                String strP = wm9.p();
                                                String str4 = je7Var.a;
                                                boolean z = je7Var.b;
                                                qa1 qa1Var = r95.a;
                                                ad2 ad2Var = new ad2(0, qa1Var.k().c(), qa1Var.k().c(), strP, "", str4, z);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.d(ad2Var))) {
                                                    m62Var3.K.o0(ad2Var);
                                                }
                                            }
                                            break;
                                        case 3:
                                            m62 m62Var4 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                n92 n92Var = m62Var4.z;
                                                ((qj) ((yf1) n92Var).a).q(-112717427, "DELETE FROM DbExtensionSource", (kb4) null);
                                                n92Var.w(-112717427, new sa2(25));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC4 = m62Var4.z.P().c();
                                                ArrayList arrayList4 = new ArrayList(gc1.M(listC4, 10));
                                                Iterator it6 = listC4.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(((mb2) it6.next()).a);
                                                }
                                                setX0 = fc1.X0(arrayList4);
                                            }
                                            Iterator it7 = a39Var.iterator();
                                            while (it7.hasNext()) {
                                                md7 md7Var = (md7) it7.next();
                                                if (md7Var.b.length() > 0) {
                                                    String strValueOf = String.valueOf(md7Var.a);
                                                    mb2 mb2Var = new mb2(strValueOf, md7Var.b, md7Var.d, md7Var.c, r95.a.k().c());
                                                    if (lm8Var3 != lm8Var4 || !setX0.contains(strValueOf)) {
                                                        m62Var4.z.T(mb2Var);
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            m62 m62Var5 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var5.F.Q(1, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC5 = m62Var5.F.V("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : listC5) {
                                                    if (((dc2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(gc1.M(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i92 < size) {
                                                    Object obj4 = arrayList5.get(i92);
                                                    i92++;
                                                    arrayList6.add(rd7.c((dc2) obj4));
                                                }
                                                setX0 = fc1.X0(arrayList6);
                                            }
                                            Iterator it8 = a39Var.iterator();
                                            while (it8.hasNext()) {
                                                dc2 dc2VarO = ex1.O((de7) it8.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarO))) {
                                                    m62Var5.F.m0(dc2VarO);
                                                }
                                            }
                                            break;
                                        default:
                                            m62 m62Var6 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var6.F.Q(0, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC6 = m62Var6.F.V("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : listC6) {
                                                    if (((dc2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(gc1.M(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i92 < size2) {
                                                    Object obj6 = arrayList7.get(i92);
                                                    i92++;
                                                    arrayList8.add(rd7.c((dc2) obj6));
                                                }
                                                setX0 = fc1.X0(arrayList8);
                                            }
                                            Iterator it9 = a39Var.iterator();
                                            while (it9.hasNext()) {
                                                dc2 dc2VarP = ex1.P((ge7) it9.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarP))) {
                                                    m62Var6.F.m0(dc2VarP);
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar2;
                                }
                            });
                            lc5.U(se8Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i11 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 7:
                int i13 = this.b;
                if (i13 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    yn7 yn7VarQ8 = cx1.q(yn7Var, "trashes.json");
                    lr3 lr3Var6 = hx3.a;
                    lr3Var6.getClass();
                    if (yn7VarQ8.a.exists()) {
                        se8Var = new se8(lr3Var6.y(yn7VarQ8));
                        try {
                            uf5 uf5Var6 = rd7Var.b;
                            uf5Var6.getClass();
                            final a39 a39VarW5 = fx1.W(uf5Var6, se8Var, je7.Companion.serializer());
                            final int i14 = 2;
                            ym9.l(rd7Var.a.K, new kb4() { // from class: nd7
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj2) {
                                    int i82 = i14;
                                    int i92 = 0;
                                    heb hebVar2 = heb.a;
                                    Set setX0 = sc3.a;
                                    lm8 lm8Var2 = lm8.a;
                                    a39<gd7> a39Var = a39VarW5;
                                    rd7 rd7Var3 = rd7Var;
                                    lm8 lm8Var3 = lm8Var;
                                    lm8 lm8Var4 = lm8.c;
                                    switch (i82) {
                                        case 0:
                                            m62 m62Var = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var.A.L("general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC = m62Var.A.Q("general").c();
                                                ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                                                Iterator it = listC.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(rd7.b((ob2) it.next()));
                                                }
                                                setX0 = fc1.X0(arrayList);
                                            }
                                            Iterator it2 = a39Var.iterator();
                                            while (it2.hasNext()) {
                                                ob2 ob2VarM = sw1.M((ud7) it2.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.b(ob2VarM))) {
                                                    m62Var.A.U(ob2VarM);
                                                }
                                            }
                                            break;
                                        case 1:
                                            m62 m62Var2 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                b92 b92Var = m62Var2.u;
                                                ((qj) ((yf1) b92Var).a).q(387880673, "DELETE FROM DbDownload", (kb4) null);
                                                b92Var.w(387880673, new q92(21));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC2 = m62Var2.u.U().c();
                                                ArrayList arrayList2 = new ArrayList(gc1.M(listC2, 10));
                                                Iterator it3 = listC2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(((ha2) it3.next()).b);
                                                }
                                                setX0 = fc1.X0(arrayList2);
                                            }
                                            for (gd7 gd7Var : a39Var) {
                                                gd7Var.getClass();
                                                String str = gd7Var.a;
                                                String str2 = gd7Var.b;
                                                String str3 = gd7Var.c;
                                                int i102 = gd7Var.f;
                                                ha2 ha2Var = new ha2(str, str, str2, str3, "", 0, i102, gd7Var.e, i102, 0, 4, gd7Var.h);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(str)) {
                                                    m62Var2.u.j0(ha2Var);
                                                }
                                            }
                                            break;
                                        case 2:
                                            m62 m62Var3 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var3.K.J("");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                b92 b92Var2 = m62Var3.K;
                                                b92Var2.getClass();
                                                ed2 ed2Var = ed2.a;
                                                List listC3 = new cd2(b92Var2, "", new bd2(b92Var2, 4)).c();
                                                ArrayList arrayList3 = new ArrayList(gc1.M(listC3, 10));
                                                Iterator it4 = listC3.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add(rd7.d((ad2) it4.next()));
                                                }
                                                setX0 = fc1.X0(arrayList3);
                                            }
                                            Iterator it5 = a39Var.iterator();
                                            while (it5.hasNext()) {
                                                je7 je7Var = (je7) it5.next();
                                                je7Var.getClass();
                                                String strP = wm9.p();
                                                String str4 = je7Var.a;
                                                boolean z = je7Var.b;
                                                qa1 qa1Var = r95.a;
                                                ad2 ad2Var = new ad2(0, qa1Var.k().c(), qa1Var.k().c(), strP, "", str4, z);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.d(ad2Var))) {
                                                    m62Var3.K.o0(ad2Var);
                                                }
                                            }
                                            break;
                                        case 3:
                                            m62 m62Var4 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                n92 n92Var = m62Var4.z;
                                                ((qj) ((yf1) n92Var).a).q(-112717427, "DELETE FROM DbExtensionSource", (kb4) null);
                                                n92Var.w(-112717427, new sa2(25));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC4 = m62Var4.z.P().c();
                                                ArrayList arrayList4 = new ArrayList(gc1.M(listC4, 10));
                                                Iterator it6 = listC4.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(((mb2) it6.next()).a);
                                                }
                                                setX0 = fc1.X0(arrayList4);
                                            }
                                            Iterator it7 = a39Var.iterator();
                                            while (it7.hasNext()) {
                                                md7 md7Var = (md7) it7.next();
                                                if (md7Var.b.length() > 0) {
                                                    String strValueOf = String.valueOf(md7Var.a);
                                                    mb2 mb2Var = new mb2(strValueOf, md7Var.b, md7Var.d, md7Var.c, r95.a.k().c());
                                                    if (lm8Var3 != lm8Var4 || !setX0.contains(strValueOf)) {
                                                        m62Var4.z.T(mb2Var);
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            m62 m62Var5 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var5.F.Q(1, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC5 = m62Var5.F.V("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : listC5) {
                                                    if (((dc2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(gc1.M(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i92 < size) {
                                                    Object obj4 = arrayList5.get(i92);
                                                    i92++;
                                                    arrayList6.add(rd7.c((dc2) obj4));
                                                }
                                                setX0 = fc1.X0(arrayList6);
                                            }
                                            Iterator it8 = a39Var.iterator();
                                            while (it8.hasNext()) {
                                                dc2 dc2VarO = ex1.O((de7) it8.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarO))) {
                                                    m62Var5.F.m0(dc2VarO);
                                                }
                                            }
                                            break;
                                        default:
                                            m62 m62Var6 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var6.F.Q(0, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC6 = m62Var6.F.V("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : listC6) {
                                                    if (((dc2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(gc1.M(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i92 < size2) {
                                                    Object obj6 = arrayList7.get(i92);
                                                    i92++;
                                                    arrayList8.add(rd7.c((dc2) obj6));
                                                }
                                                setX0 = fc1.X0(arrayList8);
                                            }
                                            Iterator it9 = a39Var.iterator();
                                            while (it9.hasNext()) {
                                                dc2 dc2VarP = ex1.P((ge7) it9.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarP))) {
                                                    m62Var6.F.m0(dc2VarP);
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar2;
                                }
                            });
                            lc5.U(se8Var, null);
                        } finally {
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i13 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            default:
                int i15 = this.b;
                if (i15 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    yn7 yn7VarQ9 = cx1.q(yn7Var, "repositories.json");
                    lr3 lr3Var7 = hx3.a;
                    lr3Var7.getClass();
                    if (yn7VarQ9.a.exists()) {
                        se8Var = new se8(lr3Var7.y(yn7VarQ9));
                        try {
                            uf5 uf5Var7 = rd7Var.b;
                            uf5Var7.getClass();
                            final a39 a39VarW6 = fx1.W(uf5Var7, se8Var, md7.Companion.serializer());
                            final int i16 = 3;
                            ym9.l(rd7Var.a.z, new kb4() { // from class: nd7
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj2) {
                                    int i82 = i16;
                                    int i92 = 0;
                                    heb hebVar2 = heb.a;
                                    Set setX0 = sc3.a;
                                    lm8 lm8Var2 = lm8.a;
                                    a39<gd7> a39Var = a39VarW6;
                                    rd7 rd7Var3 = rd7Var;
                                    lm8 lm8Var3 = lm8Var;
                                    lm8 lm8Var4 = lm8.c;
                                    switch (i82) {
                                        case 0:
                                            m62 m62Var = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var.A.L("general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC = m62Var.A.Q("general").c();
                                                ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                                                Iterator it = listC.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(rd7.b((ob2) it.next()));
                                                }
                                                setX0 = fc1.X0(arrayList);
                                            }
                                            Iterator it2 = a39Var.iterator();
                                            while (it2.hasNext()) {
                                                ob2 ob2VarM = sw1.M((ud7) it2.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.b(ob2VarM))) {
                                                    m62Var.A.U(ob2VarM);
                                                }
                                            }
                                            break;
                                        case 1:
                                            m62 m62Var2 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                b92 b92Var = m62Var2.u;
                                                ((qj) ((yf1) b92Var).a).q(387880673, "DELETE FROM DbDownload", (kb4) null);
                                                b92Var.w(387880673, new q92(21));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC2 = m62Var2.u.U().c();
                                                ArrayList arrayList2 = new ArrayList(gc1.M(listC2, 10));
                                                Iterator it3 = listC2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(((ha2) it3.next()).b);
                                                }
                                                setX0 = fc1.X0(arrayList2);
                                            }
                                            for (gd7 gd7Var : a39Var) {
                                                gd7Var.getClass();
                                                String str = gd7Var.a;
                                                String str2 = gd7Var.b;
                                                String str3 = gd7Var.c;
                                                int i102 = gd7Var.f;
                                                ha2 ha2Var = new ha2(str, str, str2, str3, "", 0, i102, gd7Var.e, i102, 0, 4, gd7Var.h);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(str)) {
                                                    m62Var2.u.j0(ha2Var);
                                                }
                                            }
                                            break;
                                        case 2:
                                            m62 m62Var3 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var3.K.J("");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                b92 b92Var2 = m62Var3.K;
                                                b92Var2.getClass();
                                                ed2 ed2Var = ed2.a;
                                                List listC3 = new cd2(b92Var2, "", new bd2(b92Var2, 4)).c();
                                                ArrayList arrayList3 = new ArrayList(gc1.M(listC3, 10));
                                                Iterator it4 = listC3.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList3.add(rd7.d((ad2) it4.next()));
                                                }
                                                setX0 = fc1.X0(arrayList3);
                                            }
                                            Iterator it5 = a39Var.iterator();
                                            while (it5.hasNext()) {
                                                je7 je7Var = (je7) it5.next();
                                                je7Var.getClass();
                                                String strP = wm9.p();
                                                String str4 = je7Var.a;
                                                boolean z = je7Var.b;
                                                qa1 qa1Var = r95.a;
                                                ad2 ad2Var = new ad2(0, qa1Var.k().c(), qa1Var.k().c(), strP, "", str4, z);
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.d(ad2Var))) {
                                                    m62Var3.K.o0(ad2Var);
                                                }
                                            }
                                            break;
                                        case 3:
                                            m62 m62Var4 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                n92 n92Var = m62Var4.z;
                                                ((qj) ((yf1) n92Var).a).q(-112717427, "DELETE FROM DbExtensionSource", (kb4) null);
                                                n92Var.w(-112717427, new sa2(25));
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC4 = m62Var4.z.P().c();
                                                ArrayList arrayList4 = new ArrayList(gc1.M(listC4, 10));
                                                Iterator it6 = listC4.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList4.add(((mb2) it6.next()).a);
                                                }
                                                setX0 = fc1.X0(arrayList4);
                                            }
                                            Iterator it7 = a39Var.iterator();
                                            while (it7.hasNext()) {
                                                md7 md7Var = (md7) it7.next();
                                                if (md7Var.b.length() > 0) {
                                                    String strValueOf = String.valueOf(md7Var.a);
                                                    mb2 mb2Var = new mb2(strValueOf, md7Var.b, md7Var.d, md7Var.c, r95.a.k().c());
                                                    if (lm8Var3 != lm8Var4 || !setX0.contains(strValueOf)) {
                                                        m62Var4.z.T(mb2Var);
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            m62 m62Var5 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var5.F.Q(1, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC5 = m62Var5.F.V("general").c();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj3 : listC5) {
                                                    if (((dc2) obj3).e == 1) {
                                                        arrayList5.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList6 = new ArrayList(gc1.M(arrayList5, 10));
                                                int size = arrayList5.size();
                                                while (i92 < size) {
                                                    Object obj4 = arrayList5.get(i92);
                                                    i92++;
                                                    arrayList6.add(rd7.c((dc2) obj4));
                                                }
                                                setX0 = fc1.X0(arrayList6);
                                            }
                                            Iterator it8 = a39Var.iterator();
                                            while (it8.hasNext()) {
                                                dc2 dc2VarO = ex1.O((de7) it8.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarO))) {
                                                    m62Var5.F.m0(dc2VarO);
                                                }
                                            }
                                            break;
                                        default:
                                            m62 m62Var6 = rd7Var3.a;
                                            ((u2b) obj2).getClass();
                                            if (lm8Var3 == lm8Var2) {
                                                m62Var6.F.Q(0, "general");
                                            }
                                            if (lm8Var3 == lm8Var4) {
                                                List listC6 = m62Var6.F.V("general").c();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : listC6) {
                                                    if (((dc2) obj5).e == 0) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(gc1.M(arrayList7, 10));
                                                int size2 = arrayList7.size();
                                                while (i92 < size2) {
                                                    Object obj6 = arrayList7.get(i92);
                                                    i92++;
                                                    arrayList8.add(rd7.c((dc2) obj6));
                                                }
                                                setX0 = fc1.X0(arrayList8);
                                            }
                                            Iterator it9 = a39Var.iterator();
                                            while (it9.hasNext()) {
                                                dc2 dc2VarP = ex1.P((ge7) it9.next(), "general");
                                                if (lm8Var3 != lm8Var4 || !setX0.contains(rd7.c(dc2VarP))) {
                                                    m62Var6.F.m0(dc2VarP);
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar2;
                                }
                            });
                            lc5.U(se8Var, null);
                        } finally {
                        }
                    }
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i15 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}
