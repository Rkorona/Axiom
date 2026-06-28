package com.server.auditor.ssh.client.models.databinding;

import androidx.lifecycle.i1;
import androidx.lifecycle.k0;
import com.server.auditor.ssh.client.database.models.RuleDBModel;

/* JADX INFO: loaded from: classes3.dex */
public class PortForwardingRuleViewModel extends i1 {
    private k0 mRuleType = new k0();
    private k0 mLocalPort = new k0();
    private k0 mRemotePort = new k0();
    private k0 mHostId = new k0();
    private k0 mHost = new k0();
    private k0 mBoundAddress = new k0();
    private k0 mLabel = new k0();

    public PortForwardingRuleViewModel() {
        setRuleType("Local Rule");
    }

    public String getBoundAddress() {
        return (String) this.mBoundAddress.f();
    }

    public String getHost() {
        return (String) this.mHost.f();
    }

    public Long getHostId() {
        return (Long) this.mHostId.f();
    }

    public String getLabel() {
        return (String) this.mLabel.f();
    }

    public Integer getLocalPort() {
        return (Integer) this.mLocalPort.f();
    }

    public String getLocalPortAsString() {
        return this.mLocalPort.f() == null ? "" : ((Integer) this.mLocalPort.f()).toString();
    }

    public Integer getRemotePort() {
        return (Integer) this.mRemotePort.f();
    }

    public String getRemotePortAsString() {
        return this.mRemotePort.f() == null ? "" : ((Integer) this.mRemotePort.f()).toString();
    }

    public k0 getRuleLiveData() {
        return this.mRuleType;
    }

    public String getRuleType() {
        return (String) this.mRuleType.f();
    }

    public void initFromModel(RuleDBModel ruleDBModel) {
        if (ruleDBModel == null) {
            return;
        }
        setRuleType(ruleDBModel.getType());
        setHostId(Long.valueOf(ruleDBModel.getHostId()));
        setLocalPort(Integer.valueOf(ruleDBModel.getLocalPort()));
        setRemotePort(Integer.valueOf(ruleDBModel.getRemotePort()));
        setHost(ruleDBModel.getHost());
        setBoundAddress(ruleDBModel.getBoundAddress());
        setLabel(ruleDBModel.getLabel());
    }

    public void setBoundAddress(String str) {
        this.mBoundAddress.p(str);
    }

    public void setHost(String str) {
        this.mHost.p(str);
    }

    public void setHostId(Long l10) {
        this.mHostId.p(l10);
    }

    public void setLabel(String str) {
        this.mLabel.p(str);
    }

    public void setLocalPort(Integer num) {
        this.mLocalPort.p(num);
    }

    public void setRemotePort(Integer num) {
        this.mRemotePort.p(num);
    }

    public void setRuleType(String str) {
        this.mRuleType.p(str);
    }

    public RuleDBModel toDBModel() {
        return new RuleDBModel(((Long) this.mHostId.f()).longValue(), (String) this.mRuleType.f(), (String) this.mBoundAddress.f(), this.mLocalPort.f() != null ? ((Integer) this.mLocalPort.f()).intValue() : 0, (String) this.mHost.f(), this.mRemotePort.f() != null ? ((Integer) this.mRemotePort.f()).intValue() : 0, (String) this.mLabel.f());
    }
}
