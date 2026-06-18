package nl.adaptivity.xmlutil;

import defpackage.a4c;
import defpackage.ke3;
import defpackage.lh3;
import defpackage.mh3;
import defpackage.nh3;
import defpackage.oh3;
import defpackage.ph3;
import defpackage.qh3;
import defpackage.qx1;
import defpackage.rh3;
import defpackage.sh3;
import defpackage.th3;
import defpackage.uh3;
import defpackage.v3c;
import defpackage.vh3;
import defpackage.w3c;
import defpackage.wh3;
import defpackage.x3c;
import defpackage.zf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class EventType {
    private static final /* synthetic */ ke3 $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType ATTRIBUTE;
    public static final EventType CDSECT;
    public static final EventType COMMENT;
    public static final EventType DOCDECL;
    public static final EventType END_DOCUMENT;
    public static final EventType END_ELEMENT;
    public static final EventType ENTITY_REF;
    public static final EventType IGNORABLE_WHITESPACE;
    public static final EventType PROCESSING_INSTRUCTION;
    public static final EventType START_DOCUMENT;
    public static final EventType START_ELEMENT;
    public static final EventType TEXT;

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{START_DOCUMENT, START_ELEMENT, END_ELEMENT, COMMENT, TEXT, CDSECT, DOCDECL, END_DOCUMENT, ENTITY_REF, IGNORABLE_WHITESPACE, ATTRIBUTE, PROCESSING_INSTRUCTION};
    }

    static {
        zf2 zf2Var = null;
        START_DOCUMENT = new uh3("START_DOCUMENT", 0, zf2Var);
        START_ELEMENT = new vh3("START_ELEMENT", 1, zf2Var);
        END_ELEMENT = new qh3("END_ELEMENT", 2, zf2Var);
        COMMENT = new nh3("COMMENT", 3, zf2Var);
        TEXT = new wh3("TEXT", 4, zf2Var);
        CDSECT = new mh3("CDSECT", 5, zf2Var);
        DOCDECL = new oh3("DOCDECL", 6, zf2Var);
        END_DOCUMENT = new ph3("END_DOCUMENT", 7, zf2Var);
        ENTITY_REF = new rh3("ENTITY_REF", 8, zf2Var);
        IGNORABLE_WHITESPACE = new sh3("IGNORABLE_WHITESPACE", 9, zf2Var);
        ATTRIBUTE = new lh3("ATTRIBUTE", 10, zf2Var);
        PROCESSING_INSTRUCTION = new th3("PROCESSING_INSTRUCTION", 11, zf2Var);
        EventType[] eventTypeArr$values = $values();
        $VALUES = eventTypeArr$values;
        $ENTRIES = qx1.t(eventTypeArr$values);
    }

    public /* synthetic */ EventType(String str, int i, zf2 zf2Var) {
        this(str, i);
    }

    public static ke3 getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    public abstract w3c createEvent(x3c x3cVar);

    public boolean isIgnorable() {
        return false;
    }

    public boolean isTextElement() {
        return false;
    }

    public void writeEvent(a4c a4cVar, v3c v3cVar) {
        a4cVar.getClass();
        v3cVar.getClass();
        throw new UnsupportedOperationException("This is not generally supported, only by text types");
    }

    public abstract void writeEvent(a4c a4cVar, x3c x3cVar);

    private EventType(String str, int i) {
    }
}
