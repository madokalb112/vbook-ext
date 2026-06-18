package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class DoLoop extends Loop {
    private AstNode condition;
    private int whilePosition;

    public DoLoop() {
        this.whilePosition = -1;
        this.type = Token.DO;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public int getWhilePosition() {
        return this.whilePosition;
    }

    public void setCondition(AstNode astNode) {
        assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    public void setWhilePosition(int i) {
        this.whilePosition = i;
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        sb.append("do ");
        if (getInlineComment() != null) {
            sb.append(getInlineComment().toSource(i + 1));
            sb.append("\n");
        }
        sb.append(this.body.toSource(i).trim());
        sb.append(" while (");
        sb.append(this.condition.toSource(0));
        sb.append(");\n");
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.body.visit(nodeVisitor);
            this.condition.visit(nodeVisitor);
        }
    }

    public DoLoop(int i) {
        super(i);
        this.whilePosition = -1;
        this.type = Token.DO;
    }

    public DoLoop(int i, int i2) {
        super(i, i2);
        this.whilePosition = -1;
        this.type = Token.DO;
    }
}
