package com.ecz.leave;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class LeaveMapper implements ResultSetMapper<Leave> {

    @Override
    public Leave map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
        String leaveId = resultSet.getString("Leave_ID");
        String startDate = resultSet.getString("START_DATE");
        String endDate = resultSet.getString("END_DATE");
        String leaveType = resultSet.getString("LEAVE_TYPE");
        String reason = resultSet.getString("REASON");
        String status = resultSet.getString("STATUS");
        String AppliedOn = resultSet.getString("APPLIED_ON");

        //leaveId,startDate,endDate,leaveType,reason,status,AppliedOn

        Leave leave = new Leave(leaveId,startDate,endDate,leaveType,reason,status,AppliedOn);

        return leave;

    }

}
