package org.mozilla.javascript.ast;

import defpackage.j39;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ParenthesizedExpression extends AstNode {
    private AstNode expression;

    public ParenthesizedExpression(AstNode astNode) {
        this(astNode != null ? astNode.getPosition() : 0, astNode != null ? astNode.getLength() : 1, astNode);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return j39.A(makeIndent(i), "(", this.expression.toSource(0), ")");
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public ParenthesizedExpression(int i) {
        super(i);
        this.type = 96;
    }

    public ParenthesizedExpression(int i, int i2) {
        super(i, i2);
        this.type = 96;
    }

    public ParenthesizedExpression() {
        this.type = 96;
    }

    public ParenthesizedExpression(int i, int i2, AstNode astNode) {
        super(i, i2);
        this.type = 96;
        setExpression(astNode);
    }
}
