package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class l49 implements ib4 {
    public final /* synthetic */ int a;

    public /* synthetic */ l49(int i) {
        this.a = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        switch (this.a) {
            case 0:
                return dk9.x(Boolean.FALSE);
            case 1:
                return dk9.x(Boolean.FALSE);
            case 2:
                return dk9.x(Boolean.FALSE);
            case 3:
                return dk9.x(Boolean.FALSE);
            case 4:
                return dk9.x(Boolean.FALSE);
            case 5:
                try {
                    return fe.l0(f39.r0(f39.n0(Arrays.asList(new fl5()).iterator())));
                } finally {
                }
            case 6:
                try {
                    return fe.l0(f39.r0(f39.n0(Arrays.asList(new cf4()).iterator())));
                } finally {
                }
            case 7:
                return new qa7("com.reader.app.ui.screen.setting.SettingConnectionRoute", t69.INSTANCE, new Annotation[0]);
            case 8:
                return new qa7("com.reader.app.ui.screen.setting.SettingContextMenuRoute", u69.INSTANCE, new Annotation[0]);
            case 9:
                return new qa7("com.reader.app.ui.screen.setting.SettingDomainOverrideRoute", v69.INSTANCE, new Annotation[0]);
            case 10:
                return new qa7("com.reader.app.ui.screen.setting.SettingFontListRoute", x69.INSTANCE, new Annotation[0]);
            case 11:
                return new qa7("com.reader.app.ui.screen.setting.SettingFontRoute", y69.INSTANCE, new Annotation[0]);
            case 12:
                return new qa7("com.reader.app.ui.screen.setting.SettingLanguageRoute", z69.INSTANCE, new Annotation[0]);
            case 13:
                return new qa7("com.reader.app.ui.screen.setting.SettingLookupRoute", a79.INSTANCE, new Annotation[0]);
            case 14:
                return new qa7("com.reader.app.ui.screen.setting.SettingNotificationRoute", c79.INSTANCE, new Annotation[0]);
            case 15:
                return new qa7("com.reader.app.ui.screen.setting.SettingQtLookupRoute", d79.INSTANCE, new Annotation[0]);
            case 16:
                return new qa7("com.reader.app.ui.screen.setting.SettingQtTranslateRoute", e79.INSTANCE, new Annotation[0]);
            case 17:
                return new qa7("com.reader.app.ui.screen.setting.SettingReaderRoute", f79.INSTANCE, new Annotation[0]);
            case 18:
                return new qa7("com.reader.app.ui.screen.setting.SettingStatisticRoute", p79.INSTANCE, new Annotation[0]);
            case 19:
                return new qa7("com.reader.app.ui.screen.setting.SettingSyncRoute", q79.INSTANCE, new Annotation[0]);
            case 20:
                return new qa7("com.reader.app.ui.screen.setting.SettingTTSBackgroundMusicRoute", r79.INSTANCE, new Annotation[0]);
            case 21:
                return new qa7("com.reader.app.ui.screen.setting.SettingTTSReplaceWordRoute", s79.INSTANCE, new Annotation[0]);
            case 22:
                return new qa7("com.reader.app.ui.screen.setting.SettingTTSRoute", t79.INSTANCE, new Annotation[0]);
            case 23:
                return new qa7("com.reader.app.ui.screen.setting.SettingThemeRoute", u79.INSTANCE, new Annotation[0]);
            case 24:
                return new qa7("com.reader.app.ui.screen.setting.SettingTocRuleRoute", v79.INSTANCE, new Annotation[0]);
            case 25:
                return new qa7("com.reader.app.ui.screen.setting.SettingTranslateRoute", w79.INSTANCE, new Annotation[0]);
            case 26:
                return new qa7("com.reader.app.ui.screen.setting.SettingTurnPageRoute", x79.INSTANCE, new Annotation[0]);
            case 27:
                return new qa7("com.reader.app.ui.screen.setting.SettingUserRoute", y79.INSTANCE, new Annotation[0]);
            case 28:
                return new i99();
            default:
                return new i99();
        }
    }
}
