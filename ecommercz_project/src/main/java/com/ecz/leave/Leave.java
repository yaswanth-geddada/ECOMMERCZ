package com.ecz.leave;

class Leave{
    private String leaveId;
    private String startDate;
    private String endDate;
    private String leaveType;
    private String reason;
    private String status;
    private String AppliedOn;

    public Leave(String leaveId, String startDate, String endDate, String leaveType, String reason, String status,
            String appliedOn) {
        this.leaveId = leaveId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveType = leaveType;
        this.reason = reason;
        this.status = status;
        AppliedOn = appliedOn;
    }

    public String getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppliedOn() {
        return AppliedOn;
    }

    public void setAppliedOn(String appliedOn) {
        AppliedOn = appliedOn;
    }

    @Override
    public String toString() {
        return "leave [AppliedOn=" + AppliedOn + ", endDate=" + endDate + ", leaveId=" + leaveId + ", leaveType="
                + leaveType + ", reason=" + reason + ", startDate=" + startDate + ", status=" + status + "]";
    }

}
